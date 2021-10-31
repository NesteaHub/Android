package ru.mirea.veselova.practice3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        long dateInMillis = System.currentTimeMillis();
        String format = "yyyy-MM-dd HH:mm:ss";
        final SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateString = sdf.format(new Date(dateInMillis));

        TextView tv = (TextView)findViewById(R.id.tv);
        tv.setText("Activity 1");

        // создание объекта Intent для запуска SecondActivity
        Intent intent = new Intent(this, MainActivity2.class);
        // передача объекта с ключом "hello"
        intent.putExtra("hello", dateString);
        // запуск SecondActivity
        startActivity(intent);
    }
}