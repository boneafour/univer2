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
    Spinner spType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autorization);

        spType = (Spinner) findViewById(R.id.type);
        List<String> list = new ArrayList<String>();
        list.add("Преподаватель");
        list.add("Студент");
        ArrayAdapter<String> dataAdapter= new ArrayAdapter<String>(this, R.layout.activity_spinner, list);
        spType.setAdapter(dataAdapter);
        etParol = (EditText) findViewById(R.id.parol);
        btnLogin = (Button) findViewById(R.id.loginButton);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.loginButton:

                Intent intent=new Intent(this, MainActivity.class);
                startActivity(intent);
                /*
                loginS = Login.getText().toString();
                parolS = Parol.getText().toString();
                type=typeS.getSelectedItem().toString();
                if(type.equals(a) && loginS.equals("admin") && parolS.equals("12345")){
                    Intent intent=new Intent(this, MainActivity.class);
                    startActivity(intent);
                }
               else if(type.equals(b)){
                    Intent intent=new Intent(this, MainActivity1.class);
                    startActivity(intent);
                }
                else if(type.equals(a) && (loginS.equals("") || parolS.equals(""))){
                    Toast.makeText(Autorization.this, "Напишите логин и пароль!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Autorization.this, "Логин или пароль неверный!", Toast.LENGTH_SHORT).show();
                }
*/
                break;
        }
    }
}
