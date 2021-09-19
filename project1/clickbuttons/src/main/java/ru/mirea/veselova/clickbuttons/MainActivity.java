package ru.mirea.veselova.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button buttonOk;
    private Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // находим view-элементы
        textView = (TextView) findViewById(R.id.tvOut);
        buttonOk = (Button) findViewById(R.id.btnOk);
        buttonCancel = (Button) findViewById(R.id.btnCancel);

       View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Нажата кнопка OK");
            }
        };
        // присваиваем обработчик кнопке OK (btnOk)
        buttonOk.setOnClickListener(oclBtnOk);
    }

    public void oclBtnCancel (View v) {
        textView.setText("Нажата кнопка Cancel");
    }

  /*   public void oclBtnOk (View v) {
        textView.setText("Нажата кнопка OK");
    }*/
}