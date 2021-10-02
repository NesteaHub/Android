package ru.mirea.veselova.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyTimeDialogFragment extends DialogFragment{
    int hr = 0;
    int mnt = 0;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        TimePickerDialog.OnTimeSetListener listener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
                hr = hourOfDay;
                mnt = minute;
                ((MainActivity)getActivity()).onTimeClicked(hr, mnt);
            }
        };
        TimePickerDialog tpd = new TimePickerDialog((getActivity()), listener, hr, mnt, true);

        tpd.show();

        return tpd;
    }
}