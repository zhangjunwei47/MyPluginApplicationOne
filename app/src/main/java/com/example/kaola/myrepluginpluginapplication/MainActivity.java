package com.example.kaola.myrepluginpluginapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.example.kaola.mypluginapplicationtwo.IMyAidlInterface;
import com.qihoo360.replugin.RePlugin;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.test_view).postDelayed(new Runnable() {
            @Override
            public void run() {
                aidlTest();
                showFragment();
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MyServiceTest.class);
                startService(intent);
            }
        }, 2000);

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Nullable
    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }

    private void aidlTest()
    {
        IBinder iBinder = RePlugin.fetchBinder("com.example.kaola.mypluginapplicationtwo", "MyAidlTest");
        if(iBinder == null)
        {
            return;
        }

        IMyAidlInterface iMyAidlInterface = IMyAidlInterface.Stub.asInterface(iBinder);
        try {
            iMyAidlInterface.basicTypes(10000, 0, false,0,0,"我是plugin one");
        }catch (Exception e)
        {
            Log.e("logx","xxxxxx e = "+ e.getMessage());
        }
    }

    private void showFragment() {
        FirstTestFragment f1 = new FirstTestFragment();
        getFragmentManager().beginTransaction().add(R.id.fragment_layout, f1).commit();
    }
}
