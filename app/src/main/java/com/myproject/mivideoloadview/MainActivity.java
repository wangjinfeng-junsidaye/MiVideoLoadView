package com.myproject.mivideoloadview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnStart;

    private MyVideoView myVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart = (Button) findViewById(R.id.btn_start);
        btnStart.setOnClickListener(this);
        myVideoView = (MyVideoView) findViewById(R.id.myloadview);
    }

    @Override
    public void onClick(View v) {
        myVideoView.startTranglesAnimation();
    }
}
