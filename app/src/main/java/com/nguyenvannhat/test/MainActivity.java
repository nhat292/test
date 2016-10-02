package com.nguyenvannhat.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StringBuilder stringBuilder = new StringBuilder("\n\n----------------\n");
        stringBuilder.append(EnvironmentInfoUtil.getApplicationInfo(getApplicationContext()));
        Log.d("INFO", stringBuilder.toString());
        int a = 0x00000064;
        Log.d("VALUE", a + "");

    }
}
