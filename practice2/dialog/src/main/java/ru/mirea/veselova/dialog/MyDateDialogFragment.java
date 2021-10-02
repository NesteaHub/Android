package ru.mirea.veselova.dialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyDateDialogFragment extends DialogFragment {
    int day = 1;
    int month = 0;
    int year = 2022;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        DatePickerDialog.OnDateSetListener listener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int d, int m, int y) {
                day = d;
                month = m;
                year = y;
                ((MainActivity)getActivity()).onDateClicked(day, month, year);
            }
        };

        DatePickerDialog dpd = new DatePickerDialog((getActivity()), listener, year, month, day);

        dpd.show();

        return dpd;
    }
}
