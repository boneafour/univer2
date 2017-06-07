package com.example.user.univer;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 14.06.2016.
 */
public class MarkForStudent extends Activity implements View.OnClickListener{

    private TextView txtTitle;
    private ImageButton btnBack;
    private Button btnSave;
    ListView lv;
    MarkListAdapter lvAdapter;
    DatabaseHandler db = new DatabaseHandler(this);
    ArrayList<String> arName, arMark, arStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mark_for_student);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText("Баға");

        btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

        arName = new ArrayList<String>();
        arStudent = new ArrayList<String>();
        arMark = new ArrayList<String>();

        List<MarkData> mark = db.getAllMarks();
        for (MarkData cn : mark) {

            String stSubject = cn.getMarkLecture();
            arName.add(stSubject);
            String stName = cn.getMarkName();
            arStudent.add(stName);
            String stTopic = cn.getMarks();
            arMark.add(stTopic);
        }
            lv = (ListView) findViewById(R.id.listView);
            lvAdapter = new MarkListAdapter(this,  arName, arStudent, arMark);
            lv.setAdapter(lvAdapter);
            lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
                @Override
                public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                    return true;
                }
            });

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
