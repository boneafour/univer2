package com.example.user.univer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by user on 14.06.2016.
 */
public class Profile extends Activity implements View.OnClickListener{

    private TextView txtTitle, txt2, txt4;
    private ImageButton btnBack;

    String sName, sPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText("Жеке парақша");

        Intent intent1 = getIntent();

        sName = intent1.getStringExtra("sName");
        sPass = intent1.getStringExtra("sPass");
        txt2 = (TextView) findViewById(R.id.textView2);
        txt2.setText(sName);
        txt4 = (TextView) findViewById(R.id.textView4);
        txt4.setText(sPass);

        btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnBack:
                NavUtils.navigateUpFromSameTask(this);
                break;

        }

    }
}