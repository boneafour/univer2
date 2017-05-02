package com.example.user.univer;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 14.06.2016.
 */
public class AboutUs extends Activity implements View.OnClickListener{

    private TextView txtTitle;
    private ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText("Біз туралы");

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
