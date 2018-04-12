package com.example.kaola.myrepluginpluginapplication;

import android.app.Application;
import android.util.Log;

import xiaofei.library.hermeseventbus.HermesEventBus;

/**
 * Created by zhangchao on 2018/2/22.
 */

public class MyPluginApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("logx", "onCreate: xxxxxxxxx " );
        HermesEventBus.getDefault().connectApp(this, "com.example.kaola.myrepluginhostapplication");
        Log.e("logx", "onCreate: xxxxxxxxx 完事" );
    }
}
