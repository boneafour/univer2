package com.example.user.univer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.user.univer.TxtLecture.TxtLecture1;
import com.example.user.univer.TxtLecture.TxtLecture10;
import com.example.user.univer.TxtLecture.TxtLecture2;
import com.example.user.univer.TxtLecture.TxtLecture3;
import com.example.user.univer.TxtLecture.TxtLecture4;
import com.example.user.univer.TxtLecture.TxtLecture5;
import com.example.user.univer.TxtLecture.TxtLecture6;
import com.example.user.univer.TxtLecture.TxtLecture7;
import com.example.user.univer.TxtLecture.TxtLecture8;
import com.example.user.univer.TxtLecture.TxtLecture9;

public class Lecture extends Activity implements View.OnClickListener {

    private ImageButton btnBack;
    private TextView txtTitle, txtLecture10, txtLecture9, txtLecture8, txtLecture7, txtLecture6, txtLecture5, txtLecture4, txtLecture3, txtLecture2, txtLecture1;


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


        txtLecture7 = (TextView) findViewById(R.id.txtLecture7);
        txtLecture7.setText("Аустралия материгі");
        txtLecture7.setOnClickListener(this);


        txtLecture8 = (TextView) findViewById(R.id.txtLecture8);
        txtLecture8.setText("ТМД елдеріне жалпы шолу");
        txtLecture8.setOnClickListener(this);


        txtLecture9 = (TextView) findViewById(R.id.txtLecture9);
        txtLecture9.setText("Литосфера, жер бедері");
        txtLecture9.setOnClickListener(this);


        txtLecture10 = (TextView) findViewById(R.id.txtLecture10);
        txtLecture10.setText("Атмосфера және климат");
        txtLecture10.setOnClickListener(this);

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
                startActivity(new Intent(Lecture.this, TxtLecture1.class));
                break;
            case R.id.txtLecture2:
                startActivity(new Intent(Lecture.this, TxtLecture2.class));
                break;
            case R.id.txtLecture3:
                startActivity(new Intent(Lecture.this, TxtLecture3.class));
                break;
            case R.id.txtLecture4:
                startActivity(new Intent(Lecture.this, TxtLecture4.class));
                break;
            case R.id.txtLecture5:
                startActivity(new Intent(Lecture.this, TxtLecture5.class));
                break;
            case R.id.txtLecture6:
                startActivity(new Intent(Lecture.this, TxtLecture6.class));
                break;

            case R.id.txtLecture7:
                startActivity(new Intent(Lecture.this, TxtLecture7.class));
                break;

            case R.id.txtLecture8:
                startActivity(new Intent(Lecture.this, TxtLecture8.class));
                break;

            case R.id.txtLecture9:
                startActivity(new Intent(Lecture.this, TxtLecture9.class));
                break;

            case R.id.txtLecture10:
                startActivity(new Intent(Lecture.this, TxtLecture10.class));
                break;


        }
    }
}
