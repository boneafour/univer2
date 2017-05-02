package com.example.user.univer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 14.06.2016.
 */
public class Calendar extends Activity implements View.OnClickListener{

    private TextView txtTitle;
    private ImageButton btnBack;

    DatabaseHandler db = new DatabaseHandler(this);

    private ListView lv_android;
    private AndroidListAdapter list_adapter;
    private Button btn_calender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender1);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText("Ескертпе");

        btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);


        getWidget();
    }



    public void getWidget(){
        btn_calender = (Button) findViewById(R.id.btn_calender);
        btn_calender.setOnClickListener(this);

        lv_android = (ListView) findViewById(R.id.lv_android);
        list_adapter=new AndroidListAdapter(Calendar.this, R.layout.list_item, CalendarCollection.date_collection_arr);
        lv_android.setAdapter(list_adapter);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnBack:
                NavUtils.navigateUpFromSameTask(this);
            break;

            case R.id.btn_calender:
                startActivity(new Intent(Calendar.this, CalenderActivity.class));

                break;
    }

    }
}
