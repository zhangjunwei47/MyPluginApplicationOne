package com.example.kaola.myrepluginpluginapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by zhangchao on 2018/2/24.
 */

public class MyServiceTest extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Log.e("logx","xxxxxxxx service oncreate");
    }
}
