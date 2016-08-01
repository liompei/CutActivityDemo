package com.liompei.cutactivitydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class BtnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn1);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.normal_out, R.anim.finish_out);
    }
}
