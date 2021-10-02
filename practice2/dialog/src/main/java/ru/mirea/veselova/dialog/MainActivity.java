package ru.mirea.veselova.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDialog(View view) {
        MyDialogFragment dialogFragment = new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onClickShowTime(View view) {
        MyTimeDialogFragment time = new MyTimeDialogFragment();
        time.show(getSupportFragmentManager(), "mirea");
    }

    public void onTimeClicked(int hour, int minute) {
        Toast.makeText(getApplicationContext(), "What time is it?  " + String.valueOf(hour) + " : " + String.valueOf(minute),
                Toast.LENGTH_LONG).show();
    }

    public void onClickShowDate(View view) {
        MyDateDialogFragment date = new MyDateDialogFragment();
        date.show(getSupportFragmentManager(), "mirea");
    }

    public void onDateClicked(int day, int month, int year) {
        Toast.makeText(getApplicationContext(), "What day is it?  " + String.valueOf(year) + " . "
                        + String.valueOf(month+1) + " . " + String.valueOf(day),
                Toast.LENGTH_LONG).show();
    }

    public void onClickShowProgress(View view) {
        MyProgressDialogFragment prog = new MyProgressDialogFragment();
        prog.show(getSupportFragmentManager(), "mirea");
    }
}