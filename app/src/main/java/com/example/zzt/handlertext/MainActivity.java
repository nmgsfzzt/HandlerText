package com.example.zzt.handlertext;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Handler mHandler1;
    private Handler mHandler2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHandler1 = new Handler();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Looper.prepare();
                mHandler2 = new Handler();
            }
        }).start();
    }
}
