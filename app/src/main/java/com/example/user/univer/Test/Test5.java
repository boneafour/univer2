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
public class Test5 extends Activity implements View.OnClickListener {

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

        Intent intent4 = getIntent();
        sName = intent4.getStringExtra("sName");

        question = (TextView) findViewById(R.id.question);
        question.setText("Дүние жүзінде қазіргі кезде ... монархия бар");

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

        question.setText("Қай жылы Дүниежүзілік сауда ұйымы құрылды.");
        txtTest1.setText("А) 1990 ж.");
        txtTest2.setText("В) 1991 ж.");
        txtTest3.setText("С) 1992 ж.");
        txtTest4.setText("Д) 1994 ж.");
        txtTest5.setText("Е) 1995 ж.");
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
                    question.setText("Қай жылы Дүниежүзілік сауда ұйымы құрылды.");
                    txtTest1.setText("А) 1990 ж.");
                    txtTest2.setText("В) 1991 ж.");
                    txtTest3.setText("С) 1992 ж.");
                    txtTest4.setText("Д) 1994 ж.");
                    txtTest5.setText("Е) 1995 ж.");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Халықаралық нарық жүйесінің неше ірі құрылымы бар?");
                    txtTest1.setText("А) 2");
                    txtTest2.setText("В) 3");
                    txtTest3.setText("С) 4");
                    txtTest4.setText("Д) 5");
                    txtTest5.setText("Е) 7");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("ХХ ғ-ң 80-жылдарында Батыс Еуропада қолданылған ақша бірлігі");
                    txtTest1.setText("А) еуро");
                    txtTest2.setText("В) рубль");
                    txtTest3.setText("С) экю");
                    txtTest4.setText("Д) реал");
                    txtTest5.setText("Е) форинг");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Халықаралық инвестиция нарығындағы еуронарықтық ең ірі орталығы");
                    txtTest1.setText("А ) Лондон");
                    txtTest2.setText("В) Нью-Йорк");
                    txtTest3.setText("С) Токио");
                    txtTest4.setText("Д) Париж");
                    txtTest5.setText("Е) Сеул");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Әлемдегі ең ірі тау шаңғысы туризмінің орталығы");
                    txtTest1.setText("А) Анд");
                    txtTest2.setText("В) Альпі");
                    txtTest3.setText("С) Гималай");
                    txtTest4.setText("Д) Тянь-Шань");
                    txtTest5.setText("Е) Памир");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Теңізді айналып жүзу (круиз) халықаралық туризмінің дәстүрлі аудандарна жатады");
                    txtTest1.setText("А) Мұхит аралдары, Кипр");
                    txtTest2.setText("В) Жерорта теңізі, Кариб алабы, Мұхит аралдары");
                    txtTest3.setText("С) Қара теңіз, Қызыл теңіз");
                    txtTest4.setText("Д) Охот теңізі, Арабия теңізі, Сан-Паулу аралы");
                    txtTest5.setText("Е) Кариб теңізі, Баренц теңізі");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Христиан дінінің қасиетті жәдігерлері қай қалада шоғырланған?");
                    txtTest1.setText("А) Сауд Арабиясы");
                    txtTest2.setText("В) Түркістан");
                    txtTest3.setText("С) Иерусалим");
                    txtTest4.setText("Д) Александрия");
                    txtTest5.setText("Е) Мекке");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Ұлтаралық бірлестіктер үлесіне дүние жүзіндегі өнеркәсіп өнімінің қанша пайызы тиесілі?");
                    txtTest1.setText("А) 20%");
                    txtTest2.setText("В) 30%");
                    txtTest3.setText("С) 35%");
                    txtTest4.setText("Д) 40% ");
                    txtTest5.setText("Е) 70%");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Мұнай экспорттайтын елдер ұйымына мүше елдер");
                    txtTest1.setText("А) Аустралия, АҚШ, Малайзия");
                    txtTest2.setText("В) Чили, Вьетнам, Перу");
                    txtTest3.setText("С) Египет, Ирак, Сирия");
                    txtTest4.setText("Д) Алжир, Индонезия, Эквадор");
                    txtTest5.setText("Е) Франция, Аустрия, Дания ");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("ХХ ғ-ң 60 ж-да құрылған одақ");
                    txtTest1.setText("А) БҰҰ");
                    txtTest2.setText("В) ЕО");
                    txtTest3.setText("С) ЮНЕСКО");
                    txtTest4.setText("Д) НАТО");
                    txtTest5.setText("Е) АСЕАН");
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
                    String name = "Лекция 5";
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
            case R.id.varB:
                if(count==0){
                    question.setText("Қай жылы Дүниежүзілік сауда ұйымы құрылды.");
                    txtTest1.setText("А) 1990 ж.");
                    txtTest2.setText("В) 1991 ж.");
                    txtTest3.setText("С) 1992 ж.");
                    txtTest4.setText("Д) 1994 ж.");
                    txtTest5.setText("Е) 1995 ж.");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Халықаралық нарық жүйесінің неше ірі құрылымы бар?");
                    txtTest1.setText("А) 2");
                    txtTest2.setText("В) 3");
                    txtTest3.setText("С) 4");
                    txtTest4.setText("Д) 5");
                    txtTest5.setText("Е) 7");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("ХХ ғ-ң 80-жылдарында Батыс Еуропада қолданылған ақша бірлігі");
                    txtTest1.setText("А) еуро");
                    txtTest2.setText("В) рубль");
                    txtTest3.setText("С) экю");
                    txtTest4.setText("Д) реал");
                    txtTest5.setText("Е) форинг");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Халықаралық инвестиция нарығындағы еуронарықтық ең ірі орталығы");
                    txtTest1.setText("А ) Лондон");
                    txtTest2.setText("В) Нью-Йорк");
                    txtTest3.setText("С) Токио");
                    txtTest4.setText("Д) Париж");
                    txtTest5.setText("Е) Сеул");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Әлемдегі ең ірі тау шаңғысы туризмінің орталығы");
                    txtTest1.setText("А) Анд");
                    txtTest2.setText("В) Альпі");
                    txtTest3.setText("С) Гималай");
                    txtTest4.setText("Д) Тянь-Шань");
                    txtTest5.setText("Е) Памир");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Теңізді айналып жүзу (круиз) халықаралық туризмінің дәстүрлі аудандарна жатады");
                    txtTest1.setText("А) Мұхит аралдары, Кипр");
                    txtTest2.setText("В) Жерорта теңізі, Кариб алабы, Мұхит аралдары");
                    txtTest3.setText("С) Қара теңіз, Қызыл теңіз");
                    txtTest4.setText("Д) Охот теңізі, Арабия теңізі, Сан-Паулу аралы");
                    txtTest5.setText("Е) Кариб теңізі, Баренц теңізі");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Христиан дінінің қасиетті жәдігерлері қай қалада шоғырланған?");
                    txtTest1.setText("А) Сауд Арабиясы");
                    txtTest2.setText("В) Түркістан");
                    txtTest3.setText("С) Иерусалим");
                    txtTest4.setText("Д) Александрия");
                    txtTest5.setText("Е) Мекке");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Ұлтаралық бірлестіктер үлесіне дүние жүзіндегі өнеркәсіп өнімінің қанша пайызы тиесілі?");
                    txtTest1.setText("А) 20%");
                    txtTest2.setText("В) 30%");
                    txtTest3.setText("С) 35%");
                    txtTest4.setText("Д) 40% ");
                    txtTest5.setText("Е) 70%");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Мұнай экспорттайтын елдер ұйымына мүше елдер");
                    txtTest1.setText("А) Аустралия, АҚШ, Малайзия");
                    txtTest2.setText("В) Чили, Вьетнам, Перу");
                    txtTest3.setText("С) Египет, Ирак, Сирия");
                    txtTest4.setText("Д) Алжир, Индонезия, Эквадор");
                    txtTest5.setText("Е) Франция, Аустрия, Дания ");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("ХХ ғ-ң 60 ж-да құрылған одақ");
                    txtTest1.setText("А) БҰҰ");
                    txtTest2.setText("В) ЕО");
                    txtTest3.setText("С) ЮНЕСКО");
                    txtTest4.setText("Д) НАТО");
                    txtTest5.setText("Е) АСЕАН");
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
                    String name = "Лекция 5";
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
                    correct++;
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
            case R.id.varC:
                if(count==0){
                    question.setText("Қай жылы Дүниежүзілік сауда ұйымы құрылды.");
                    txtTest1.setText("А) 1990 ж.");
                    txtTest2.setText("В) 1991 ж.");
                    txtTest3.setText("С) 1992 ж.");
                    txtTest4.setText("Д) 1994 ж.");
                    txtTest5.setText("Е) 1995 ж.");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Халықаралық нарық жүйесінің неше ірі құрылымы бар?");
                    txtTest1.setText("А) 2");
                    txtTest2.setText("В) 3");
                    txtTest3.setText("С) 4");
                    txtTest4.setText("Д) 5");
                    txtTest5.setText("Е) 7");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("ХХ ғ-ң 80-жылдарында Батыс Еуропада қолданылған ақша бірлігі");
                    txtTest1.setText("А) еуро");
                    txtTest2.setText("В) рубль");
                    txtTest3.setText("С) экю");
                    txtTest4.setText("Д) реал");
                    txtTest5.setText("Е) форинг");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Халықаралық инвестиция нарығындағы еуронарықтық ең ірі орталығы");
                    txtTest1.setText("А ) Лондон");
                    txtTest2.setText("В) Нью-Йорк");
                    txtTest3.setText("С) Токио");
                    txtTest4.setText("Д) Париж");
                    txtTest5.setText("Е) Сеул");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Әлемдегі ең ірі тау шаңғысы туризмінің орталығы");
                    txtTest1.setText("А) Анд");
                    txtTest2.setText("В) Альпі");
                    txtTest3.setText("С) Гималай");
                    txtTest4.setText("Д) Тянь-Шань");
                    txtTest5.setText("Е) Памир");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Теңізді айналып жүзу (круиз) халықаралық туризмінің дәстүрлі аудандарна жатады");
                    txtTest1.setText("А) Мұхит аралдары, Кипр");
                    txtTest2.setText("В) Жерорта теңізі, Кариб алабы, Мұхит аралдары");
                    txtTest3.setText("С) Қара теңіз, Қызыл теңіз");
                    txtTest4.setText("Д) Охот теңізі, Арабия теңізі, Сан-Паулу аралы");
                    txtTest5.setText("Е) Кариб теңізі, Баренц теңізі");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Христиан дінінің қасиетті жәдігерлері қай қалада шоғырланған?");
                    txtTest1.setText("А) Сауд Арабиясы");
                    txtTest2.setText("В) Түркістан");
                    txtTest3.setText("С) Иерусалим");
                    txtTest4.setText("Д) Александрия");
                    txtTest5.setText("Е) Мекке");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Ұлтаралық бірлестіктер үлесіне дүние жүзіндегі өнеркәсіп өнімінің қанша пайызы тиесілі?");
                    txtTest1.setText("А) 20%");
                    txtTest2.setText("В) 30%");
                    txtTest3.setText("С) 35%");
                    txtTest4.setText("Д) 40% ");
                    txtTest5.setText("Е) 70%");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Мұнай экспорттайтын елдер ұйымына мүше елдер");
                    txtTest1.setText("А) Аустралия, АҚШ, Малайзия");
                    txtTest2.setText("В) Чили, Вьетнам, Перу");
                    txtTest3.setText("С) Египет, Ирак, Сирия");
                    txtTest4.setText("Д) Алжир, Индонезия, Эквадор");
                    txtTest5.setText("Е) Франция, Аустрия, Дания ");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("ХХ ғ-ң 60 ж-да құрылған одақ");
                    txtTest1.setText("А) БҰҰ");
                    txtTest2.setText("В) ЕО");
                    txtTest3.setText("С) ЮНЕСКО");
                    txtTest4.setText("Д) НАТО");
                    txtTest5.setText("Е) АСЕАН");
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
                    String name = "Лекция 5";
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
            case R.id.varD:
                if(count==0){
                    question.setText("Қай жылы Дүниежүзілік сауда ұйымы құрылды.");
                    txtTest1.setText("А) 1990 ж.");
                    txtTest2.setText("В) 1991 ж.");
                    txtTest3.setText("С) 1992 ж.");
                    txtTest4.setText("Д) 1994 ж.");
                    txtTest5.setText("Е) 1995 ж.");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Халықаралық нарық жүйесінің неше ірі құрылымы бар?");
                    txtTest1.setText("А) 2");
                    txtTest2.setText("В) 3");
                    txtTest3.setText("С) 4");
                    txtTest4.setText("Д) 5");
                    txtTest5.setText("Е) 7");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("ХХ ғ-ң 80-жылдарында Батыс Еуропада қолданылған ақша бірлігі");
                    txtTest1.setText("А) еуро");
                    txtTest2.setText("В) рубль");
                    txtTest3.setText("С) экю");
                    txtTest4.setText("Д) реал");
                    txtTest5.setText("Е) форинг");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Халықаралық инвестиция нарығындағы еуронарықтық ең ірі орталығы");
                    txtTest1.setText("А ) Лондон");
                    txtTest2.setText("В) Нью-Йорк");
                    txtTest3.setText("С) Токио");
                    txtTest4.setText("Д) Париж");
                    txtTest5.setText("Е) Сеул");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Әлемдегі ең ірі тау шаңғысы туризмінің орталығы");
                    txtTest1.setText("А) Анд");
                    txtTest2.setText("В) Альпі");
                    txtTest3.setText("С) Гималай");
                    txtTest4.setText("Д) Тянь-Шань");
                    txtTest5.setText("Е) Памир");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Теңізді айналып жүзу (круиз) халықаралық туризмінің дәстүрлі аудандарна жатады");
                    txtTest1.setText("А) Мұхит аралдары, Кипр");
                    txtTest2.setText("В) Жерорта теңізі, Кариб алабы, Мұхит аралдары");
                    txtTest3.setText("С) Қара теңіз, Қызыл теңіз");
                    txtTest4.setText("Д) Охот теңізі, Арабия теңізі, Сан-Паулу аралы");
                    txtTest5.setText("Е) Кариб теңізі, Баренц теңізі");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Христиан дінінің қасиетті жәдігерлері қай қалада шоғырланған?");
                    txtTest1.setText("А) Сауд Арабиясы");
                    txtTest2.setText("В) Түркістан");
                    txtTest3.setText("С) Иерусалим");
                    txtTest4.setText("Д) Александрия");
                    txtTest5.setText("Е) Мекке");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Ұлтаралық бірлестіктер үлесіне дүние жүзіндегі өнеркәсіп өнімінің қанша пайызы тиесілі?");
                    txtTest1.setText("А) 20%");
                    txtTest2.setText("В) 30%");
                    txtTest3.setText("С) 35%");
                    txtTest4.setText("Д) 40% ");
                    txtTest5.setText("Е) 70%");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Мұнай экспорттайтын елдер ұйымына мүше елдер");
                    txtTest1.setText("А) Аустралия, АҚШ, Малайзия");
                    txtTest2.setText("В) Чили, Вьетнам, Перу");
                    txtTest3.setText("С) Египет, Ирак, Сирия");
                    txtTest4.setText("Д) Алжир, Индонезия, Эквадор");
                    txtTest5.setText("Е) Франция, Аустрия, Дания ");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("ХХ ғ-ң 60 ж-да құрылған одақ");
                    txtTest1.setText("А) БҰҰ");
                    txtTest2.setText("В) ЕО");
                    txtTest3.setText("С) ЮНЕСКО");
                    txtTest4.setText("Д) НАТО");
                    txtTest5.setText("Е) АСЕАН");
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
                    String name = "Лекция 5";
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
                    correct++;
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
            case R.id.varE:
                if(count==0){
                    question.setText("Қай жылы Дүниежүзілік сауда ұйымы құрылды.");
                    txtTest1.setText("А) 1990 ж.");
                    txtTest2.setText("В) 1991 ж.");
                    txtTest3.setText("С) 1992 ж.");
                    txtTest4.setText("Д) 1994 ж.");
                    txtTest5.setText("Е) 1995 ж.");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Халықаралық нарық жүйесінің неше ірі құрылымы бар?");
                    txtTest1.setText("А) 2");
                    txtTest2.setText("В) 3");
                    txtTest3.setText("С) 4");
                    txtTest4.setText("Д) 5");
                    txtTest5.setText("Е) 7");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("ХХ ғ-ң 80-жылдарында Батыс Еуропада қолданылған ақша бірлігі");
                    txtTest1.setText("А) еуро");
                    txtTest2.setText("В) рубль");
                    txtTest3.setText("С) экю");
                    txtTest4.setText("Д) реал");
                    txtTest5.setText("Е) форинг");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Халықаралық инвестиция нарығындағы еуронарықтық ең ірі орталығы");
                    txtTest1.setText("А ) Лондон");
                    txtTest2.setText("В) Нью-Йорк");
                    txtTest3.setText("С) Токио");
                    txtTest4.setText("Д) Париж");
                    txtTest5.setText("Е) Сеул");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Әлемдегі ең ірі тау шаңғысы туризмінің орталығы");
                    txtTest1.setText("А) Анд");
                    txtTest2.setText("В) Альпі");
                    txtTest3.setText("С) Гималай");
                    txtTest4.setText("Д) Тянь-Шань");
                    txtTest5.setText("Е) Памир");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Теңізді айналып жүзу (круиз) халықаралық туризмінің дәстүрлі аудандарна жатады");
                    txtTest1.setText("А) Мұхит аралдары, Кипр");
                    txtTest2.setText("В) Жерорта теңізі, Кариб алабы, Мұхит аралдары");
                    txtTest3.setText("С) Қара теңіз, Қызыл теңіз");
                    txtTest4.setText("Д) Охот теңізі, Арабия теңізі, Сан-Паулу аралы");
                    txtTest5.setText("Е) Кариб теңізі, Баренц теңізі");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Христиан дінінің қасиетті жәдігерлері қай қалада шоғырланған?");
                    txtTest1.setText("А) Сауд Арабиясы");
                    txtTest2.setText("В) Түркістан");
                    txtTest3.setText("С) Иерусалим");
                    txtTest4.setText("Д) Александрия");
                    txtTest5.setText("Е) Мекке");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Ұлтаралық бірлестіктер үлесіне дүние жүзіндегі өнеркәсіп өнімінің қанша пайызы тиесілі?");
                    txtTest1.setText("А) 20%");
                    txtTest2.setText("В) 30%");
                    txtTest3.setText("С) 35%");
                    txtTest4.setText("Д) 40% ");
                    txtTest5.setText("Е) 70%");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Мұнай экспорттайтын елдер ұйымына мүше елдер");
                    txtTest1.setText("А) Аустралия, АҚШ, Малайзия");
                    txtTest2.setText("В) Чили, Вьетнам, Перу");
                    txtTest3.setText("С) Египет, Ирак, Сирия");
                    txtTest4.setText("Д) Алжир, Индонезия, Эквадор");
                    txtTest5.setText("Е) Франция, Аустрия, Дания ");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("ХХ ғ-ң 60 ж-да құрылған одақ");
                    txtTest1.setText("А) БҰҰ");
                    txtTest2.setText("В) ЕО");
                    txtTest3.setText("С) ЮНЕСКО");
                    txtTest4.setText("Д) НАТО");
                    txtTest5.setText("Е) АСЕАН");
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
                    String name = "Лекция 5";
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
