package com.example.user.univer;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by user on 14.06.2016.
 */
public class AboutUsStudent extends Activity implements View.OnClickListener{

    private TextView txtTitle;
    private ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText("О нас");

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
