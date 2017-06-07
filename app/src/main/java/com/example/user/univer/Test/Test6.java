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
public class Test6 extends Activity implements View.OnClickListener {

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

        question.setText("Қытай солтүстік батысында қай елмен шектеседі?");
        txtTest1.setText("A) Ресей");
        txtTest2.setText("B) Қазақстан");
        txtTest3.setText("C) Монғолия");
        txtTest4.setText("D) корея");
        txtTest5.setText("");
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
                    question.setText("Қытай солтүстік батысында қай елмен шектеседі?");
                    txtTest1.setText("A) Ресей");
                    txtTest2.setText("B) Қазақстан");
                    txtTest3.setText("C) Монғолия");
                    txtTest4.setText("D) корея");
                    txtTest5.setText("");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Азияның мешеу елдерін көрсет");
                    txtTest1.setText("A) Израиль");
                    txtTest2.setText("B) Иран, Ирак");
                    txtTest3.setText("C) Жапония, Қытай");
                    txtTest4.setText("D) Бутан, Йемен");
                    txtTest5.setText("");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Жаңа индустриялық елдерді ата");
                    txtTest1.setText("A) Оман, Бахрейн");
                    txtTest2.setText("B) Тайвань, Сингапур");
                    txtTest3.setText("C) Пәкістан, Бангладеш");
                    txtTest4.setText("D) Мальдив, Лаос");
                    txtTest5.setText("");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Жапониядағы ең үлкен мегалополис");
                    txtTest1.setText("A) Токио");
                    txtTest2.setText("B) Осака");
                    txtTest3.setText("C) Иокогама");
                    txtTest4.setText("D) Токайдо");
                    txtTest5.setText("");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Қытайдың басты ауыл шаруашылық дақылдары");
                    txtTest1.setText("A) күріш, бидай");
                    txtTest2.setText("B) Мақта");
                    txtTest3.setText("C) жүгері, тары");
                    txtTest4.setText("D) Қант құрағы, жержаңғақ");
                    txtTest5.setText("");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Үндістан тәуелсіздігін қашан алды?");
                    txtTest1.setText("A) 1923");
                    txtTest2.setText("B) 1949");
                    txtTest3.setText("C) 1947");
                    txtTest4.setText("D) 1960");
                    txtTest5.setText("");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Үндістанның негізгі сауда серіктестерін атаңыз");
                    txtTest1.setText("A) АҚШ");
                    txtTest2.setText("B) Беларусь");
                    txtTest3.setText("C) Корея");
                    txtTest4.setText("D) Қазақстан");
                    txtTest5.setText("");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Түркияның ұлттық заң шығарушы органы");
                    txtTest1.setText("A) Парламент");
                    txtTest2.setText("B) Президент");
                    txtTest3.setText("C) Ұлттық мәжіліс");
                    txtTest4.setText("D) Өкімет");
                    txtTest5.setText("");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Түркияның халық саны");
                    txtTest1.setText("A) 25000");
                    txtTest2.setText("B) 68, 1 млн.");
                    txtTest3.setText("C) 46, 9 млн.");
                    txtTest4.setText("D) 9 млн.");
                    txtTest5.setText("");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Мұнай экспорттаушы елдерді көрсет");
                    txtTest1.setText("A) Сауд Арабиясы, Катар");
                    txtTest2.setText("B) Оман, Корея");
                    txtTest3.setText("C) Қытай, Индонезия");
                    txtTest4.setText("D) Кувейт, Алжир");
                    txtTest5.setText("");
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
                    String name = "Лекция 6";
                    String nameStudent = sName;

