package com.example.text_and_button_practice;

import androidx.appcompat.app.AppCompatActivity;
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
    static TextView txt;
    static float text_main_size;
    public void button_bigger(View v){
        txt = (TextView) findViewById(R.id.text_main);
        txt.setText("Hello, B0742006.");
        text_main_size = txt.getTextSize();
        text_main_size+=3;
        txt.setTextSize(TypedValue.COMPLEX_UNIT_PX, text_main_size);

    }
    public void button_smaller(View v){
        txt = (TextView) findViewById(R.id.text_main);
        txt.setText("Hello, B0742006.");
        text_main_size = txt.getTextSize();
        text_main_size-=3;
        txt.setTextSize(TypedValue.COMPLEX_UNIT_PX, text_main_size);

    }
}