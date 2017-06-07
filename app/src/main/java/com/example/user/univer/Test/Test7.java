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
public class Test7 extends Activity implements View.OnClickListener {

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

        question.setText("Аустралияның қысқы айлары");
        txtTest1.setText("A) Желтоқсан, ақпан аралығы");
        txtTest2.setText("B) Шілде, тамыз аралығы");
        txtTest3.setText("C) Қаңтар, ақпан аралығы");
        txtTest4.setText("D) Ақпан, желтоқсан аралығы");
        txtTest5.setText("E) Наурыз, сәуір аралығы");
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
                    question.setText("Аустралияның қысқы айлары");
                    txtTest1.setText("A) Желтоқсан, ақпан аралығы");
                    txtTest2.setText("B) Шілде, тамыз аралығы");
                    txtTest3.setText("C) Қаңтар, ақпан аралығы");
                    txtTest4.setText("D) Ақпан, желтоқсан аралығы");
                    txtTest5.setText("E) Наурыз, сәуір аралығы");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Ең Үлкен Артезиан алабы орналасқан материк");
                    txtTest1.setText("A) Африка ");
                    txtTest2.setText("B) Антарктида");
                    txtTest3.setText("C) Аустралия");
                    txtTest4.setText("D) Оңтүстік Америка");
                    txtTest5.setText("E) Солтүстік Америка ");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Аустралияда көп алқапты алып жатыр");
                    txtTest1.setText("A) Ормандар");
                    txtTest2.setText("B) Шөлдер");
                    txtTest3.setText("C) Шөлейттер");
                    txtTest4.setText("D) Далалар");
                    txtTest5.setText("E) Саванналар");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Аустралияның оңтүстігіндегі шөлдерді “налларбор” деп атаған саяхатшы");
                    txtTest1.setText("A) Д. Ливингстон");
                    txtTest2.setText("B) Д. Кук");
                    txtTest3.setText("C) Д. Эйр");
                    txtTest4.setText("D) А. Тасмания");
                    txtTest5.setText("E) Васко да Гамма ");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Аустралияда жиі болып тұратын желдер аталады");
                    txtTest1.setText("A) Дауылдар");
                    txtTest2.setText("B) Тасқындар");
                    txtTest3.setText("C) Вилли-Вилли");
                    txtTest4.setText("D) Шаңдар");
                    txtTest5.setText("E) Самал");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Тасмания аралындағы жыртқыш аң");
                    txtTest1.setText("A) Қалталы аю");
                    txtTest2.setText("B) Кенгуру ");
                    txtTest3.setText("C) Қалталы құбыжық");
                    txtTest4.setText("D) Вомбат");
                    txtTest5.setText("E) Ехидна");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Аустралияның егістіктері мен ормандарын отап тоздырған жануарлар");
                    txtTest1.setText("A) Динго иті");
                    txtTest2.setText("B) Түлкілер");
                    txtTest3.setText("C) Үй қояндары");
                    txtTest4.setText("D) Егеу құйрықтар");
                    txtTest5.setText("E) Тышқандар");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Аустралияның күміс ақшаларына таңбаланған");
                    txtTest1.setText("A) Кенгуру");
                    txtTest2.setText("B) Ехидна");
                    txtTest3.setText("C) Киви");
                    txtTest4.setText("D) Эму");
                    txtTest5.setText("E) Коала ");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Ел таңбасында Эму түейқұсы мен Кенгуру бейнеленген мемлекет");
                    txtTest1.setText("A) АҚШ");
                    txtTest2.setText("B) Жапония");
                    txtTest3.setText("C) Аустралия Одағы");
                    txtTest4.setText("");
                    txtTest5.setText("");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Аустралия Одағы жерінің ауданы бойынша дүниежүзінде");
                    txtTest1.setText("A) 4-ші орында ");
                    txtTest2.setText("B) 5-ші орында ");
                    txtTest3.setText("C) 6-шы орында ");
                    txtTest4.setText("D) 7-ші орында ");
                    txtTest5.setText("E) 8-ші орында");
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
                    String name = "Аустралия материгі бойынша тест";
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
            case R.id.varB:
                if(count==0){
                    question.setText("Аустралияның қысқы айлары");
                    txtTest1.setText("A) Желтоқсан, ақпан аралығы");
                    txtTest2.setText("B) Шілде, тамыз аралығы");
                    txtTest3.setText("C) Қаңтар, ақпан аралығы");
                    txtTest4.setText("D) Ақпан, желтоқсан аралығы");
                    txtTest5.setText("E) Наурыз, сәуір аралығы");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Ең Үлкен Артезиан алабы орналасқан материк");
                    txtTest1.setText("A) Африка ");
                    txtTest2.setText("B) Антарктида");
                    txtTest3.setText("C) Аустралия");
                    txtTest4.setText("D) Оңтүстік Америка");
                    txtTest5.setText("E) Солтүстік Америка ");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Аустралияда көп алқапты алып жатыр");
                    txtTest1.setText("A) Ормандар");
                    txtTest2.setText("B) Шөлдер");
                    txtTest3.setText("C) Шөлейттер");
                    txtTest4.setText("D) Далалар");
                    txtTest5.setText("E) Саванналар");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Аустралияның оңтүстігіндегі шөлдерді “налларбор” деп атаған саяхатшы");
                    txtTest1.setText("A) Д. Ливингстон");
                    txtTest2.setText("B) Д. Кук");
                    txtTest3.setText("C) Д. Эйр");
                    txtTest4.setText("D) А. Тасмания");
                    txtTest5.setText("E) Васко да Гамма ");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Аустралияда жиі болып тұратын желдер аталады");
                    txtTest1.setText("A) Дауылдар");
                    txtTest2.setText("B) Тасқындар");
                    txtTest3.setText("C) Вилли-Вилли");
                    txtTest4.setText("D) Шаңдар");
                    txtTest5.setText("E) Самал");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Тасмания аралындағы жыртқыш аң");
                    txtTest1.setText("A) Қалталы аю");
                    txtTest2.setText("B) Кенгуру ");
                    txtTest3.setText("C) Қалталы құбыжық");
                    txtTest4.setText("D) Вомбат");
                    txtTest5.setText("E) Ехидна");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Аустралияның егістіктері мен ормандарын отап тоздырған жануарлар");
                    txtTest1.setText("A) Динго иті");
                    txtTest2.setText("B) Түлкілер");
                    txtTest3.setText("C) Үй қояндары");
                    txtTest4.setText("D) Егеу құйрықтар");
                    txtTest5.setText("E) Тышқандар");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Аустралияның күміс ақшаларына таңбаланған");
                    txtTest1.setText("A) Кенгуру");
                    txtTest2.setText("B) Ехидна");
                    txtTest3.setText("C) Киви");
                    txtTest4.setText("D) Эму");
                    txtTest5.setText("E) Коала ");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Ел таңбасында Эму түейқұсы мен Кенгуру бейнеленген мемлекет");
                    txtTest1.setText("A) АҚШ");
                    txtTest2.setText("B) Жапония");
                    txtTest3.setText("C) Аустралия Одағы");
                    txtTest4.setText("");
                    txtTest5.setText("");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Аустралия Одағы жерінің ауданы бойынша дүниежүзінде");
                    txtTest1.setText("A) 4-ші орында ");
                    txtTest2.setText("B) 5-ші орында ");
                    txtTest3.setText("C) 6-шы орында ");
                    txtTest4.setText("D) 7-ші орында ");
                    txtTest5.setText("E) 8-ші орында");
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
                    String name = "Аустралия материгі бойынша тест";
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
            case R.id.varC:
                if(count==0){
                    question.setText("Аустралияның қысқы айлары");
                    txtTest1.setText("A) Желтоқсан, ақпан аралығы");
                    txtTest2.setText("B) Шілде, тамыз аралығы");
                    txtTest3.setText("C) Қаңтар, ақпан аралығы");
                    txtTest4.setText("D) Ақпан, желтоқсан аралығы");
                    txtTest5.setText("E) Наурыз, сәуір аралығы");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Ең Үлкен Артезиан алабы орналасқан материк");
                    txtTest1.setText("A) Африка ");
                    txtTest2.setText("B) Антарктида");
                    txtTest3.setText("C) Аустралия");
                    txtTest4.setText("D) Оңтүстік Америка");
                    txtTest5.setText("E) Солтүстік Америка ");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Аустралияда көп алқапты алып жатыр");
                    txtTest1.setText("A) Ормандар");
                    txtTest2.setText("B) Шөлдер");
                    txtTest3.setText("C) Шөлейттер");
                    txtTest4.setText("D) Далалар");
                    txtTest5.setText("E) Саванналар");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Аустралияның оңтүстігіндегі шөлдерді “налларбор” деп атаған саяхатшы");
                    txtTest1.setText("A) Д. Ливингстон");
                    txtTest2.setText("B) Д. Кук");
                    txtTest3.setText("C) Д. Эйр");
                    txtTest4.setText("D) А. Тасмания");
                    txtTest5.setText("E) Васко да Гамма ");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Аустралияда жиі болып тұратын желдер аталады");
                    txtTest1.setText("A) Дауылдар");
                    txtTest2.setText("B) Тасқындар");
                    txtTest3.setText("C) Вилли-Вилли");
                    txtTest4.setText("D) Шаңдар");
                    txtTest5.setText("E) Самал");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Тасмания аралындағы жыртқыш аң");
                    txtTest1.setText("A) Қалталы аю");
                    txtTest2.setText("B) Кенгуру ");
                    txtTest3.setText("C) Қалталы құбыжық");
                    txtTest4.setText("D) Вомбат");
                    txtTest5.setText("E) Ехидна");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Аустралияның егістіктері мен ормандарын отап тоздырған жануарлар");
                    txtTest1.setText("A) Динго иті");
                    txtTest2.setText("B) Түлкілер");
                    txtTest3.setText("C) Үй қояндары");
                    txtTest4.setText("D) Егеу құйрықтар");
                    txtTest5.setText("E) Тышқандар");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Аустралияның күміс ақшаларына таңбаланған");
                    txtTest1.setText("A) Кенгуру");
                    txtTest2.setText("B) Ехидна");
                    txtTest3.setText("C) Киви");
                    txtTest4.setText("D) Эму");
                    txtTest5.setText("E) Коала ");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Ел таңбасында Эму түейқұсы мен Кенгуру бейнеленген мемлекет");
                    txtTest1.setText("A) АҚШ");
                    txtTest2.setText("B) Жапония");
                    txtTest3.setText("C) Аустралия Одағы");
                    txtTest4.setText("");
                    txtTest5.setText("");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Аустралия Одағы жерінің ауданы бойынша дүниежүзінде");
                    txtTest1.setText("A) 4-ші орында ");
                    txtTest2.setText("B) 5-ші орында ");
                    txtTest3.setText("C) 6-шы орында ");
                    txtTest4.setText("D) 7-ші орында ");
                    txtTest5.setText("E) 8-ші орында");
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
                    String name = "Аустралия материгі бойынша тест";
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
                    correct++;
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
                    correct++;
                    count++;
                }
                else if(count==9){
                    correct++;
                    count++;
                }
                break;
            case R.id.varD:
                if(count==0){
                    question.setText("Аустралияның қысқы айлары");
                    txtTest1.setText("A) Желтоқсан, ақпан аралығы");
                    txtTest2.setText("B) Шілде, тамыз аралығы");
                    txtTest3.setText("C) Қаңтар, ақпан аралығы");
                    txtTest4.setText("D) Ақпан, желтоқсан аралығы");
                    txtTest5.setText("E) Наурыз, сәуір аралығы");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Ең Үлкен Артезиан алабы орналасқан материк");
                    txtTest1.setText("A) Африка ");
                    txtTest2.setText("B) Антарктида");
                    txtTest3.setText("C) Аустралия");
                    txtTest4.setText("D) Оңтүстік Америка");
                    txtTest5.setText("E) Солтүстік Америка ");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Аустралияда көп алқапты алып жатыр");
                    txtTest1.setText("A) Ормандар");
                    txtTest2.setText("B) Шөлдер");
                    txtTest3.setText("C) Шөлейттер");
                    txtTest4.setText("D) Далалар");
                    txtTest5.setText("E) Саванналар");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Аустралияның оңтүстігіндегі шөлдерді “налларбор” деп атаған саяхатшы");
                    txtTest1.setText("A) Д. Ливингстон");
                    txtTest2.setText("B) Д. Кук");
                    txtTest3.setText("C) Д. Эйр");
                    txtTest4.setText("D) А. Тасмания");
                    txtTest5.setText("E) Васко да Гамма ");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Аустралияда жиі болып тұратын желдер аталады");
                    txtTest1.setText("A) Дауылдар");
                    txtTest2.setText("B) Тасқындар");
                    txtTest3.setText("C) Вилли-Вилли");
                    txtTest4.setText("D) Шаңдар");
                    txtTest5.setText("E) Самал");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Тасмания аралындағы жыртқыш аң");
                    txtTest1.setText("A) Қалталы аю");
                    txtTest2.setText("B) Кенгуру ");
                    txtTest3.setText("C) Қалталы құбыжық");
                    txtTest4.setText("D) Вомбат");
                    txtTest5.setText("E) Ехидна");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Аустралияның егістіктері мен ормандарын отап тоздырған жануарлар");
                    txtTest1.setText("A) Динго иті");
                    txtTest2.setText("B) Түлкілер");
                    txtTest3.setText("C) Үй қояндары");
                    txtTest4.setText("D) Егеу құйрықтар");
                    txtTest5.setText("E) Тышқандар");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Аустралияның күміс ақшаларына таңбаланған");
                    txtTest1.setText("A) Кенгуру");
                    txtTest2.setText("B) Ехидна");
                    txtTest3.setText("C) Киви");
                    txtTest4.setText("D) Эму");
                    txtTest5.setText("E) Коала ");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Ел таңбасында Эму түейқұсы мен Кенгуру бейнеленген мемлекет");
                    txtTest1.setText("A) АҚШ");
                    txtTest2.setText("B) Жапония");
                    txtTest3.setText("C) Аустралия Одағы");
                    txtTest4.setText("");
                    txtTest5.setText("");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Аустралия Одағы жерінің ауданы бойынша дүниежүзінде");
                    txtTest1.setText("A) 4-ші орында ");
                    txtTest2.setText("B) 5-ші орында ");
                    txtTest3.setText("C) 6-шы орында ");
                    txtTest4.setText("D) 7-ші орында ");
                    txtTest5.setText("E) 8-ші орында");
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
                    String name = "Аустралия материгі бойынша тест";
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
                if(count==0){
                    question.setText("Аустралияның қысқы айлары");
                    txtTest1.setText("A) Желтоқсан, ақпан аралығы");
                    txtTest2.setText("B) Шілде, тамыз аралығы");
                    txtTest3.setText("C) Қаңтар, ақпан аралығы");
                    txtTest4.setText("D) Ақпан, желтоқсан аралығы");
                    txtTest5.setText("E) Наурыз, сәуір аралығы");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Ең Үлкен Артезиан алабы орналасқан материк");
                    txtTest1.setText("A) Африка ");
                    txtTest2.setText("B) Антарктида");
                    txtTest3.setText("C) Аустралия");
                    txtTest4.setText("D) Оңтүстік Америка");
                    txtTest5.setText("E) Солтүстік Америка ");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Аустралияда көп алқапты алып жатыр");
                    txtTest1.setText("A) Ормандар");
                    txtTest2.setText("B) Шөлдер");
                    txtTest3.setText("C) Шөлейттер");
                    txtTest4.setText("D) Далалар");
                    txtTest5.setText("E) Саванналар");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Аустралияның оңтүстігіндегі шөлдерді “налларбор” деп атаған саяхатшы");
                    txtTest1.setText("A) Д. Ливингстон");
                    txtTest2.setText("B) Д. Кук");
                    txtTest3.setText("C) Д. Эйр");
                    txtTest4.setText("D) А. Тасмания");
                    txtTest5.setText("E) Васко да Гамма ");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Аустралияда жиі болып тұратын желдер аталады");
                    txtTest1.setText("A) Дауылдар");
                    txtTest2.setText("B) Тасқындар");
                    txtTest3.setText("C) Вилли-Вилли");
                    txtTest4.setText("D) Шаңдар");
                    txtTest5.setText("E) Самал");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Тасмания аралындағы жыртқыш аң");
                    txtTest1.setText("A) Қалталы аю");
                    txtTest2.setText("B) Кенгуру ");
                    txtTest3.setText("C) Қалталы құбыжық");
                    txtTest4.setText("D) Вомбат");
                    txtTest5.setText("E) Ехидна");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Аустралияның егістіктері мен ормандарын отап тоздырған жануарлар");
                    txtTest1.setText("A) Динго иті");
                    txtTest2.setText("B) Түлкілер");
                    txtTest3.setText("C) Үй қояндары");
                    txtTest4.setText("D) Егеу құйрықтар");
                    txtTest5.setText("E) Тышқандар");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Аустралияның күміс ақшаларына таңбаланған");
                    txtTest1.setText("A) Кенгуру");
                    txtTest2.setText("B) Ехидна");
                    txtTest3.setText("C) Киви");
                    txtTest4.setText("D) Эму");
                    txtTest5.setText("E) Коала ");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Ел таңбасында Эму түейқұсы мен Кенгуру бейнеленген мемлекет");
                    txtTest1.setText("A) АҚШ");
                    txtTest2.setText("B) Жапония");
                    txtTest3.setText("C) Аустралия Одағы");
                    txtTest4.setText("");
                    txtTest5.setText("");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Аустралия Одағы жерінің ауданы бойынша дүниежүзінде");
                    txtTest1.setText("A) 4-ші орында ");
                    txtTest2.setText("B) 5-ші орында ");
                    txtTest3.setText("C) 6-шы орында ");
                    txtTest4.setText("D) 7-ші орында ");
                    txtTest5.setText("E) 8-ші орында");
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
                    String name = "Аустралия материгі бойынша тест";
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

        }
    }
}
