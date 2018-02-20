package com.example.kaola.myrepluginpluginapplication;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qihoo360.replugin.RePlugin;

/**
 * Created by zhaojing on 2018/2/20.
 */

public class FirstTestFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        /**
         * 特别注意 需要注意不能使用inflater及container因为他们的Context是宿主的, 但是作为单独的apk. 获取为空.
         */
        Context context = RePlugin.getPluginContext();
        if (context == null) {
            context = getActivity();
        }
        return LayoutInflater.from(context).inflate(R.layout.first_test_fragment, container, false);
    }
}
