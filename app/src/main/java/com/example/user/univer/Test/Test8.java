package com.example.user.univer.Test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.user.univer.DatabaseHandler;
import com.example.user.univer.MarkData;
import com.example.user.univer.R;

import java.util.List;

/**
 * Created by user on 14.06.2016.
 */
public class Test8 extends Activity implements View.OnClickListener {

    private TextView txtTitle, question, testNumber;
    private ImageButton btnBack;
    private Button  txtTest1, txtTest2, txtTest3, txtTest4, txtTest5;
    private int count = 0, correct = 0;
    private String incorrect = "";

    String sName, sPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText(getString(R.string.report));


        Intent intent5 = getIntent();
        sName = intent5.getStringExtra("sName");

        question = (TextView) findViewById(R.id.question);

        testNumber = (TextView) findViewById(R.id.testNumber);
        testNumber.setText("1/10");

        btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

        txtTest1 = (Button) findViewById(R.id.varA);
        txtTest1.setOnClickListener(this);
        txtTest2 = (Button) findViewById(R.id.varB);
        txtTest2.setOnClickListener(this);
        txtTest3 = (Button) findViewById(R.id.varC);
        txtTest3.setOnClickListener(this);
        txtTest4 = (Button) findViewById(R.id.varD);
        txtTest4.setOnClickListener(this);
        txtTest5 = (Button) findViewById(R.id.varE);
        txtTest5.setOnClickListener(this);

