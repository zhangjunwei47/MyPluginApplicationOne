package com.example.kaola.myrepluginpluginapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.test_view).postDelayed(new Runnable() {
            @Override
            public void run() {
                showFragment();
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


    private void showFragment() {
        FirstTestFragment f1 = new FirstTestFragment();
        getFragmentManager().beginTransaction().add(R.id.fragment_layout, f1).commit();
    }
}
