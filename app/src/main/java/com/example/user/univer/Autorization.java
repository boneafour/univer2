package com.example.user.univer;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Autorization extends AppCompatActivity implements View.OnClickListener{

    EditText etParol;
    Button btnLogin;
    Spinner spType, spStudent;
    String stType, stParol, s, p, nameStudent="1", passStudent="2";
    DatabaseHandler db = new DatabaseHandler(this);
    List<StudentData> students;
    ArrayList<String> List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autorization);
        spType = (Spinner) findViewById(R.id.type);
        List<String> list = new ArrayList<String>();
        list.add("Мұғәлім");
        list.add("Оқушы");
        list.add("Админ");
        ArrayAdapter<String> dataAdapter= new ArrayAdapter<String>(this, R.layout.activity_spinner, list);
        spType.setAdapter(dataAdapter);




        etParol = (EditText) findViewById(R.id.parol);
        btnLogin = (Button) findViewById(R.id.loginButton);
        btnLogin.setOnClickListener(this);


        students = db.getAllStudents();
        List = new ArrayList<String>();

        List.add("Оқушыны танданыз:");
        for(StudentData cn : students){
            s = cn.getStudentName();
            List.add(s);
        }
        spStudent = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter teacherAdapter = new ArrayAdapter(this,R.layout.activity_spinner, List);
        spStudent.setAdapter(teacherAdapter);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.loginButton:
                stParol = etParol.getText().toString();
                etParol.setText("");
                stType=spType.getSelectedItem().toString();
                nameStudent = spStudent.getSelectedItem().toString();
                System.out.println(spStudent.getSelectedItem().toString()+" --------- "+stParol);
                for(StudentData cn : students){
                    s = cn.getStudentName();
                    p = cn.getStudentPhone();
                    if(nameStudent==s){
                        passStudent=p;
                    }
                }
                System.out.println(nameStudent+" --------- "+passStudent);

                if (stType.equals("Мұғәлім") && stParol.equals("12345")) {
                    Intent intent2 = new Intent(this, MainActivity.class);
                    startActivity(intent2);
                }
                else if (stType.equals("Оқушы") && nameStudent.equals(nameStudent) && stParol.equals(passStudent)) {
                    Intent intent = new Intent(this, MainActivity1.class);
                    intent.putExtra("sName", nameStudent);
                    intent.putExtra("sPass", passStudent);
                    startActivity(intent);
                }
                else if (stType.equals("Мұғәлім") && (stParol.equals(""))) {
                    Toast.makeText(Autorization.this, "Құпия сөзді енгізіңіз", Toast.LENGTH_SHORT).show();
                }
                else if (stType.equals("Админ") && stParol.equals("admin")) {
                    Intent intent1 = new Intent(this, MainActivity2.class);
                    startActivity(intent1);
                }
                else {
                    Toast.makeText(Autorization.this, "Құпия сөз дұрыс емес", Toast.LENGTH_SHORT).show();
                }

                break;
        }
    }
}
