package ru.mirea.veselova.practice3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String string = getIntent().getExtras().get("hello").toString();

        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(string);
    }
}