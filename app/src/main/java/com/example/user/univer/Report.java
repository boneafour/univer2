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
import com.example.user.univer.Test.Test2;
import com.example.user.univer.Test.Test3;
import com.example.user.univer.Test.Test4;
import com.example.user.univer.Test.Test5;
import com.example.user.univer.Test.Test6;

/**
 * Created by user on 14.06.2016.
 */
public class Report extends Activity implements View.OnClickListener {

    private TextView txtTitle;
    private ImageButton btnBack;
    private Button  txtTest1, txtTest2, txtTest3, txtTest4, txtTest5, txtTest6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText(getString(R.string.report));

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




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBack:
                NavUtils.navigateUpFromSameTask(this);
                break;
            case R.id.test1:
                startActivity(new Intent(Report.this, Test1.class));
                break;

            case R.id.test2:
                startActivity(new Intent(Report.this, Test2.class));
                break;

            case R.id.test3:
                startActivity(new Intent(Report.this, Test3.class));
                break;

            case R.id.test4:
                startActivity(new Intent(Report.this, Test4.class));
                break;

            case R.id.test5:
                startActivity(new Intent(Report.this, Test5.class));
                break;

            case R.id.test6:
                startActivity(new Intent(Report.this, Test6.class));
                break;

        }
    }
}
