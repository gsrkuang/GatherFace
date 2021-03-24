package com.colin.face.activity;

import android.os.Bundle;

import com.colin.face.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    void afterRequestPermission(int requestCode, boolean isAllGranted) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}