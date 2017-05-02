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
    String stType, stParol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autorization);

        spType = (Spinner) findViewById(R.id.type);
        List<String> list = new ArrayList<String>();
        list.add("Мұғәлім");
        list.add("Оқушы");
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
                stParol = etParol.getText().toString();
                etParol.setText("");
                stType=spType.getSelectedItem().toString();
                if(stType.equals("Мұғәлім")  && stParol.equals("12345")){
                    Intent intent1 =new Intent(this, MainActivity.class);
                    startActivity(intent1);
                }
               else if(stType.equals("Оқушы")){
                    Intent intent2 =new Intent(this, MainActivity1.class);
                    startActivity(intent2);
                }
                else if(stType.equals("Мұғәлім") && ( stParol.equals(""))){
                    Toast.makeText(Autorization.this, "Құпия сөзді енгізіңіз", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Autorization.this, "Құпия сөз дұрыс емес", Toast.LENGTH_SHORT).show();
                }

                break;
        }
    }
}
