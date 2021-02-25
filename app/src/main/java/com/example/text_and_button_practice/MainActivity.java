package com.example.text_and_button_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("StaticFieldLeak")        //IDE教我這麼座以防止Memory leak
    static TextView txt;
    static float text_main_size;

    public void button_bigger(View v) {  //這個View是必須的，傳物件用途
        txt = (TextView) findViewById(R.id.text_main);
        txt.setText("Hello, B0742006.");
        text_main_size = txt.getTextSize() + 3;
        txt.setTextSize(TypedValue.COMPLEX_UNIT_PX, text_main_size);
    }

    public void button_smaller(View v) {
        txt = (TextView) findViewById(R.id.text_main);
        txt.setText("Hello, B0742006.");
        text_main_size = txt.getTextSize() - 3;
        txt.setTextSize(TypedValue.COMPLEX_UNIT_PX, text_main_size);
    }
}