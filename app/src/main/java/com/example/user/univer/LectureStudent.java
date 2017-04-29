package com.example.user.univer;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class LectureStudent extends Activity implements View.OnClickListener {


    private ImageButton btnBack;
    DatabaseHandler db = new DatabaseHandler(this);
    ArrayList<String> arName, arTeacher, arStudent, arSubject, arTopic, arDate, arTime, arCommentStudent, arCommentTeacher, arCheck, arLecture;
    private TextView txtTitle;
    ListView lv;
    ReportListAdapterStudent lvAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecture12);
        db = new DatabaseHandler(this);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText(getString(R.string.lecture));

        btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

        arName = new ArrayList<String>();
        arTeacher = new ArrayList<String>();
        arStudent = new ArrayList<String>();
        arSubject = new ArrayList<String>();
        arTopic = new ArrayList<String>();
        arDate = new ArrayList<String>();
        arTime = new ArrayList<String>();
        arCommentStudent = new ArrayList<String>();
        arCommentTeacher = new ArrayList<String>();
        arCheck = new ArrayList<String>();
        arLecture = new ArrayList<String>();

        List<LectureData> lecture = db.getAllLecture();
        for (LectureData cn : lecture) {
            String stName = cn.getLectureName();
            arName.add(stName);
            String stTeacher = cn.getLectureTeacher();
            arTeacher.add(stTeacher);
            String stStudent = cn.getLectureStudent();
            arStudent.add(stStudent);
            String stSubject = cn.getLectureSubject();
            arSubject.add(stSubject);
            String stTopic = cn.getLectureTopic();
            arTopic.add(stTopic);
            String stDate = cn.getLectureData();
            arDate.add(stDate);
            String stTime = cn.getLectureTime();
            arTime.add(stTime);
            String stCommentStudent = cn.getLectureStudentComment();
            arCommentStudent.add(stCommentStudent);
            String stCommentTeacher = cn.getLectureTeacherComment();
            arCommentTeacher.add(stCommentTeacher);
            String stCheck = cn.getLectureCheck();
            arCheck.add(stCheck);
            String stLecture = cn.getLectureLecture();
            arLecture.add(stLecture);

            lv = (ListView) findViewById(R.id.listView);
            lvAdapter = new ReportListAdapterStudent(this, arName, arTeacher, arStudent, arSubject, arTopic, arDate, arTime, arCommentStudent, arCommentTeacher, arCheck, arLecture);
            lv.setAdapter(lvAdapter);
            lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
                @Override
                public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                    return true;
                }
            });

        }

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