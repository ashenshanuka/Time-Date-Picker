package com.example.practical7;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    private TimePicker timePicker;
    private TextView textViewTime;

    // Change this value and run the application again.
    private boolean is24HView = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textViewTime = (TextView) this.findViewById(R.id.textView_time);
        this.timePicker = (TimePicker) this.findViewById(R.id.timePicker);
        this.timePicker.setIs24HourView(this.is24HView);

        this.timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                textViewTime.setText(hourOfDay + ":" + minute);
            }
        });
    }

}