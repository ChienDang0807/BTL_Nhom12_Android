package com.example.btl_nhom12;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class thongtincanhan extends AppCompatActivity implements View.OnClickListener {
    ImageView btnngaysinh;
    private int style = AlertDialog.THEME_HOLO_DARK;
    TextView txthoten, txtngaysinh, txtmail, txtsdt, txtmatkhau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_thongtincanhan);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        getWidget();
        getDateNow();
    }

    private void getDateNow() {
        Calendar c = Calendar.getInstance();
        int yy = c.get(Calendar.YEAR);
        int mm = c.get(Calendar.MONTH);
        int dd = c.get(Calendar.DAY_OF_MONTH);
        txtngaysinh.setText(dd+"/"+(mm + 1)+"/"+yy);
    }


    private void getWidget() {
        btnngaysinh = findViewById(R.id.calngaysinh);
        btnngaysinh.setOnClickListener(this);
        txtngaysinh = findViewById(R.id.txtngaysinh);
    }

    @Override
    public void onClick(View view) {
        if( btnngaysinh == view)
        {
                Calendar c = Calendar.getInstance();
                int yy = c.get(Calendar.YEAR);
                int mm = c.get(Calendar.MONTH);
                int dd = c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog;
                datePickerDialog = new DatePickerDialog(this, style, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int t, int m, int d) {
                        txtngaysinh.setText(d+"/"+(m+1)+"/"+ t);
                    }
                },yy,mm,dd);
                datePickerDialog.show();
            }
        }
    }
