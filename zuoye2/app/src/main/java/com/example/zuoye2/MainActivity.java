package com.example.zuoye2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView a_marquee;
    private boolean aBoolean=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a_marquee=findViewById(R.id.a_marquee);
        a_marquee.setOnClickListener(this);
        a_marquee.setSelected(true);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.a_marquee){
            if(aBoolean==true){
                a_marquee.setSelected(false);
                aBoolean=false;
            }else if(aBoolean==false) {
                a_marquee.setSelected(true);
                aBoolean=true;
            }
        }
    }
}