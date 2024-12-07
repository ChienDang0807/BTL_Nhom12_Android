package com.example.btl_nhom12;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import android.database.sqlite.*;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        getWidget();
    }
    private void getWidget() {
        cardthongtin = findViewById(R.id.thongtincanhan);
        cardthongtin.setOnClickListener(this);
    }
    SQLiteDatabase database;
    CardView cardthongtin, cardtheodoi, carddexuat, cardtrogiup;
    @Override
    public void onClick(View view) {
        if(cardthongtin == view)
        {
            Intent intent = new Intent(this,thongtincanhan.class);
            startActivity(intent);
        }


    }
}