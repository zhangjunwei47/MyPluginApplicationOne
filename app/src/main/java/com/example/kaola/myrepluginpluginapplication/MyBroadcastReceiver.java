package com.example.kaola.myrepluginpluginapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by zhangchao on 2018/2/24.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String msg = intent.getAction();
        if (msg != null && msg.equals("com.kaola.broadcast.test")) {
            Log.e("logx", "收到 广播消息");
        }
    }
}
