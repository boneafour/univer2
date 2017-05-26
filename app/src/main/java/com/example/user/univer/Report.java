package com.example.user.univer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.user.univer.Test.Test1;
import com.example.user.univer.Test.Test10;
import com.example.user.univer.Test.Test2;
import com.example.user.univer.Test.Test3;
import com.example.user.univer.Test.Test4;
import com.example.user.univer.Test.Test5;
import com.example.user.univer.Test.Test6;
import com.example.user.univer.Test.Test7;
import com.example.user.univer.Test.Test8;
import com.example.user.univer.Test.Test9;

/**
 * Created by user on 14.06.2016.
 */
public class Report extends Activity implements View.OnClickListener {

    private TextView txtTitle;
    private ImageButton btnBack;
    private Button  txtTest1, txtTest2, txtTest3, txtTest4, txtTest5, txtTest6, txtTest7, txtTest8, txtTest9, txtTest10;
    String sName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText(getString(R.string.report));

        Intent intent = getIntent();
        sName = intent.getStringExtra("sName");

        btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

        txtTest1 = (Button) findViewById(R.id.test1);
        txtTest1.setOnClickListener(this);
        txtTest2 = (Button) findViewById(R.id.test2);
        txtTest2.setOnClickListener(this);
        txtTest3 = (Button) findViewById(R.id.test3);
        txtTest3.setOnClickListener(this);
        txtTest4 = (Button) findViewById(R.id.test4);
        txtTest4.setOnClickListener(this);
        txtTest5 = (Button) findViewById(R.id.test5);
        txtTest5.setOnClickListener(this);
        txtTest6 = (Button) findViewById(R.id.test6);
        txtTest6.setOnClickListener(this);
        txtTest7 = (Button) findViewById(R.id.test7);
        txtTest7.setOnClickListener(this);
        txtTest8 = (Button) findViewById(R.id.test8);
        txtTest8.setOnClickListener(this);
        txtTest9 = (Button) findViewById(R.id.test9);
        txtTest9.setOnClickListener(this);
        txtTest10 = (Button) findViewById(R.id.test10);
        txtTest10.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBack:
                NavUtils.navigateUpFromSameTask(this);
                break;
            case R.id.test1:
                Intent intent = new Intent(Report.this, Test1.class);
                intent.putExtra("sName", sName);
                startActivity(intent);
                break;

            case R.id.test2:
                Intent intent1 = new Intent(Report.this, Test2.class);
                intent1.putExtra("sName", sName);
                startActivity(intent1);
                break;

            case R.id.test3:
                Intent intent2 = new Intent(Report.this, Test3.class);
                intent2.putExtra("sName", sName);
                startActivity(intent2);
                break;

            case R.id.test4:
                Intent intent3 = new Intent(Report.this, Test4.class);
                intent3.putExtra("sName", sName);
                startActivity(intent3);
                break;

            case R.id.test5:
                Intent intent4 = new Intent(Report.this, Test5.class);
                intent4.putExtra("sName", sName);
                startActivity(intent4);
                break;

            case R.id.test6:
                Intent intent5 = new Intent(Report.this, Test6.class);
                intent5.putExtra("sName", sName);
                startActivity(intent5);
                break;
            case R.id.test7:
                Intent intent6 = new Intent(Report.this, Test7.class);
                intent6.putExtra("sName", sName);
                startActivity(intent6);
                break;
            case R.id.test8:
                Intent intent7 = new Intent(Report.this, Test8.class);
                intent7.putExtra("sName", sName);
                startActivity(intent7);
                break;
            case R.id.test9:
                Intent intent8 = new Intent(Report.this, Test9.class);
                intent8.putExtra("sName", sName);
                startActivity(intent8);
                break;
            case R.id.test10:
                Intent intent9 = new Intent(Report.this, Test10.class);
                intent9.putExtra("sName", sName);
                startActivity(intent9);
                break;

        }
    }
}