        question.setText("Жердің Күннен қашықтығы қанша?");
        txtTest1.setText("A) 150 млн км");
        txtTest2.setText("B) 160 млн км");
        txtTest3.setText("C) 155 млн км");
        txtTest4.setText("D) 148 млн км");
        txtTest5.setText("E) 165 млн км");
        testNumber.setText("1/10");




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBack:
                NavUtils.navigateUpFromSameTask(this);
                break;
            case R.id.varA:
                if(count==0){
                    question.setText("Жердің Күннен қашықтығы қанша?");
                    txtTest1.setText("A) 150 млн км");
                    txtTest2.setText("B) 160 млн км");
                    txtTest3.setText("C) 155 млн км");
                    txtTest4.setText("D) 148 млн км");
                    txtTest5.setText("E) 165 млн км");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Жүздеген миллиард жұлдыздардан тұратын жұлдыздық жұйелер?");
                    txtTest1.setText("A) Аспан жүйесі");
                    txtTest2.setText("B) Галактика");
                    txtTest3.setText("C) Күн жүйесі ");
                    txtTest4.setText("D) Орбита ");
                    txtTest5.setText("E) Планета");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Жердің көлемі қандай?");
                    txtTest1.setText("A) 610 млн км2 ");
                    txtTest2.setText("B) 510 млн км2 ");
                    txtTest3.setText("C) 520 млн км2");
                    txtTest4.setText("D) 605 млн км2 ");
                    txtTest5.setText("E) 490 млн км2");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Экватордың радиусы полюстік радиустан қанша км көп?");
                    txtTest1.setText("A) 21 км ");
                    txtTest2.setText("B) 15 км ");
                    txtTest3.setText("C) 22 км ");
                    txtTest4.setText("D) 19 км ");
                    txtTest5.setText("E) 10 км ");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Жер ортасынан экваторға дейінгі арақашықтығы қанша?");
                    txtTest1.setText("A) 6359 км ");
                    txtTest2.setText("B) 6371 км ");
                    txtTest3.setText("C) 6378 км ");
                    txtTest4.setText("D) 6375 км ");
                    txtTest5.setText("E) 6310 км");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Жер Күнді орбита бойымен неше күн,неше сағатта бір рет айналады?");
                    txtTest1.setText("A) 265 күн 6 сағат ");
                    txtTest2.setText("B) 365 күн 1 сағат  ");
                    txtTest3.setText("C) 265 күн 2 сағат");
                    txtTest4.setText("D) 365 күн 6 сағат ");
                    txtTest5.setText("E) 265 күн 3 сағат");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Жер батыстан шығысқа қарай өз білігінен қанша уақытта айналады?");
                    txtTest1.setText("A) 0,5 тәулік ");
                    txtTest2.setText("B) 1,5 тәулік ");
                    txtTest3.setText("C) 2 тәулік ");
                    txtTest4.setText("D) 1 тәулік ");
                    txtTest5.setText("E) 2,5 тәулік");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Жер бетіндегі экваторға ойша параллель жүргізілген сызықтар");
                    txtTest1.setText("A) Параллель ");
                    txtTest2.setText("B) Меридиан ");
                    txtTest3.setText("C) Экватор ");
                    txtTest4.setText("D) Полюс ");
                    txtTest5.setText("E) Бойлық ");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Жер бетінің қозғалмайтын екі нүктесі.");
                    txtTest1.setText("A) Экватор ");
                    txtTest2.setText("B) Полюс ");
                    txtTest3.setText("C) Меридиан ");
                    txtTest4.setText("D)Бойлық ");
                    txtTest5.setText("Е)Параллель");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Гринвич меридианы басып өтетін қала:");
                    txtTest1.setText("A) Мадрид ");
                    txtTest2.setText("B) Токио ");
                    txtTest3.setText("C) Нью-Иорк ");
                    txtTest4.setText("D) Астана ");
                    txtTest5.setText("E) Лондон");
                    testNumber.setText("10/10");
                }
                else if(count==10){
                    question.setText("Бақылау қортындысы бойынша:");
                    txtTest1.setText("Дұрыс жауап "+correct);
                    txtTest2.setText("Дұрыс емес"+incorrect);
                    txtTest3.setText("");
                    txtTest4.setText("");
                    txtTest5.setText("");
                    testNumber.setText("");
                    String correct1 = "" + correct;
                    String name = "Лекция 8";
                    String nameStudent = sName;

                    DatabaseHandler db = new DatabaseHandler(this);
                    db.addMark(new MarkData(name, nameStudent, correct1));
                    List<MarkData> markDatas = db.getAllMarks();
                    for (MarkData cn : markDatas) {
                        String log = "Id: "+cn.getMarkID()+" ,Name: " + cn.getMarkStudent() + " ,NameStudent: "+ cn.getMarkName() + " ,Mark: " + cn.getMark();
                        Log.d("Name: ", log);
                    }
                }
                if(count==0){
                    correct++;
                    count++;
                }
                else if(count==1){
                    incorrect = (incorrect+" 2");
                    count++;
                }
                else if(count==2){
                    incorrect = (incorrect+" 3");
                    count++;
                }
                else if(count==3){
                    correct++;
                    count++;
                }
                else if(count==4){
                    incorrect = (incorrect+" 5");
                    count++;
                }
                else if(count==5){
                    incorrect = (incorrect+" 6");
                    count++;
                }
                else if(count==6){
                    incorrect = (incorrect+" 7");
                    count++;
                }
                else if(count==7){
                    correct++;
                    count++;
                }
                else if(count==8){
                    incorrect = (incorrect+" 9");
                    count++;
                }
                else if(count==9){
                    incorrect = (incorrect+" 10");
                    count++;
                }
                break;
            case R.id.varB:
                if(count==0){
                    question.setText("Жердің Күннен қашықтығы қанша?");
                    txtTest1.setText("A) 150 млн км");
                    txtTest2.setText("B) 160 млн км");
                    txtTest3.setText("C) 155 млн км");
                    txtTest4.setText("D) 148 млн км");
                    txtTest5.setText("E) 165 млн км");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Жүздеген миллиард жұлдыздардан тұратын жұлдыздық жұйелер?");
                    txtTest1.setText("A) Аспан жүйесі");
                    txtTest2.setText("B) Галактика");
                    txtTest3.setText("C) Күн жүйесі ");
                    txtTest4.setText("D) Орбита ");
                    txtTest5.setText("E) Планета");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Жердің көлемі қандай?");
                    txtTest1.setText("A) 610 млн км2 ");
                    txtTest2.setText("B) 510 млн км2 ");
                    txtTest3.setText("C) 520 млн км2");
                    txtTest4.setText("D) 605 млн км2 ");
                    txtTest5.setText("E) 490 млн км2");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Экватордың радиусы полюстік радиустан қанша км көп?");
                    txtTest1.setText("A) 21 км ");
                    txtTest2.setText("B) 15 км ");
                    txtTest3.setText("C) 22 км ");
                    txtTest4.setText("D) 19 км ");
                    txtTest5.setText("E) 10 км ");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Жер ортасынан экваторға дейінгі арақашықтығы қанша?");
                    txtTest1.setText("A) 6359 км ");
                    txtTest2.setText("B) 6371 км ");
                    txtTest3.setText("C) 6378 км ");
                    txtTest4.setText("D) 6375 км ");
                    txtTest5.setText("E) 6310 км");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Жер Күнді орбита бойымен неше күн,неше сағатта бір рет айналады?");
                    txtTest1.setText("A) 265 күн 6 сағат ");
                    txtTest2.setText("B) 365 күн 1 сағат  ");
                    txtTest3.setText("C) 265 күн 2 сағат");
                    txtTest4.setText("D) 365 күн 6 сағат ");
                    txtTest5.setText("E) 265 күн 3 сағат");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Жер батыстан шығысқа қарай өз білігінен қанша уақытта айналады?");
                    txtTest1.setText("A) 0,5 тәулік ");
                    txtTest2.setText("B) 1,5 тәулік ");
                    txtTest3.setText("C) 2 тәулік ");
                    txtTest4.setText("D) 1 тәулік ");
                    txtTest5.setText("E) 2,5 тәулік");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Жер бетіндегі экваторға ойша параллель жүргізілген сызықтар");
                    txtTest1.setText("A) Параллель ");
                    txtTest2.setText("B) Меридиан ");
                    txtTest3.setText("C) Экватор ");
                    txtTest4.setText("D) Полюс ");
                    txtTest5.setText("E) Бойлық ");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Жер бетінің қозғалмайтын екі нүктесі.");
                    txtTest1.setText("A) Экватор ");
                    txtTest2.setText("B) Полюс ");
                    txtTest3.setText("C) Меридиан ");
                    txtTest4.setText("D)Бойлық ");
                    txtTest5.setText("Е)Параллель");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Гринвич меридианы басып өтетін қала:");
                    txtTest1.setText("A) Мадрид ");
                    txtTest2.setText("B) Токио ");
                    txtTest3.setText("C) Нью-Иорк ");
                    txtTest4.setText("D) Астана ");
                    txtTest5.setText("E) Лондон");
                    testNumber.setText("10/10");
                }
                else if(count==10){
                    question.setText("Бақылау қортындысы бойынша:");
                    txtTest1.setText("Дұрыс жауап "+correct);
                    txtTest2.setText("Дұрыс емес"+incorrect);
                    txtTest3.setText("");
                    txtTest4.setText("");
                    txtTest5.setText("");
                    testNumber.setText("");
                    String correct1 = "" + correct;
                    String name = "Лекция 8";
                    String nameStudent = sName;

                    DatabaseHandler db = new DatabaseHandler(this);
                    db.addMark(new MarkData(name, nameStudent, correct1));
                    List<MarkData> markDatas = db.getAllMarks();
                    for (MarkData cn : markDatas) {
                        String log = "Id: "+cn.getMarkID()+" ,Name: " + cn.getMarkStudent() + " ,NameStudent: "+ cn.getMarkName() + " ,Mark: " + cn.getMark();
                        Log.d("Name: ", log);
                    }
                }
                if(count==0){
                    incorrect = (incorrect+" 1");
                    count++;
                }
                else if(count==1){
                    correct++;
                    count++;
                }
                else if(count==2){
                    correct++;
                    count++;
                }
                else if(count==3){
                    incorrect = (incorrect+" 4");
                    count++;
                }
                else if(count==4){
                    incorrect = (incorrect+" 5");
                    count++;
                }
                else if(count==5){
                    incorrect = (incorrect+" 6");
                    count++;
                }
                else if(count==6){
                    incorrect = (incorrect+" 7");
                    count++;
                }
                else if(count==7){
                    incorrect = (incorrect+" 8");
                    count++;
                }
                else if(count==8){
                    correct++;
                    count++;
                }
                else if(count==9){
                    incorrect = (incorrect+" 10");
                    count++;
                }
                break;
            case R.id.varC:
                if(count==0){
                    question.setText("Жердің Күннен қашықтығы қанша?");
                    txtTest1.setText("A) 150 млн км");
                    txtTest2.setText("B) 160 млн км");
                    txtTest3.setText("C) 155 млн км");
                    txtTest4.setText("D) 148 млн км");
                    txtTest5.setText("E) 165 млн км");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Жүздеген миллиард жұлдыздардан тұратын жұлдыздық жұйелер?");
                    txtTest1.setText("A) Аспан жүйесі");
                    txtTest2.setText("B) Галактика");
                    txtTest3.setText("C) Күн жүйесі ");
                    txtTest4.setText("D) Орбита ");
                    txtTest5.setText("E) Планета");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Жердің көлемі қандай?");
                    txtTest1.setText("A) 610 млн км2 ");
                    txtTest2.setText("B) 510 млн км2 ");
                    txtTest3.setText("C) 520 млн км2");
                    txtTest4.setText("D) 605 млн км2 ");
                    txtTest5.setText("E) 490 млн км2");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Экватордың радиусы полюстік радиустан қанша км көп?");
                    txtTest1.setText("A) 21 км ");
                    txtTest2.setText("B) 15 км ");
                    txtTest3.setText("C) 22 км ");
                    txtTest4.setText("D) 19 км ");
                    txtTest5.setText("E) 10 км ");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Жер ортасынан экваторға дейінгі арақашықтығы қанша?");
                    txtTest1.setText("A) 6359 км ");
                    txtTest2.setText("B) 6371 км ");
                    txtTest3.setText("C) 6378 км ");
                    txtTest4.setText("D) 6375 км ");
                    txtTest5.setText("E) 6310 км");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Жер Күнді орбита бойымен неше күн,неше сағатта бір рет айналады?");
                    txtTest1.setText("A) 265 күн 6 сағат ");
                    txtTest2.setText("B) 365 күн 1 сағат  ");
                    txtTest3.setText("C) 265 күн 2 сағат");
                    txtTest4.setText("D) 365 күн 6 сағат ");
                    txtTest5.setText("E) 265 күн 3 сағат");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Жер батыстан шығысқа қарай өз білігінен қанша уақытта айналады?");
                    txtTest1.setText("A) 0,5 тәулік ");
                    txtTest2.setText("B) 1,5 тәулік ");
                    txtTest3.setText("C) 2 тәулік ");
                    txtTest4.setText("D) 1 тәулік ");
                    txtTest5.setText("E) 2,5 тәулік");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Жер бетіндегі экваторға ойша параллель жүргізілген сызықтар");
                    txtTest1.setText("A) Параллель ");
                    txtTest2.setText("B) Меридиан ");
                    txtTest3.setText("C) Экватор ");
                    txtTest4.setText("D) Полюс ");
                    txtTest5.setText("E) Бойлық ");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Жер бетінің қозғалмайтын екі нүктесі.");
                    txtTest1.setText("A) Экватор ");
                    txtTest2.setText("B) Полюс ");
                    txtTest3.setText("C) Меридиан ");
                    txtTest4.setText("D)Бойлық ");
                    txtTest5.setText("Е)Параллель");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Гринвич меридианы басып өтетін қала:");
                    txtTest1.setText("A) Мадрид ");
                    txtTest2.setText("B) Токио ");
                    txtTest3.setText("C) Нью-Иорк ");
                    txtTest4.setText("D) Астана ");
                    txtTest5.setText("E) Лондон");
                    testNumber.setText("10/10");
                }
                else if(count==10){
                    question.setText("Бақылау қортындысы бойынша:");
                    txtTest1.setText("Дұрыс жауап "+correct);
                    txtTest2.setText("Дұрыс емес"+incorrect);
                    txtTest3.setText("");
                    txtTest4.setText("");
                    txtTest5.setText("");
                    testNumber.setText("");
                    String correct1 = "" + correct;
                    String name = "Лекция 8";
                    String nameStudent = sName;

                    DatabaseHandler db = new DatabaseHandler(this);
                    db.addMark(new MarkData(name, nameStudent, correct1));
                    List<MarkData> markDatas = db.getAllMarks();
                    for (MarkData cn : markDatas) {
                        String log = "Id: "+cn.getMarkID()+" ,Name: " + cn.getMarkStudent() + " ,NameStudent: "+ cn.getMarkName() + " ,Mark: " + cn.getMark();
                        Log.d("Name: ", log);
                    }
                }
                if(count==0){
                incorrect = (incorrect+" 1");
                count++;
            }
            else if(count==1){
                incorrect = (incorrect+" 2");
                count++;
            }
            else if(count==2){
                incorrect = (incorrect+" 3");
                count++;
            }
            else if(count==3){
                incorrect = (incorrect+" 4");
                count++;
            }
            else if(count==4){
                    correct++;
                count++;
            }
            else if(count==5){
                incorrect = (incorrect+" 6");
                count++;
            }
            else if(count==6){
                incorrect = (incorrect+" 7");
                count++;
            }
            else if(count==7){
                incorrect = (incorrect+" 8");
                count++;
            }
            else if(count==8){
                incorrect = (incorrect+" 9");
                count++;
            }
            else if(count==9){
                incorrect = (incorrect+" 10");
                count++;
            }
                break;
            case R.id.varD:
                if(count==0){
                    question.setText("Жердің Күннен қашықтығы қанша?");
                    txtTest1.setText("A) 150 млн км");
                    txtTest2.setText("B) 160 млн км");
                    txtTest3.setText("C) 155 млн км");
                    txtTest4.setText("D) 148 млн км");
                    txtTest5.setText("E) 165 млн км");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Жүздеген миллиард жұлдыздардан тұратын жұлдыздық жұйелер?");
                    txtTest1.setText("A) Аспан жүйесі");
                    txtTest2.setText("B) Галактика");
                    txtTest3.setText("C) Күн жүйесі ");
                    txtTest4.setText("D) Орбита ");
                    txtTest5.setText("E) Планета");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Жердің көлемі қандай?");
                    txtTest1.setText("A) 610 млн км2 ");
                    txtTest2.setText("B) 510 млн км2 ");
                    txtTest3.setText("C) 520 млн км2");
                    txtTest4.setText("D) 605 млн км2 ");
                    txtTest5.setText("E) 490 млн км2");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Экватордың радиусы полюстік радиустан қанша км көп?");
                    txtTest1.setText("A) 21 км ");
                    txtTest2.setText("B) 15 км ");
                    txtTest3.setText("C) 22 км ");
                    txtTest4.setText("D) 19 км ");
                    txtTest5.setText("E) 10 км ");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Жер ортасынан экваторға дейінгі арақашықтығы қанша?");
                    txtTest1.setText("A) 6359 км ");
                    txtTest2.setText("B) 6371 км ");
                    txtTest3.setText("C) 6378 км ");
                    txtTest4.setText("D) 6375 км ");
                    txtTest5.setText("E) 6310 км");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Жер Күнді орбита бойымен неше күн,неше сағатта бір рет айналады?");
                    txtTest1.setText("A) 265 күн 6 сағат ");
                    txtTest2.setText("B) 365 күн 1 сағат  ");
                    txtTest3.setText("C) 265 күн 2 сағат");
                    txtTest4.setText("D) 365 күн 6 сағат ");
                    txtTest5.setText("E) 265 күн 3 сағат");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Жер батыстан шығысқа қарай өз білігінен қанша уақытта айналады?");
                    txtTest1.setText("A) 0,5 тәулік ");
                    txtTest2.setText("B) 1,5 тәулік ");
                    txtTest3.setText("C) 2 тәулік ");
                    txtTest4.setText("D) 1 тәулік ");
                    txtTest5.setText("E) 2,5 тәулік");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Жер бетіндегі экваторға ойша параллель жүргізілген сызықтар");
                    txtTest1.setText("A) Параллель ");
                    txtTest2.setText("B) Меридиан ");
                    txtTest3.setText("C) Экватор ");
                    txtTest4.setText("D) Полюс ");
                    txtTest5.setText("E) Бойлық ");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Жер бетінің қозғалмайтын екі нүктесі.");
                    txtTest1.setText("A) Экватор ");
                    txtTest2.setText("B) Полюс ");
                    txtTest3.setText("C) Меридиан ");
                    txtTest4.setText("D)Бойлық ");
                    txtTest5.setText("Е)Параллель");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Гринвич меридианы басып өтетін қала:");
                    txtTest1.setText("A) Мадрид ");
                    txtTest2.setText("B) Токио ");
                    txtTest3.setText("C) Нью-Иорк ");
                    txtTest4.setText("D) Астана ");
                    txtTest5.setText("E) Лондон");
                    testNumber.setText("10/10");
                }
                else if(count==10){
                    question.setText("Бақылау қортындысы бойынша:");
                    txtTest1.setText("Дұрыс жауап "+correct);
                    txtTest2.setText("Дұрыс емес"+incorrect);
                    txtTest3.setText("");
                    txtTest4.setText("");
                    txtTest5.setText("");
                    testNumber.setText("");
                    String correct1 = "" + correct;
                    String name = "Лекция 8";
                    String nameStudent = sName;

                    DatabaseHandler db = new DatabaseHandler(this);
                    db.addMark(new MarkData(name, nameStudent, correct1));
                    List<MarkData> markDatas = db.getAllMarks();
                    for (MarkData cn : markDatas) {
                        String log = "Id: "+cn.getMarkID()+" ,Name: " + cn.getMarkStudent() + " ,NameStudent: "+ cn.getMarkName() + " ,Mark: " + cn.getMark();
                        Log.d("Name: ", log);
                    }
                }
                if(count==0){
                    incorrect = (incorrect+" 1");
                    count++;
                }
                else if(count==1){
                    incorrect = (incorrect+" 2");
                    count++;
                }
                else if(count==2){
                    incorrect = (incorrect+" 3");
                    count++;
                }
                else if(count==3){
                    incorrect = (incorrect+" 4");
                    count++;
                }
                else if(count==4){
                    incorrect = (incorrect+" 5");
                    count++;
                }
                else if(count==5){
                    correct++;
                    count++;
                }
                else if(count==6){
                    correct++;
                    count++;
                }
                else if(count==7){
                    incorrect = (incorrect+" 8");
                    count++;
                }
                else if(count==8){
                    incorrect = (incorrect+" 9");
                    count++;
                }
                else if(count==9){
                    incorrect = (incorrect+" 10");
                    count++;
                }
                break;
            case R.id.varE:
                if(count==0){
                    question.setText("Жердің Күннен қашықтығы қанша?");
                    txtTest1.setText("A) 150 млн км");
                    txtTest2.setText("B) 160 млн км");
                    txtTest3.setText("C) 155 млн км");
                    txtTest4.setText("D) 148 млн км");
                    txtTest5.setText("E) 165 млн км");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Жүздеген миллиард жұлдыздардан тұратын жұлдыздық жұйелер?");
                    txtTest1.setText("A) Аспан жүйесі");
                    txtTest2.setText("B) Галактика");
                    txtTest3.setText("C) Күн жүйесі ");
                    txtTest4.setText("D) Орбита ");
                    txtTest5.setText("E) Планета");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Жердің көлемі қандай?");
                    txtTest1.setText("A) 610 млн км2 ");
                    txtTest2.setText("B) 510 млн км2 ");
                    txtTest3.setText("C) 520 млн км2");
                    txtTest4.setText("D) 605 млн км2 ");
                    txtTest5.setText("E) 490 млн км2");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Экватордың радиусы полюстік радиустан қанша км көп?");
                    txtTest1.setText("A) 21 км ");
                    txtTest2.setText("B) 15 км ");
                    txtTest3.setText("C) 22 км ");
                    txtTest4.setText("D) 19 км ");
                    txtTest5.setText("E) 10 км ");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Жер ортасынан экваторға дейінгі арақашықтығы қанша?");
                    txtTest1.setText("A) 6359 км ");
                    txtTest2.setText("B) 6371 км ");
                    txtTest3.setText("C) 6378 км ");
                    txtTest4.setText("D) 6375 км ");
                    txtTest5.setText("E) 6310 км");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Жер Күнді орбита бойымен неше күн,неше сағатта бір рет айналады?");
                    txtTest1.setText("A) 265 күн 6 сағат ");
                    txtTest2.setText("B) 365 күн 1 сағат  ");
                    txtTest3.setText("C) 265 күн 2 сағат");
                    txtTest4.setText("D) 365 күн 6 сағат ");
                    txtTest5.setText("E) 265 күн 3 сағат");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Жер батыстан шығысқа қарай өз білігінен қанша уақытта айналады?");
                    txtTest1.setText("A) 0,5 тәулік ");
                    txtTest2.setText("B) 1,5 тәулік ");
                    txtTest3.setText("C) 2 тәулік ");
                    txtTest4.setText("D) 1 тәулік ");
                    txtTest5.setText("E) 2,5 тәулік");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Жер бетіндегі экваторға ойша параллель жүргізілген сызықтар");
                    txtTest1.setText("A) Параллель ");
                    txtTest2.setText("B) Меридиан ");
                    txtTest3.setText("C) Экватор ");
                    txtTest4.setText("D) Полюс ");
                    txtTest5.setText("E) Бойлық ");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Жер бетінің қозғалмайтын екі нүктесі.");
                    txtTest1.setText("A) Экватор ");
                    txtTest2.setText("B) Полюс ");
                    txtTest3.setText("C) Меридиан ");
                    txtTest4.setText("D)Бойлық ");
                    txtTest5.setText("Е)Параллель");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Гринвич меридианы басып өтетін қала:");
                    txtTest1.setText("A) Мадрид ");
                    txtTest2.setText("B) Токио ");
                    txtTest3.setText("C) Нью-Иорк ");
                    txtTest4.setText("D) Астана ");
                    txtTest5.setText("E) Лондон");
                    testNumber.setText("10/10");
                }
                else if(count==10){
                    question.setText("Бақылау қортындысы бойынша:");
                    txtTest1.setText("Дұрыс жауап "+correct);
                    txtTest2.setText("Дұрыс емес"+incorrect);
                    txtTest3.setText("");
                    txtTest4.setText("");
                    txtTest5.setText("");
                    testNumber.setText("");
                    String correct1 = "" + correct;
                    String name = "Лекция 8";
                    String nameStudent = sName;

                    DatabaseHandler db = new DatabaseHandler(this);
                    db.addMark(new MarkData(name, nameStudent, correct1));
                    List<MarkData> markDatas = db.getAllMarks();
                    for (MarkData cn : markDatas) {
                        String log = "Id: "+cn.getMarkID()+" ,Name: " + cn.getMarkStudent() + " ,NameStudent: "+ cn.getMarkName() + " ,Mark: " + cn.getMark();
                        Log.d("Name: ", log);
                    }
                }
                if(count==0){
                    incorrect = (incorrect+" 1");
                    count++;
                }
                else if(count==1){
                    incorrect = (incorrect+" 2");
                    count++;
                }
                else if(count==2){
                    incorrect = (incorrect+" 3");
                    count++;
                }
                else if(count==3){
                    incorrect = (incorrect+" 4");
                    count++;
                }
                else if(count==4){
                    incorrect = (incorrect+" 5");
                    count++;
                }
                else if(count==5){
                    incorrect = (incorrect+" 6");
                    count++;
                }
                else if(count==6){
                    incorrect = (incorrect+" 7");
                    count++;
                }
                else if(count==7){
                    incorrect = (incorrect+" 8");
                    count++;
                }
                else if(count==8){
                    incorrect = (incorrect+" 9");
                    count++;
                }
                else if(count==9){
                    correct++;
                    count++;
                }
                break;

        }
    }
}