                    DatabaseHandler db = new DatabaseHandler(this);
                    db.addMark(new MarkData(name, nameStudent, correct1));
                    List<MarkData> markDatas = db.getAllMarks();
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
                    correct++;
                    count++;
                }
                break;
            case R.id.varB:
                if(count==0){
                    question.setText("Қытай солтүстік батысында қай елмен шектеседі?");
                    txtTest1.setText("A) Ресей");
                    txtTest2.setText("B) Қазақстан");
                    txtTest3.setText("C) Монғолия");
                    txtTest4.setText("D) корея");
                    txtTest5.setText("");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Азияның мешеу елдерін көрсет");
                    txtTest1.setText("A) Израиль");
                    txtTest2.setText("B) Иран, Ирак");
                    txtTest3.setText("C) Жапония, Қытай");
                    txtTest4.setText("D) Бутан, Йемен");
                    txtTest5.setText("");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Жаңа индустриялық елдерді ата");
                    txtTest1.setText("A) Оман, Бахрейн");
                    txtTest2.setText("B) Тайвань, Сингапур");
                    txtTest3.setText("C) Пәкістан, Бангладеш");
                    txtTest4.setText("D) Мальдив, Лаос");
                    txtTest5.setText("");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Жапониядағы ең үлкен мегалополис");
                    txtTest1.setText("A) Токио");
                    txtTest2.setText("B) Осака");
                    txtTest3.setText("C) Иокогама");
                    txtTest4.setText("D) Токайдо");
                    txtTest5.setText("");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Қытайдың басты ауыл шаруашылық дақылдары");
                    txtTest1.setText("A) күріш, бидай");
                    txtTest2.setText("B) Мақта");
                    txtTest3.setText("C) жүгері, тары");
                    txtTest4.setText("D) Қант құрағы, жержаңғақ");
                    txtTest5.setText("");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Үндістан тәуелсіздігін қашан алды?");
                    txtTest1.setText("A) 1923");
                    txtTest2.setText("B) 1949");
                    txtTest3.setText("C) 1947");
                    txtTest4.setText("D) 1960");
                    txtTest5.setText("");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Үндістанның негізгі сауда серіктестерін атаңыз");
                    txtTest1.setText("A) АҚШ");
                    txtTest2.setText("B) Беларусь");
                    txtTest3.setText("C) Корея");
                    txtTest4.setText("D) Қазақстан");
                    txtTest5.setText("");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Түркияның ұлттық заң шығарушы органы");
                    txtTest1.setText("A) Парламент");
                    txtTest2.setText("B) Президент");
                    txtTest3.setText("C) Ұлттық мәжіліс");
                    txtTest4.setText("D) Өкімет");
                    txtTest5.setText("");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Түркияның халық саны");
                    txtTest1.setText("A) 25000");
                    txtTest2.setText("B) 68, 1 млн.");
                    txtTest3.setText("C) 46, 9 млн.");
                    txtTest4.setText("D) 9 млн.");
                    txtTest5.setText("");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Мұнай экспорттаушы елдерді көрсет");
                    txtTest1.setText("A) Сауд Арабиясы, Катар");
                    txtTest2.setText("B) Оман, Корея");
                    txtTest3.setText("C) Қытай, Индонезия");
                    txtTest4.setText("D) Кувейт, Алжир");
                    txtTest5.setText("");
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
                    String name = "Лекция 6";
                    String nameStudent = sName;

                    DatabaseHandler db = new DatabaseHandler(this);
                    db.addMark(new MarkData(name, nameStudent, correct1));
                    List<MarkData> markDatas = db.getAllMarks();
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
                    question.setText("Қытай солтүстік батысында қай елмен шектеседі?");
                    txtTest1.setText("A) Ресей");
                    txtTest2.setText("B) Қазақстан");
                    txtTest3.setText("C) Монғолия");
                    txtTest4.setText("D) корея");
                    txtTest5.setText("");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Азияның мешеу елдерін көрсет");
                    txtTest1.setText("A) Израиль");
                    txtTest2.setText("B) Иран, Ирак");
                    txtTest3.setText("C) Жапония, Қытай");
                    txtTest4.setText("D) Бутан, Йемен");
                    txtTest5.setText("");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Жаңа индустриялық елдерді ата");
                    txtTest1.setText("A) Оман, Бахрейн");
                    txtTest2.setText("B) Тайвань, Сингапур");
                    txtTest3.setText("C) Пәкістан, Бангладеш");
                    txtTest4.setText("D) Мальдив, Лаос");
                    txtTest5.setText("");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Жапониядағы ең үлкен мегалополис");
                    txtTest1.setText("A) Токио");
                    txtTest2.setText("B) Осака");
                    txtTest3.setText("C) Иокогама");
                    txtTest4.setText("D) Токайдо");
                    txtTest5.setText("");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Қытайдың басты ауыл шаруашылық дақылдары");
                    txtTest1.setText("A) күріш, бидай");
                    txtTest2.setText("B) Мақта");
                    txtTest3.setText("C) жүгері, тары");
                    txtTest4.setText("D) Қант құрағы, жержаңғақ");
                    txtTest5.setText("");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Үндістан тәуелсіздігін қашан алды?");
                    txtTest1.setText("A) 1923");
                    txtTest2.setText("B) 1949");
                    txtTest3.setText("C) 1947");
                    txtTest4.setText("D) 1960");
                    txtTest5.setText("");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Үндістанның негізгі сауда серіктестерін атаңыз");
                    txtTest1.setText("A) АҚШ");
                    txtTest2.setText("B) Беларусь");
                    txtTest3.setText("C) Корея");
                    txtTest4.setText("D) Қазақстан");
                    txtTest5.setText("");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Түркияның ұлттық заң шығарушы органы");
                    txtTest1.setText("A) Парламент");
                    txtTest2.setText("B) Президент");
                    txtTest3.setText("C) Ұлттық мәжіліс");
                    txtTest4.setText("D) Өкімет");
                    txtTest5.setText("");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Түркияның халық саны");
                    txtTest1.setText("A) 25000");
                    txtTest2.setText("B) 68, 1 млн.");
                    txtTest3.setText("C) 46, 9 млн.");
                    txtTest4.setText("D) 9 млн.");
                    txtTest5.setText("");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Мұнай экспорттаушы елдерді көрсет");
                    txtTest1.setText("A) Сауд Арабиясы, Катар");
                    txtTest2.setText("B) Оман, Корея");
                    txtTest3.setText("C) Қытай, Индонезия");
                    txtTest4.setText("D) Кувейт, Алжир");
                    txtTest5.setText("");
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
                    String name = "Лекция 6";
                    String nameStudent = sName;

                    DatabaseHandler db = new DatabaseHandler(this);
                    db.addMark(new MarkData(name, nameStudent, correct1));
                    List<MarkData> markDatas = db.getAllMarks();
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
            case R.id.varD:
                if(count==0){
                    question.setText("Қытай солтүстік батысында қай елмен шектеседі?");
                    txtTest1.setText("A) Ресей");
                    txtTest2.setText("B) Қазақстан");
                    txtTest3.setText("C) Монғолия");
                    txtTest4.setText("D) корея");
                    txtTest5.setText("");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Азияның мешеу елдерін көрсет");
                    txtTest1.setText("A) Израиль");
                    txtTest2.setText("B) Иран, Ирак");
                    txtTest3.setText("C) Жапония, Қытай");
                    txtTest4.setText("D) Бутан, Йемен");
                    txtTest5.setText("");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Жаңа индустриялық елдерді ата");
                    txtTest1.setText("A) Оман, Бахрейн");
                    txtTest2.setText("B) Тайвань, Сингапур");
                    txtTest3.setText("C) Пәкістан, Бангладеш");
                    txtTest4.setText("D) Мальдив, Лаос");
                    txtTest5.setText("");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Жапониядағы ең үлкен мегалополис");
                    txtTest1.setText("A) Токио");
                    txtTest2.setText("B) Осака");
                    txtTest3.setText("C) Иокогама");
                    txtTest4.setText("D) Токайдо");
                    txtTest5.setText("");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Қытайдың басты ауыл шаруашылық дақылдары");
                    txtTest1.setText("A) күріш, бидай");
                    txtTest2.setText("B) Мақта");
                    txtTest3.setText("C) жүгері, тары");
                    txtTest4.setText("D) Қант құрағы, жержаңғақ");
                    txtTest5.setText("");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Үндістан тәуелсіздігін қашан алды?");
                    txtTest1.setText("A) 1923");
                    txtTest2.setText("B) 1949");
                    txtTest3.setText("C) 1947");
                    txtTest4.setText("D) 1960");
                    txtTest5.setText("");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Үндістанның негізгі сауда серіктестерін атаңыз");
                    txtTest1.setText("A) АҚШ");
                    txtTest2.setText("B) Беларусь");
                    txtTest3.setText("C) Корея");
                    txtTest4.setText("D) Қазақстан");
                    txtTest5.setText("");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Түркияның ұлттық заң шығарушы органы");
                    txtTest1.setText("A) Парламент");
                    txtTest2.setText("B) Президент");
                    txtTest3.setText("C) Ұлттық мәжіліс");
                    txtTest4.setText("D) Өкімет");
                    txtTest5.setText("");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Түркияның халық саны");
                    txtTest1.setText("A) 25000");
                    txtTest2.setText("B) 68, 1 млн.");
                    txtTest3.setText("C) 46, 9 млн.");
                    txtTest4.setText("D) 9 млн.");
                    txtTest5.setText("");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Мұнай экспорттаушы елдерді көрсет");
                    txtTest1.setText("A) Сауд Арабиясы, Катар");
                    txtTest2.setText("B) Оман, Корея");
                    txtTest3.setText("C) Қытай, Индонезия");
                    txtTest4.setText("D) Кувейт, Алжир");
                    txtTest5.setText("");
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
                    String name = "Лекция 6";
                    String nameStudent = sName;

                    DatabaseHandler db = new DatabaseHandler(this);
                    db.addMark(new MarkData(name, nameStudent, correct1));
                    List<MarkData> markDatas = db.getAllMarks();
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
                break;

        }
    }
}
