package com.nguyenvannhat.test;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;

/**
 * Created by nhat2 on 09/30/2016.
 */
public class EnvironmentInfoUtil {
    public static String getApplicationInfo(Context context) {
        return String.format("%s\n%s\n%s\n%s\n%s\n%s\n",
                getCountry(context), getBrandInfo(), getModelInfo(),
                getDeviceInfo(), getVersionInfo(context), getLocale(context));
    }

    public static String getCountry(Context context) {
        TelephonyManager mTelephonyMgr = (TelephonyManager) context
                .getSystemService(Context.TELEPHONY_SERVICE);
        return String.format("Country: %s",
                mTelephonyMgr.getNetworkCountryIso());
    }

    public static String getModelInfo() {
        return String.format("Model: %s", Build.MODEL);
    }

    public static String getBrandInfo() {
        return String.format("Brand: %s", Build.BRAND);
    }

    public static String getDeviceInfo() {
        return String.format("Device: %s", Build.DEVICE);
    }

    public static String getLocale(Context context) {
        return String.format("Locale: %s", context.getResources()
                .getConfiguration().locale.getDisplayName());
    }

    public static String getVersionInfo(Context context) {
        String version = null;

        try {
            PackageInfo info = context.getPackageManager().getPackageInfo(
                    context.getPackageName(), 0);
            version = info.versionName + " (release " + info.versionCode
                    + ")";
        } catch (PackageManager.NameNotFoundException e) {
            version = "not_found";
        }

        return String.format("Version: %s", version);
    }
}
