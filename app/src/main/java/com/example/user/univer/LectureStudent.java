package com.example.user.univer;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.user.univer.TxtLecture.TxtLecture11;
import com.example.user.univer.TxtLecture.TxtLecture22;
import com.example.user.univer.TxtLecture.TxtLecture33;
import com.example.user.univer.TxtLecture.TxtLecture44;
import com.example.user.univer.TxtLecture.TxtLecture55;
import com.example.user.univer.TxtLecture.TxtLecture66;

import java.util.ArrayList;
import java.util.List;

public class LectureStudent extends Activity implements View.OnClickListener {


    private ImageButton btnBack;
    private TextView txtTitle, txtLecture6, txtLecture5, txtLecture4, txtLecture3, txtLecture2, txtLecture1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_list1);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText(getString(R.string.lecture));

        txtLecture1 = (TextView) findViewById(R.id.txtLecture1);
        txtLecture1.setText("Д.Ж. саяси картасы");
        txtLecture1.setOnClickListener(this);

        txtLecture2 = (TextView) findViewById(R.id.txtLecture2);
        txtLecture2.setText("Дүниежүзілік шаруашылық жүйесі");
        txtLecture2.setOnClickListener(this);

        txtLecture3 = (TextView) findViewById(R.id.txtLecture3);
        txtLecture3.setText("Дүниежүзінің табиғат ресурстары");
        txtLecture3.setOnClickListener(this);

        txtLecture4 = (TextView) findViewById(R.id.txtLecture4);
        txtLecture4.setText("Дүние жүзі халқының саны");
        txtLecture4.setOnClickListener(this);

        txtLecture5 = (TextView) findViewById(R.id.txtLecture5);
        txtLecture5.setText("Материалдық және рухани игіліктер");
        txtLecture5.setOnClickListener(this);

        txtLecture6 = (TextView) findViewById(R.id.txtLecture6);
        txtLecture6.setText("Конспект");
        txtLecture6.setOnClickListener(this);

        btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBack:
                NavUtils.navigateUpFromSameTask(this);
                break;
            case R.id.txtLecture1:
                startActivity(new Intent(LectureStudent.this, TxtLecture11.class));
                break;
            case R.id.txtLecture2:
                startActivity(new Intent(LectureStudent.this, TxtLecture22.class));
                break;
            case R.id.txtLecture3:
                startActivity(new Intent(LectureStudent.this, TxtLecture33.class));
                break;
            case R.id.txtLecture4:
                startActivity(new Intent(LectureStudent.this, TxtLecture44.class));
                break;
            case R.id.txtLecture5:
                startActivity(new Intent(LectureStudent.this, TxtLecture55.class));
                break;
            case R.id.txtLecture6:
                startActivity(new Intent(LectureStudent.this, TxtLecture66.class));
                break;
        }
    }

}