package com.nguyenvannhat.test;

import android.content.Context;
import android.content.Intent;

class LaunchEmailUtil {

  public static void launchEmailToIntent(Context context) {
    Intent msg = new Intent(Intent.ACTION_SEND);

    StringBuilder body = new StringBuilder("\n\n----------\n");
    body.append(EnvironmentInfoUtil.getApplicationInfo(context));

    msg.putExtra(Intent.EXTRA_EMAIL,"feed@back.com".split(", "));
    msg.putExtra(Intent.EXTRA_SUBJECT,"feedback_subject");
    msg.putExtra(Intent.EXTRA_TEXT, body.toString());

    msg.setType("message/rfc822");
    context.startActivity(Intent.createChooser(msg,"send email"));

  }
}