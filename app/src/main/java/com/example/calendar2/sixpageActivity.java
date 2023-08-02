package com.example.calendar2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class sixpageActivity extends AppCompatActivity {
    CalendarView cal;
    TextView tv_text;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixpage);

        cal = findViewById(R.id.cal);
        tv_text = findViewById(R.id.tv_text);
        imageView = findViewById(R.id.imageView4);

        cal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                tv_text.setText(year + "년 " + (month + 1) + "월 " + day + "일 ");
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), fifteenpageActivity.class);
                startActivity(intent);
            }
        });
    }
}
