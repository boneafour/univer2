package com.example.user.univer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 14.06.2016.
 */
public class AddMark extends Activity implements View.OnClickListener {

    private TextView txtTitle;
    private ImageButton btnBack;
    private Button btnSave, btnSend;
    DatabaseHandler db = new DatabaseHandler(this);
    String stTeacher, stStudent, stSubject, stName, stMark, stMessege;
    Spinner spTeacher, spStudent, spSubject, spName, spMark;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_mark);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText("Оценки");

        List<TeacherData> teachers = db.getAllTeachers();
        ArrayList<String> teacherList = new ArrayList<String>();
        teacherList.add("Выберите преподавателя:");
        for(TeacherData cn : teachers){
            String s = cn.getTeacherName();
            teacherList.add(s);
        }
        spTeacher = (Spinner) findViewById(R.id.teacher);
        ArrayAdapter teacherAdapter = new ArrayAdapter(this,R.layout.activity_spinner, teacherList);
        spTeacher.setAdapter(teacherAdapter);

        List<StudentData> students = db.getAllStudents();
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add("Выберите студента:");
        for(StudentData cn : students){
            String s = cn.getStudentName();
            studentList.add(s);
        }
        spStudent = (Spinner) findViewById(R.id.student);
        ArrayAdapter studentAdapter = new ArrayAdapter(this,R.layout.activity_spinner, studentList);
        spStudent.setAdapter(studentAdapter);

        List<SubjectData> subject = db.getAllSubjects();
        ArrayList<String> roleList = new ArrayList<String>();
        roleList.add("Выберите предмета:");
        for(SubjectData cn : subject){
            String s = cn.getSubjectName();
            roleList.add(s);
        }
        spSubject = (Spinner) findViewById(R.id.subject);
        ArrayAdapter subjectList = new ArrayAdapter(this,R.layout.activity_spinner, roleList);
        spSubject.setAdapter(subjectList);

        List<LectureData> lecture = db.getAllLecture();
        ArrayList<String> name = new ArrayList<String>();
        name.add("Выберите лекцию:");
        for(LectureData cn : lecture){
            String s = cn.getLectureName();
            name.add(s);
        }
        spName = (Spinner) findViewById(R.id.name);
        ArrayAdapter nameList = new ArrayAdapter(this,R.layout.activity_spinner, name);
        spName.setAdapter(nameList);

        spMark = (Spinner) findViewById(R.id.mark);
        List<String> list = new ArrayList<String>();
        list.add("Выберите оценку:");
        list.add("0%");
        list.add("10%");
        list.add("20%");
        list.add("30%");
        list.add("40%");
        list.add("50%");
        list.add("60%");
        list.add("70%");
        list.add("80%");
        list.add("90%");
        list.add("100%");
        ArrayAdapter<String> dataAdapter= new ArrayAdapter<String>(this, R.layout.activity_spinner, list);
        spMark.setAdapter(dataAdapter);

        btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnSave.setOnClickListener(this);
        btnSend = (Button) findViewById(R.id.send);
        btnSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBack:
                NavUtils.navigateUpFromSameTask(this);
                break;

            case R.id.btnSave:
                Toast.makeText(AddMark.this, "Сохранено", Toast.LENGTH_SHORT).show();
                stTeacher = "" + spTeacher.getSelectedItem().toString();
                stStudent = "" + spStudent.getSelectedItem().toString();
                stSubject = "" + spSubject.getSelectedItem().toString();
                stName = "" + spName.getSelectedItem().toString();
                stMark = "" + spMark.getSelectedItem().toString();
                DatabaseHandler db = new DatabaseHandler(this);
                db.addMark(new MarkData(stTeacher, stStudent, stSubject, stName, stMark));
                List<MarkData> mark = db.getAllMarks();
                for (MarkData cn : mark) {
                    String log = "Id: "+cn.getMarkID()+" ,Teacher: " + cn.getMarkTeacher() + " ,Student: " + cn.getMarkStudent() + " ,Subject: " + cn.getMarkSubject()+" ,Name: " + cn.getMarkName()+" ,Mark: " + cn.getMark();
                    Log.d("Name: ", log);
                }
                break;
            case R.id.send:
                stTeacher = "" + spTeacher.getSelectedItem().toString();
                stStudent = "" + spStudent.getSelectedItem().toString();
                stSubject = "" + spSubject.getSelectedItem().toString();
                stName = "" + spName.getSelectedItem().toString();
                stMark = "" + spMark.getSelectedItem().toString();
                stMessege = ("Преподаватель: "+stTeacher+"Студент: "+stStudent+"Предметы: "+stSubject+"Название: "+stName+"Оценка: "+stMark);
                sendEmail();

        }
    }

    protected void sendEmail() {
        Log.i("Send email", "");
        String[] TO = {""};
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Напоминание");
        emailIntent.putExtra(Intent.EXTRA_TEXT, stMessege);

        try {
            startActivity(Intent.createChooser(emailIntent, "Отправить на почту..."));
            finish();
        }
        catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(AddMark.this, "Отправлено", Toast.LENGTH_SHORT).show();
        }
    }

}
