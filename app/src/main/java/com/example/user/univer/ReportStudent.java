package com.example.user.univer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 14.06.2016.
 */
public class ReportStudent extends Activity implements View.OnClickListener {

    private TextView txtTitle;
    private ImageButton btnBack, btnSearch;
    ListView lv;
    ReportListAdapter lvAdapter;
    DatabaseHandler db = new DatabaseHandler(this);
    ArrayList<String> arName, arTeacher, arStudent, arSubject, arTopic, arDate, arTime, arCommentStudent, arCommentTeacher, arCheck ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText(getString(R.string.report));

        btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);
        btnSearch = (ImageButton) findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(this);

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

            lv = (ListView) findViewById(R.id.listView);
            lvAdapter = new ReportListAdapter(this, arName, arTeacher, arStudent, arSubject, arTopic, arDate, arTime, arCommentStudent, arCommentTeacher, arCheck);
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
            case R.id.btnSearch:
                startActivity(new Intent(ReportStudent.this, Search.class));
                break;
        }
    }
}
