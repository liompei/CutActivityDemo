package com.liompei.cutactivitydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:  //浅入浅出
                startActivity(new Intent(this, BtnActivity.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

                break;
            case R.id.btn2:  // 由左向右滑入的效果
                startActivity(new Intent(this, BtnActivity.class));
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
                break;

            case R.id.btn3:
                startActivity(new Intent(this, BtnActivity.class));
                overridePendingTransition(R.anim.my_in, R.anim.my_out);
                break;
            case R.id.btn4:
                startActivity(new Intent(this, BtnActivity.class));
                overridePendingTransition(R.anim.zoom_one_in, R.anim.zoom_one_out);
                break;
            case R.id.btn5:
                startActivity(new Intent(this, BtnActivity.class));
                overridePendingTransition(R.anim.zoom_two_in, R.anim.zoom_two_out);
                break;
            case R.id.btn6:

                startActivity(new Intent(MainActivity.this, BtnActivity.class));
                overridePendingTransition(R.anim.normal_in, R.anim.normal_out);
                break;
            case R.id.btn7:
                startActivity(new Intent(MainActivity.this, BtnActivity.class));
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

                break;

        }
    }
}
