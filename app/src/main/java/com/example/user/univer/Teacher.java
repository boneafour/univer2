package com.example.user.univer;

import android.app.Activity;
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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 14.06.2016.
 */
public class Teacher extends Activity implements View.OnClickListener {

    private TextView txtTitle;
    private ImageButton btnBack;
    private Button btnSave;
    DatabaseHandler db = new DatabaseHandler(this);
    EditText etFullName, etPhoneNumber, etCommentTeacher;
    String stFullName, stPhoneNumber, stCommentTeacher, stSubject;
    Spinner spSubject;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText(getString(R.string.teacher));


        btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnSave.setOnClickListener(this);

        etFullName = (EditText) findViewById(R.id.studentName);
        etPhoneNumber = (EditText) findViewById(R.id.phoneNumber);
        etCommentTeacher = (EditText) findViewById(R.id.comTeacher);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBack:
                NavUtils.navigateUpFromSameTask(this);
                break;

            case R.id.btnSave:
                stFullName = "" + etFullName.getText();
                etFullName.setText("");
                stPhoneNumber = "" + etPhoneNumber.getText();
                etPhoneNumber.setText("");
                stCommentTeacher = "" + etCommentTeacher.getText();
                etCommentTeacher.setText("");

                DatabaseHandler db = new DatabaseHandler(this);
                db.addTeacher(new TeacherData(stFullName,  stPhoneNumber, stCommentTeacher));
                List<TeacherData> teachers = db.getAllTeachers();
                for (TeacherData cn : teachers) {
                    String log = "Id: "+cn.getTeacherID()+" ,Name: " + cn.getTeacherName() + " ,Phone: " + cn.getTeacherPhone()+" ,Comment: " + cn.getTeacherComment();
                    Log.d("Name: ", log);
                }
                break;

        }
    }
}
