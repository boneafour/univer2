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
public class Test3 extends Activity implements View.OnClickListener {

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

        Intent intent2 = getIntent();
        sName = intent2.getStringExtra("sName");

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
        question.setText("Адамзаттың тарихи даму кезеңіне және кәсіптік әрекетіне тікелей қатысатын жер табиғатының бөлігін қалай атаймыз?");
        txtTest1.setText("А) қоршаған орта");
        txtTest2.setText("В) табиғат сферасы");
        txtTest3.setText("С) табиғат ресурстары");
        txtTest4.setText("Д) географиялық орта");
        txtTest5.setText("Е) қоғам мен табиғат арасындағы байланыс");
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
                    question.setText("Адамзаттың тарихи даму кезеңіне және кәсіптік әрекетіне тікелей қатысатын жер табиғатының бөлігін қалай атаймыз?");
                    txtTest1.setText("А) қоршаған орта");
                    txtTest2.setText("В) табиғат сферасы");
                    txtTest3.setText("С) табиғат ресурстары");
                    txtTest4.setText("Д) географиялық орта");
                    txtTest5.setText("Е) қоғам мен табиғат арасындағы байланыс");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Сарқылмайтын ресурстарға нелер жатады?");
                    txtTest1.setText("А) пайдалы қазбалар");
                    txtTest2.setText("В) су, топырақ");
                    txtTest3.setText("С) күн энергиясы");
                    txtTest4.setText("Д) минералдық");
                    txtTest5.setText("Е) рекреациялық");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("2000 жылы дүниежүзіндегі мұнай қоры қанша млрд тоннаға жеткен?");
                    txtTest1.setText("А) 146 млрд тонна");
                    txtTest2.setText("В) 140 млрд тонна");
                    txtTest3.setText("С) 250-300 млрд тонна");
                    txtTest4.setText("Д) 300 млр тонна");
                    txtTest5.setText("Е) 3,5 млрд тонна");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Отын түрлерінің ішінде әлемде қоры өте мол");
                    txtTest1.setText("А) мұнай");
                    txtTest2.setText("В) газ");
                    txtTest3.setText("С) көмір");
                    txtTest4.setText("Д) радиактивті материалдар");
                    txtTest5.setText("Е) жанғыш тақтатас");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Көмір экспорттаушы ірі елдер қатарына қай елдер енеді?");
                    txtTest1.setText("А) АҚШ, Германия, Аустралия");
                    txtTest2.setText("В) Аустралия, Канада, Калумбия");
                    txtTest3.setText("С) Қытай, АҚШ, Үндістан");
                    txtTest4.setText("Д) ОАР, Аустралия, АҚШ");
                    txtTest5.setText("Е) Кувейт, Сауд Арабиясы, Германия");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Қазақстанда егістікке жарамды жердің жалпы ауданы қанша?");
                    txtTest1.setText("А) 11 млн га");
                    txtTest2.setText("В) 26 млн га");
                    txtTest3.setText("С) 28 млн га");
                    txtTest4.setText("Д) 32 млн га");
                    txtTest5.setText("Е) 36 млн га");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Солтүстік орман белдеуі әлемдік орман массивтерінің қанша бөлігін құрайды?");
                    txtTest1.setText("А)1/4 бөлігін");
                    txtTest2.setText("В) ½ бөлігін");
                    txtTest3.setText("С) 1/3 бөлігін ");
                    txtTest4.setText("Д) 2/3 бөлігін");
                    txtTest5.setText("Е) 2/4 бөлігін");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Адам пайдаланатын теңіз биомассасының қанша пайызын балықтар құрайды");
                    txtTest1.setText("А) 100%-ын");
                    txtTest2.setText("В) 12% -ын");
                    txtTest3.setText("С) 85%-ын");
                    txtTest4.setText("Д) 92%-ын");
                    txtTest5.setText("Е) 97%-ын");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Мұхиттың қанша бөлігін органикалық тіршілігі кедей аудандар алып жатыр?");
                    txtTest1.setText("А) 1/2-ін");
                    txtTest2.setText("В) 1/3-ін");
                    txtTest3.setText("С) 1/4-ін");
                    txtTest4.setText("Д) 2/3-ін");
                    txtTest5.setText("Е) 3/4-ін");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Рекреациялық ресурстар неше топқа жіктеледі?");
                    txtTest1.setText("А) 2");
                    txtTest2.setText("В) 3");
                    txtTest3.setText("С) 4");
                    txtTest4.setText("Д) 5");
                    txtTest5.setText("Е) 6");
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
                    String name = "Лекция 3";
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
                    question.setText("Адамзаттың тарихи даму кезеңіне және кәсіптік әрекетіне тікелей қатысатын жер табиғатының бөлігін қалай атаймыз?");
                    txtTest1.setText("А) қоршаған орта");
                    txtTest2.setText("В) табиғат сферасы");
                    txtTest3.setText("С) табиғат ресурстары");
                    txtTest4.setText("Д) географиялық орта");
                    txtTest5.setText("Е) қоғам мен табиғат арасындағы байланыс");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Сарқылмайтын ресурстарға нелер жатады?");
                    txtTest1.setText("А) пайдалы қазбалар");
                    txtTest2.setText("В) су, топырақ");
                    txtTest3.setText("С) күн энергиясы");
                    txtTest4.setText("Д) минералдық");
                    txtTest5.setText("Е) рекреациялық");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("2000 жылы дүниежүзіндегі мұнай қоры қанша млрд тоннаға жеткен?");
                    txtTest1.setText("А) 146 млрд тонна");
                    txtTest2.setText("В) 140 млрд тонна");
                    txtTest3.setText("С) 250-300 млрд тонна");
                    txtTest4.setText("Д) 300 млр тонна");
                    txtTest5.setText("Е) 3,5 млрд тонна");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Отын түрлерінің ішінде әлемде қоры өте мол");
                    txtTest1.setText("А) мұнай");
                    txtTest2.setText("В) газ");
                    txtTest3.setText("С) көмір");
                    txtTest4.setText("Д) радиактивті материалдар");
                    txtTest5.setText("Е) жанғыш тақтатас");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Көмір экспорттаушы ірі елдер қатарына қай елдер енеді?");
                    txtTest1.setText("А) АҚШ, Германия, Аустралия");
                    txtTest2.setText("В) Аустралия, Канада, Калумбия");
                    txtTest3.setText("С) Қытай, АҚШ, Үндістан");
                    txtTest4.setText("Д) ОАР, Аустралия, АҚШ");
                    txtTest5.setText("Е) Кувейт, Сауд Арабиясы, Германия");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Қазақстанда егістікке жарамды жердің жалпы ауданы қанша?");
                    txtTest1.setText("А) 11 млн га");
                    txtTest2.setText("В) 26 млн га");
                    txtTest3.setText("С) 28 млн га");
                    txtTest4.setText("Д) 32 млн га");
                    txtTest5.setText("Е) 36 млн га");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Солтүстік орман белдеуі әлемдік орман массивтерінің қанша бөлігін құрайды?");
                    txtTest1.setText("А)1/4 бөлігін");
                    txtTest2.setText("В) ½ бөлігін");
                    txtTest3.setText("С) 1/3 бөлігін ");
                    txtTest4.setText("Д) 2/3 бөлігін");
                    txtTest5.setText("Е) 2/4 бөлігін");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Адам пайдаланатын теңіз биомассасының қанша пайызын балықтар құрайды");
                    txtTest1.setText("А) 100%-ын");
                    txtTest2.setText("В) 12% -ын");
                    txtTest3.setText("С) 85%-ын");
                    txtTest4.setText("Д) 92%-ын");
                    txtTest5.setText("Е) 97%-ын");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Мұхиттың қанша бөлігін органикалық тіршілігі кедей аудандар алып жатыр?");
                    txtTest1.setText("А) 1/2-ін");
                    txtTest2.setText("В) 1/3-ін");
                    txtTest3.setText("С) 1/4-ін");
                    txtTest4.setText("Д) 2/3-ін");
                    txtTest5.setText("Е) 3/4-ін");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Рекреациялық ресурстар неше топқа жіктеледі?");
                    txtTest1.setText("А) 2");
                    txtTest2.setText("В) 3");
                    txtTest3.setText("С) 4");
                    txtTest4.setText("Д) 5");
                    txtTest5.setText("Е) 6");
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
                    String name = "Лекция 3";
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
                    incorrect = (incorrect+" 10");
                    count++;
                }
                break;
            case R.id.varC:
                if(count==0){
                    question.setText("Адамзаттың тарихи даму кезеңіне және кәсіптік әрекетіне тікелей қатысатын жер табиғатының бөлігін қалай атаймыз?");
                    txtTest1.setText("А) қоршаған орта");
                    txtTest2.setText("В) табиғат сферасы");
                    txtTest3.setText("С) табиғат ресурстары");
                    txtTest4.setText("Д) географиялық орта");
                    txtTest5.setText("Е) қоғам мен табиғат арасындағы байланыс");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Сарқылмайтын ресурстарға нелер жатады?");
                    txtTest1.setText("А) пайдалы қазбалар");
                    txtTest2.setText("В) су, топырақ");
                    txtTest3.setText("С) күн энергиясы");
                    txtTest4.setText("Д) минералдық");
                    txtTest5.setText("Е) рекреациялық");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("2000 жылы дүниежүзіндегі мұнай қоры қанша млрд тоннаға жеткен?");
                    txtTest1.setText("А) 146 млрд тонна");
                    txtTest2.setText("В) 140 млрд тонна");
                    txtTest3.setText("С) 250-300 млрд тонна");
                    txtTest4.setText("Д) 300 млр тонна");
                    txtTest5.setText("Е) 3,5 млрд тонна");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Отын түрлерінің ішінде әлемде қоры өте мол");
                    txtTest1.setText("А) мұнай");
                    txtTest2.setText("В) газ");
                    txtTest3.setText("С) көмір");
                    txtTest4.setText("Д) радиактивті материалдар");
                    txtTest5.setText("Е) жанғыш тақтатас");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Көмір экспорттаушы ірі елдер қатарына қай елдер енеді?");
                    txtTest1.setText("А) АҚШ, Германия, Аустралия");
                    txtTest2.setText("В) Аустралия, Канада, Калумбия");
                    txtTest3.setText("С) Қытай, АҚШ, Үндістан");
                    txtTest4.setText("Д) ОАР, Аустралия, АҚШ");
                    txtTest5.setText("Е) Кувейт, Сауд Арабиясы, Германия");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Қазақстанда егістікке жарамды жердің жалпы ауданы қанша?");
                    txtTest1.setText("А) 11 млн га");
                    txtTest2.setText("В) 26 млн га");
                    txtTest3.setText("С) 28 млн га");
                    txtTest4.setText("Д) 32 млн га");
                    txtTest5.setText("Е) 36 млн га");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Солтүстік орман белдеуі әлемдік орман массивтерінің қанша бөлігін құрайды?");
                    txtTest1.setText("А)1/4 бөлігін");
                    txtTest2.setText("В) ½ бөлігін");
                    txtTest3.setText("С) 1/3 бөлігін ");
                    txtTest4.setText("Д) 2/3 бөлігін");
                    txtTest5.setText("Е) 2/4 бөлігін");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Адам пайдаланатын теңіз биомассасының қанша пайызын балықтар құрайды");
                    txtTest1.setText("А) 100%-ын");
                    txtTest2.setText("В) 12% -ын");
                    txtTest3.setText("С) 85%-ын");
                    txtTest4.setText("Д) 92%-ын");
                    txtTest5.setText("Е) 97%-ын");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Мұхиттың қанша бөлігін органикалық тіршілігі кедей аудандар алып жатыр?");
                    txtTest1.setText("А) 1/2-ін");
                    txtTest2.setText("В) 1/3-ін");
                    txtTest3.setText("С) 1/4-ін");
                    txtTest4.setText("Д) 2/3-ін");
                    txtTest5.setText("Е) 3/4-ін");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Рекреациялық ресурстар неше топқа жіктеледі?");
                    txtTest1.setText("А) 2");
                    txtTest2.setText("В) 3");
                    txtTest3.setText("С) 4");
                    txtTest4.setText("Д) 5");
                    txtTest5.setText("Е) 6");
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
                    String name = "Лекция 3";
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
                    correct++;
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
            case R.id.varD:
                if(count==0){
                    question.setText("Адамзаттың тарихи даму кезеңіне және кәсіптік әрекетіне тікелей қатысатын жер табиғатының бөлігін қалай атаймыз?");
                    txtTest1.setText("А) қоршаған орта");
                    txtTest2.setText("В) табиғат сферасы");
                    txtTest3.setText("С) табиғат ресурстары");
                    txtTest4.setText("Д) географиялық орта");
                    txtTest5.setText("Е) қоғам мен табиғат арасындағы байланыс");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Сарқылмайтын ресурстарға нелер жатады?");
                    txtTest1.setText("А) пайдалы қазбалар");
                    txtTest2.setText("В) су, топырақ");
                    txtTest3.setText("С) күн энергиясы");
                    txtTest4.setText("Д) минералдық");
                    txtTest5.setText("Е) рекреациялық");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("2000 жылы дүниежүзіндегі мұнай қоры қанша млрд тоннаға жеткен?");
                    txtTest1.setText("А) 146 млрд тонна");
                    txtTest2.setText("В) 140 млрд тонна");
                    txtTest3.setText("С) 250-300 млрд тонна");
                    txtTest4.setText("Д) 300 млр тонна");
                    txtTest5.setText("Е) 3,5 млрд тонна");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Отын түрлерінің ішінде әлемде қоры өте мол");
                    txtTest1.setText("А) мұнай");
                    txtTest2.setText("В) газ");
                    txtTest3.setText("С) көмір");
                    txtTest4.setText("Д) радиактивті материалдар");
                    txtTest5.setText("Е) жанғыш тақтатас");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Көмір экспорттаушы ірі елдер қатарына қай елдер енеді?");
                    txtTest1.setText("А) АҚШ, Германия, Аустралия");
                    txtTest2.setText("В) Аустралия, Канада, Калумбия");
                    txtTest3.setText("С) Қытай, АҚШ, Үндістан");
                    txtTest4.setText("Д) ОАР, Аустралия, АҚШ");
                    txtTest5.setText("Е) Кувейт, Сауд Арабиясы, Германия");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Қазақстанда егістікке жарамды жердің жалпы ауданы қанша?");
                    txtTest1.setText("А) 11 млн га");
                    txtTest2.setText("В) 26 млн га");
                    txtTest3.setText("С) 28 млн га");
                    txtTest4.setText("Д) 32 млн га");
                    txtTest5.setText("Е) 36 млн га");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Солтүстік орман белдеуі әлемдік орман массивтерінің қанша бөлігін құрайды?");
                    txtTest1.setText("А)1/4 бөлігін");
                    txtTest2.setText("В) ½ бөлігін");
                    txtTest3.setText("С) 1/3 бөлігін ");
                    txtTest4.setText("Д) 2/3 бөлігін");
                    txtTest5.setText("Е) 2/4 бөлігін");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Адам пайдаланатын теңіз биомассасының қанша пайызын балықтар құрайды");
                    txtTest1.setText("А) 100%-ын");
                    txtTest2.setText("В) 12% -ын");
                    txtTest3.setText("С) 85%-ын");
                    txtTest4.setText("Д) 92%-ын");
                    txtTest5.setText("Е) 97%-ын");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Мұхиттың қанша бөлігін органикалық тіршілігі кедей аудандар алып жатыр?");
                    txtTest1.setText("А) 1/2-ін");
                    txtTest2.setText("В) 1/3-ін");
                    txtTest3.setText("С) 1/4-ін");
                    txtTest4.setText("Д) 2/3-ін");
                    txtTest5.setText("Е) 3/4-ін");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Рекреациялық ресурстар неше топқа жіктеледі?");
                    txtTest1.setText("А) 2");
                    txtTest2.setText("В) 3");
                    txtTest3.setText("С) 4");
                    txtTest4.setText("Д) 5");
                    txtTest5.setText("Е) 6");
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
                    String name = "Лекция 3";
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
                    question.setText("Адамзаттың тарихи даму кезеңіне және кәсіптік әрекетіне тікелей қатысатын жер табиғатының бөлігін қалай атаймыз?");
                    txtTest1.setText("А) қоршаған орта");
                    txtTest2.setText("В) табиғат сферасы");
                    txtTest3.setText("С) табиғат ресурстары");
                    txtTest4.setText("Д) географиялық орта");
                    txtTest5.setText("Е) қоғам мен табиғат арасындағы байланыс");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Сарқылмайтын ресурстарға нелер жатады?");
                    txtTest1.setText("А) пайдалы қазбалар");
                    txtTest2.setText("В) су, топырақ");
                    txtTest3.setText("С) күн энергиясы");
                    txtTest4.setText("Д) минералдық");
                    txtTest5.setText("Е) рекреациялық");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("2000 жылы дүниежүзіндегі мұнай қоры қанша млрд тоннаға жеткен?");
                    txtTest1.setText("А) 146 млрд тонна");
                    txtTest2.setText("В) 140 млрд тонна");
                    txtTest3.setText("С) 250-300 млрд тонна");
                    txtTest4.setText("Д) 300 млр тонна");
                    txtTest5.setText("Е) 3,5 млрд тонна");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Отын түрлерінің ішінде әлемде қоры өте мол");
                    txtTest1.setText("А) мұнай");
                    txtTest2.setText("В) газ");
                    txtTest3.setText("С) көмір");
                    txtTest4.setText("Д) радиактивті материалдар");
                    txtTest5.setText("Е) жанғыш тақтатас");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Көмір экспорттаушы ірі елдер қатарына қай елдер енеді?");
                    txtTest1.setText("А) АҚШ, Германия, Аустралия");
                    txtTest2.setText("В) Аустралия, Канада, Калумбия");
                    txtTest3.setText("С) Қытай, АҚШ, Үндістан");
                    txtTest4.setText("Д) ОАР, Аустралия, АҚШ");
                    txtTest5.setText("Е) Кувейт, Сауд Арабиясы, Германия");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Қазақстанда егістікке жарамды жердің жалпы ауданы қанша?");
                    txtTest1.setText("А) 11 млн га");
                    txtTest2.setText("В) 26 млн га");
                    txtTest3.setText("С) 28 млн га");
                    txtTest4.setText("Д) 32 млн га");
                    txtTest5.setText("Е) 36 млн га");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Солтүстік орман белдеуі әлемдік орман массивтерінің қанша бөлігін құрайды?");
                    txtTest1.setText("А)1/4 бөлігін");
                    txtTest2.setText("В) ½ бөлігін");
                    txtTest3.setText("С) 1/3 бөлігін ");
                    txtTest4.setText("Д) 2/3 бөлігін");
                    txtTest5.setText("Е) 2/4 бөлігін");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Адам пайдаланатын теңіз биомассасының қанша пайызын балықтар құрайды");
                    txtTest1.setText("А) 100%-ын");
                    txtTest2.setText("В) 12% -ын");
                    txtTest3.setText("С) 85%-ын");
                    txtTest4.setText("Д) 92%-ын");
                    txtTest5.setText("Е) 97%-ын");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Мұхиттың қанша бөлігін органикалық тіршілігі кедей аудандар алып жатыр?");
                    txtTest1.setText("А) 1/2-ін");
                    txtTest2.setText("В) 1/3-ін");
                    txtTest3.setText("С) 1/4-ін");
                    txtTest4.setText("Д) 2/3-ін");
                    txtTest5.setText("Е) 3/4-ін");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Рекреациялық ресурстар неше топқа жіктеледі?");
                    txtTest1.setText("А) 2");
                    txtTest2.setText("В) 3");
                    txtTest3.setText("С) 4");
                    txtTest4.setText("Д) 5");
                    txtTest5.setText("Е) 6");
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
                    String name = "Лекция 3";
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
