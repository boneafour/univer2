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
import com.example.user.univer.StudentData;

import java.util.List;

/**
 * Created by user on 14.06.2016.
 */
public class Test1 extends Activity implements View.OnClickListener {

    private TextView txtTitle, question, testNumber;
    private ImageButton btnBack;
    private Button  txtTest1, txtTest2, txtTest3, txtTest4, txtTest5;
    private int count = 0, correct = 0;
    private String incorrect = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText(getString(R.string.report));

        question = (TextView) findViewById(R.id.question);

        testNumber = (TextView) findViewById(R.id.testNumber);
        testNumber.setText("1/19");

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

        question.setText("Дүние жүзінде қазіргі кезде ... монархия бар");
        txtTest1.setText("A) 24-25 ");
        txtTest2.setText("B) 30-31 ");
        txtTest3.setText("C) 28-29 ");
        txtTest4.setText("D) 40-41 ");
        txtTest5.setText("E) 45-46 ");
        testNumber.setText("1/19");



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBack:
                NavUtils.navigateUpFromSameTask(this);
                break;
            case R.id.varA:
                if(count==0){
                question.setText("Дүние жүзінде қазіргі кезде ... монархия бар");
                txtTest1.setText("A) 24-25 ");
                txtTest2.setText("B) 30-31 ");
                txtTest3.setText("C) 28-29 ");
                txtTest4.setText("D) 40-41 ");
                txtTest5.setText("E) 45-46 ");
                testNumber.setText("1/19");
            }
            else if(count==1){
                question.setText("Дүние жүзіндегі елдердің көпшілігі мемлекетті басқару формасына қарай аталады");
                txtTest1.setText("A) Монархия ");
                txtTest2.setText("B) Теокарттық ");
                txtTest3.setText("C) Республика ");
                txtTest4.setText("D) Федерация ");
                txtTest5.setText("E) Унитарлы ");
                testNumber.setText("2/19");
            }
            else if(count==2){
                question.setText("Федерациялы мемлекеттер ");
                txtTest1.setText("A) АҚШ, Италия ");
                txtTest2.setText("B) Бразилия, Жапония ");
                txtTest3.setText("C) Ресей, АҚШ ");
                txtTest4.setText("D) Үндістан, Непал ");
                txtTest5.setText("E) Аргентина, Армения ");
                testNumber.setText("3/19");
            }
            else if(count==3){
                question.setText("Конституциялық монархия мемлекеті ");
                txtTest1.setText("A) Катар ");
                txtTest2.setText("B) Жапония ");
                txtTest3.setText("C) Оман ");
                txtTest4.setText("D) Бахрейн ");
                txtTest5.setText("E) Кувейт ");
                testNumber.setText("4/19");
            }
            else if(count==4){
                question.setText("Дүние жүзінде алғашқы халық санағы жүргізілген ");
                txtTest1.setText("A) Монғолияда ");
                txtTest2.setText("B) Египетте ");
                txtTest3.setText("C) Киев Русінде ");
                txtTest4.setText("D) Үндістанда ");
                txtTest5.setText("E) Вавилонияда ");
                testNumber.setText("5/19");
            }
            else if(count==5){
                question.setText("Қазіргі кезде әлемдегі аса ірі этнос ");
                txtTest1.setText("A) Қытайлар ");
                txtTest2.setText("B) Хиндустандықтар ");
                txtTest3.setText("C) Орыстар ");
                txtTest4.setText("D) Шотландықтар ");
                txtTest5.setText("E) Ағылшындар ");
                testNumber.setText("6/19");
            }
            else if(count==6){
                question.setText("Еуразиялық кеңістікте түркі халықтары мен олардың мемлекеттерінің қалыптасуын зерттеген ғалым ");
                txtTest1.setText("A) Миклухо-Маклай ");
                txtTest2.setText("B) М. Лики ");
                txtTest3.setText("C) Л.Н. Гумилев ");
                txtTest4.setText("D) Конфуций ");
                txtTest5.setText("E) Н.Н. Баранский ");
                testNumber.setText("7/19");
            }
            else if(count==7){
                question.setText("Алюминий өндірісін орналастырудағы басты фактор ");
                txtTest1.setText("A) Қалаға ");
                txtTest2.setText("B) Шикізат ");
                txtTest3.setText("C) Арзан энергия ");
                txtTest4.setText("D) Тұтынушы ");
                txtTest5.setText("E) Көлік ");
                testNumber.setText("8/19");
            }
            else if(count==8){
                question.setText("Маңызды теңіз-каналдар ");
                txtTest1.setText("A) Ла-Манш, Дрейка ");
                txtTest2.setText("B) Гибралтар, Мозамбик");
                txtTest3.setText("C) Суэц, Панама ");
                txtTest4.setText("D) Киль, Магеллан ");
                txtTest5.setText("E) Гудзонов, Берингов ");
                testNumber.setText("9/19");
            }
            else if(count==9){
                question.setText("Дүние жүзінде жерінің ауданы бойынша бірінші орын алатын ірі мемлекет ");
                txtTest1.setText("A) Қытай ");
                txtTest2.setText("B) Ресей ");
                txtTest3.setText("C) АҚШ ");
                txtTest4.setText("D) Канада ");
                txtTest5.setText("E) Үндістан ");
                testNumber.setText("10/19");
            }
            else if(count==10){
                question.setText("Солтүстік Сібір мен Қиыр Шығыстағы ежелден қалыптасқан ата кәсіптің бірі ");
                txtTest1.setText("A) Омарта шаруашылығы ");
                txtTest2.setText("B) Құс шаруашылығы ");
                txtTest3.setText("C) Бұғы шаруашылығы ");
                txtTest4.setText("D) Терісі бағалы аңдарды өсіру ");
                txtTest5.setText("E) Қой шаруашылығы ");
                testNumber.setText("11/19");
            }
            else if(count==11){
                question.setText("Ресейдің сыртқы сауда байланыстарын жүзеге асыратын аса маңызды көлік ");
                txtTest1.setText("A) Теңіз ");
                txtTest2.setText("B) Өзен ");
                txtTest3.setText("C) Автомобиль ");
                txtTest4.setText("D) Құбыр ");
                txtTest5.setText("E) Темір жол ");
                testNumber.setText("12/19");
            }
            else if(count==12){
                question.setText("Беларусь Республикасы техникалық дақылдардан көп өсіреді ");
                txtTest1.setText("A) Зығырды ");
                txtTest2.setText("B) Күнбағысты ");
                txtTest3.setText("C) Темекіні ");
                txtTest4.setText("D) Қант қызылшасын ");
                txtTest5.setText("E) Мақтаны ");
                testNumber.setText("13/19");
            }
            else if(count==13){
                question.setText("Украинаның ең ірі өзені ");
                txtTest1.setText("A) Днестр ");
                txtTest2.setText("B) Днепр ");
                txtTest3.setText("C) Оңтүстік Буг");
                txtTest4.setText("D) Дон ");
                txtTest5.setText("E) Дунай ");
                testNumber.setText("14/19");
            }
            else if(count==14){
                question.setText("Молдованың жүк тасымалдайтын негізгі көліктері ");
                txtTest1.setText("A) Әуе, өзен ");
                txtTest2.setText("B) Темір жол, автомобиль ");
                txtTest3.setText("C) Мұхит, құбыр ");
                txtTest4.setText("D) Теңіз, әуе ");
                txtTest5.setText("E) Автомобиль, әуе ");
                testNumber.setText("15/19");
            }
            else if(count==15){
                question.setText("Грузия экспортқа шығарады ");
                txtTest1.setText("A) Машина жасау өнеркәсібінің өнімдерін ");
                txtTest2.setText("B) Тамақ өнеркәсібінің өнімдерін ");
                txtTest3.setText("C) Металлургия өнімдерін ");
                txtTest4.setText("D) Құрылыс материалдарын ");
                txtTest5.setText("E) Химия өнеркәсібінің өнімдерін ");
                testNumber.setText("16/19");
            }
            else if(count==16){
                question.setText("Сырдария мен Әмудария өзендерінің аралығында орналасқан мемлекет");
                txtTest1.setText("A) Түрікменстан ");
                txtTest2.setText("B) Өзбекстан ");
                txtTest3.setText("C) Тәжікстан ");
                txtTest4.setText("D) Қырғызстан ");
                txtTest5.setText("E) Қытай ");
                testNumber.setText("17/19");
            }
            else if(count==17){
                question.setText("Өзбекстанның ең ежелгі маманданған кәсібі ");
                txtTest1.setText("A) Жібек құртын өсіру ");
                txtTest2.setText("B) Бау-бақша өсіру");
                txtTest3.setText("C) Жүзімдіктер өсіру");
                txtTest4.setText("D) Күріш өсіру ");
                txtTest5.setText("E) Темекі өсіру ");
                testNumber.setText("18/19");
            }
            else if(count==18){
                question.setText("Өзбекстанда өсірілетін басты дақыл ");
                txtTest1.setText("A) Күріш");
                txtTest2.setText("B) Жүгері");
                txtTest3.setText("C) Мақта");
                txtTest4.setText("D) Бидай");
                txtTest5.setText("E) Арпа");
                testNumber.setText("19/19");
            }
            else if(count==19){
                question.setText("Бақылау қортындысы бойынша:");
                txtTest1.setText("Дұрыс жауап "+correct);
                txtTest2.setText("Дұрыс емес"+incorrect);
                txtTest3.setText("");
                txtTest4.setText("");
                txtTest5.setText("");
                testNumber.setText("");

                    String correct1 = "" + correct;
                    String name = "Лекция 1";

                    DatabaseHandler db = new DatabaseHandler(this);
                    db.addMark(new MarkData(name, correct1));
                    List<MarkData> markDatas = db.getAllMarks();
                    for (MarkData cn : markDatas) {
                        String log = "Id: "+cn.getMarkID()+" ,Name: " + cn.getMarkName() + " ,Mark: " + cn.getMark();
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
                else if(count==10){
                    incorrect = (incorrect+" 11");
                    count++;
                }
                else if(count==11){
                    correct++;
                    count++;
                }
                else if(count==12){
                    correct++;
                    count++;
                }
                else if(count==13){
                    incorrect = (incorrect+" 14");
                    count++;
                }
                else if(count==14){
                    incorrect = (incorrect+" 15");
                    count++;
                }
                else if(count==15){
                    incorrect = (incorrect+" 16");
                    count++;
                }
                else if(count==16){
                    incorrect = (incorrect+" 17");
                    count++;
                }
                else if(count==17){
                    correct++;
                    count++;
                }
                else if(count==18){
                    incorrect = (incorrect+" 19");
                    count++;
                }
                break;
            case R.id.varB:
                if(count==0){
                    question.setText("Дүние жүзінде қазіргі кезде ... монархия бар");
                    txtTest1.setText("A) 24-25 ");
                    txtTest2.setText("B) 30-31 ");
                    txtTest3.setText("C) 28-29 ");
                    txtTest4.setText("D) 40-41 ");
                    txtTest5.setText("E) 45-46 ");
                    testNumber.setText("1/19");
                }
                else if(count==1){
                    question.setText("Дүние жүзіндегі елдердің көпшілігі мемлекетті басқару формасына қарай аталады");
                    txtTest1.setText("A) Монархия ");
                    txtTest2.setText("B) Теокарттық ");
                    txtTest3.setText("C) Республика ");
                    txtTest4.setText("D) Федерация ");
                    txtTest5.setText("E) Унитарлы ");
                    testNumber.setText("2/19");
                }
                else if(count==2){
                    question.setText("Федерациялы мемлекеттер ");
                    txtTest1.setText("A) АҚШ, Италия ");
                    txtTest2.setText("B) Бразилия, Жапония ");
                    txtTest3.setText("C) Ресей, АҚШ ");
                    txtTest4.setText("D) Үндістан, Непал ");
                    txtTest5.setText("E) Аргентина, Армения ");
                    testNumber.setText("3/19");
                }
                else if(count==3){
                    question.setText("Конституциялық монархия мемлекеті ");
                    txtTest1.setText("A) Катар ");
                    txtTest2.setText("B) Жапония ");
                    txtTest3.setText("C) Оман ");
                    txtTest4.setText("D) Бахрейн ");
                    txtTest5.setText("E) Кувейт ");
                    testNumber.setText("4/19");
                }
                else if(count==4){
                    question.setText("Дүние жүзінде алғашқы халық санағы жүргізілген ");
                    txtTest1.setText("A) Монғолияда ");
                    txtTest2.setText("B) Египетте ");
                    txtTest3.setText("C) Киев Русінде ");
                    txtTest4.setText("D) Үндістанда ");
                    txtTest5.setText("E) Вавилонияда ");
                    testNumber.setText("5/19");
                }
                else if(count==5){
                    question.setText("Қазіргі кезде әлемдегі аса ірі этнос ");
                    txtTest1.setText("A) Қытайлар ");
                    txtTest2.setText("B) Хиндустандықтар ");
                    txtTest3.setText("C) Орыстар ");
                    txtTest4.setText("D) Шотландықтар ");
                    txtTest5.setText("E) Ағылшындар ");
                    testNumber.setText("6/19");
                }
                else if(count==6){
                    question.setText("Еуразиялық кеңістікте түркі халықтары мен олардың мемлекеттерінің қалыптасуын зерттеген ғалым ");
                    txtTest1.setText("A) Миклухо-Маклай ");
                    txtTest2.setText("B) М. Лики ");
                    txtTest3.setText("C) Л.Н. Гумилев ");
                    txtTest4.setText("D) Конфуций ");
                    txtTest5.setText("E) Н.Н. Баранский ");
                    testNumber.setText("7/19");
                }
                else if(count==7){
                    question.setText("Алюминий өндірісін орналастырудағы басты фактор ");
                    txtTest1.setText("A) Қалаға ");
                    txtTest2.setText("B) Шикізат ");
                    txtTest3.setText("C) Арзан энергия ");
                    txtTest4.setText("D) Тұтынушы ");
                    txtTest5.setText("E) Көлік ");
                    testNumber.setText("8/19");
                }
                else if(count==8){
                    question.setText("Маңызды теңіз-каналдар ");
                    txtTest1.setText("A) Ла-Манш, Дрейка ");
                    txtTest2.setText("B) Гибралтар, Мозамбик");
                    txtTest3.setText("C) Суэц, Панама ");
                    txtTest4.setText("D) Киль, Магеллан ");
                    txtTest5.setText("E) Гудзонов, Берингов ");
                    testNumber.setText("9/19");
                }
                else if(count==9){
                    question.setText("Дүние жүзінде жерінің ауданы бойынша бірінші орын алатын ірі мемлекет ");
                    txtTest1.setText("A) Қытай ");
                    txtTest2.setText("B) Ресей ");
                    txtTest3.setText("C) АҚШ ");
                    txtTest4.setText("D) Канада ");
                    txtTest5.setText("E) Үндістан ");
                    testNumber.setText("10/19");
                }
                else if(count==10){
                    question.setText("Солтүстік Сібір мен Қиыр Шығыстағы ежелден қалыптасқан ата кәсіптің бірі ");
                    txtTest1.setText("A) Омарта шаруашылығы ");
                    txtTest2.setText("B) Құс шаруашылығы ");
                    txtTest3.setText("C) Бұғы шаруашылығы ");
                    txtTest4.setText("D) Терісі бағалы аңдарды өсіру ");
                    txtTest5.setText("E) Қой шаруашылығы ");
                    testNumber.setText("11/19");
                }
                else if(count==11){
                    question.setText("Ресейдің сыртқы сауда байланыстарын жүзеге асыратын аса маңызды көлік ");
                    txtTest1.setText("A) Теңіз ");
                    txtTest2.setText("B) Өзен ");
                    txtTest3.setText("C) Автомобиль ");
                    txtTest4.setText("D) Құбыр ");
                    txtTest5.setText("E) Темір жол ");
                    testNumber.setText("12/19");
                }
                else if(count==12){
                    question.setText("Беларусь Республикасы техникалық дақылдардан көп өсіреді ");
                    txtTest1.setText("A) Зығырды ");
                    txtTest2.setText("B) Күнбағысты ");
                    txtTest3.setText("C) Темекіні ");
                    txtTest4.setText("D) Қант қызылшасын ");
                    txtTest5.setText("E) Мақтаны ");
                    testNumber.setText("13/19");
                }
                else if(count==13){
                    question.setText("Украинаның ең ірі өзені ");
                    txtTest1.setText("A) Днестр ");
                    txtTest2.setText("B) Днепр ");
                    txtTest3.setText("C) Оңтүстік Буг");
                    txtTest4.setText("D) Дон ");
                    txtTest5.setText("E) Дунай ");
                    testNumber.setText("14/19");
                }
                else if(count==14){
                    question.setText("Молдованың жүк тасымалдайтын негізгі көліктері ");
                    txtTest1.setText("A) Әуе, өзен ");
                    txtTest2.setText("B) Темір жол, автомобиль ");
                    txtTest3.setText("C) Мұхит, құбыр ");
                    txtTest4.setText("D) Теңіз, әуе ");
                    txtTest5.setText("E) Автомобиль, әуе ");
                    testNumber.setText("15/19");
                }
                else if(count==15){
                    question.setText("Грузия экспортқа шығарады ");
                    txtTest1.setText("A) Машина жасау өнеркәсібінің өнімдерін ");
                    txtTest2.setText("B) Тамақ өнеркәсібінің өнімдерін ");
                    txtTest3.setText("C) Металлургия өнімдерін ");
                    txtTest4.setText("D) Құрылыс материалдарын ");
                    txtTest5.setText("E) Химия өнеркәсібінің өнімдерін ");
                    testNumber.setText("16/19");
                }
                else if(count==16){
                    question.setText("Сырдария мен Әмудария өзендерінің аралығында орналасқан мемлекет");
                    txtTest1.setText("A) Түрікменстан ");
                    txtTest2.setText("B) Өзбекстан ");
                    txtTest3.setText("C) Тәжікстан ");
                    txtTest4.setText("D) Қырғызстан ");
                    txtTest5.setText("E) Қытай ");
                    testNumber.setText("17/19");
                }
                else if(count==17){
                    question.setText("Өзбекстанның ең ежелгі маманданған кәсібі ");
                    txtTest1.setText("A) Жібек құртын өсіру ");
                    txtTest2.setText("B) Бау-бақша өсіру");
                    txtTest3.setText("C) Жүзімдіктер өсіру");
                    txtTest4.setText("D) Күріш өсіру ");
                    txtTest5.setText("E) Темекі өсіру ");
                    testNumber.setText("18/19");
                }
                else if(count==18){
                    question.setText("Өзбекстанда өсірілетін басты дақыл ");
                    txtTest1.setText("A) Күріш");
                    txtTest2.setText("B) Жүгері");
                    txtTest3.setText("C) Мақта");
                    txtTest4.setText("D) Бидай");
                    txtTest5.setText("E) Арпа");
                    testNumber.setText("19/19");
                }
                else if(count==19){
                    question.setText("Бақылау қортындысы бойынша:");
                    txtTest1.setText("Дұрыс жауап "+correct);
                    txtTest2.setText("Дұрыс емес"+incorrect);
                    txtTest3.setText("");
                    txtTest4.setText("");
                    txtTest5.setText("");
                    testNumber.setText("");

                    String correct1 = "" + correct;
                    String name = "Лекция 1";

                    DatabaseHandler db = new DatabaseHandler(this);
                    db.addMark(new MarkData(name, correct1));
                    List<MarkData> markDatas = db.getAllMarks();
                    for (MarkData cn : markDatas) {
                        String log = "Id: "+cn.getMarkID()+" ,Name: " + cn.getMarkName() + " ,Mark: " + cn.getMark();
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
                    correct++;
                    count++;
                }
                else if(count==10){
                    incorrect = (incorrect+" 11");
                    count++;
                }
                else if(count==11){
                    incorrect = (incorrect+" 12");
                    count++;
                }
                else if(count==12){
                    incorrect = (incorrect+" 13");
                    count++;
                }
                else if(count==13){
                    correct++;
                    count++;
                }
                else if(count==14){
                    correct++;
                    count++;
                }
                else if(count==15){
                    correct++;
                    count++;
                }
                else if(count==16){
                    correct++;
                    count++;
                }
                else if(count==17){
                    incorrect = (incorrect+" 18");
                    count++;
                }
                else if(count==18){
                    incorrect = (incorrect+" 19");
                    count++;
                }
                break;
            case R.id.varC:
                if(count==0){
                    question.setText("Дүние жүзінде қазіргі кезде ... монархия бар");
                    txtTest1.setText("A) 24-25 ");
                    txtTest2.setText("B) 30-31 ");
                    txtTest3.setText("C) 28-29 ");
                    txtTest4.setText("D) 40-41 ");
                    txtTest5.setText("E) 45-46 ");
                    testNumber.setText("1/19");
                }
                else if(count==1){
                    question.setText("Дүние жүзіндегі елдердің көпшілігі мемлекетті басқару формасына қарай аталады");
                    txtTest1.setText("A) Монархия ");
                    txtTest2.setText("B) Теокарттық ");
                    txtTest3.setText("C) Республика ");
                    txtTest4.setText("D) Федерация ");
                    txtTest5.setText("E) Унитарлы ");
                    testNumber.setText("2/19");
                }
                else if(count==2){
                    question.setText("Федерациялы мемлекеттер ");
                    txtTest1.setText("A) АҚШ, Италия ");
                    txtTest2.setText("B) Бразилия, Жапония ");
                    txtTest3.setText("C) Ресей, АҚШ ");
                    txtTest4.setText("D) Үндістан, Непал ");
                    txtTest5.setText("E) Аргентина, Армения ");
                    testNumber.setText("3/19");
                }
                else if(count==3){
                    question.setText("Конституциялық монархия мемлекеті ");
                    txtTest1.setText("A) Катар ");
                    txtTest2.setText("B) Жапония ");
                    txtTest3.setText("C) Оман ");
                    txtTest4.setText("D) Бахрейн ");
                    txtTest5.setText("E) Кувейт ");
                    testNumber.setText("4/19");
                }
                else if(count==4){
                    question.setText("Дүние жүзінде алғашқы халық санағы жүргізілген ");
                    txtTest1.setText("A) Монғолияда ");
                    txtTest2.setText("B) Египетте ");
                    txtTest3.setText("C) Киев Русінде ");
                    txtTest4.setText("D) Үндістанда ");
                    txtTest5.setText("E) Вавилонияда ");
                    testNumber.setText("5/19");
                }
                else if(count==5){
                    question.setText("Қазіргі кезде әлемдегі аса ірі этнос ");
                    txtTest1.setText("A) Қытайлар ");
                    txtTest2.setText("B) Хиндустандықтар ");
                    txtTest3.setText("C) Орыстар ");
                    txtTest4.setText("D) Шотландықтар ");
                    txtTest5.setText("E) Ағылшындар ");
                    testNumber.setText("6/19");
                }
                else if(count==6){
                    question.setText("Еуразиялық кеңістікте түркі халықтары мен олардың мемлекеттерінің қалыптасуын зерттеген ғалым ");
                    txtTest1.setText("A) Миклухо-Маклай ");
                    txtTest2.setText("B) М. Лики ");
                    txtTest3.setText("C) Л.Н. Гумилев ");
                    txtTest4.setText("D) Конфуций ");
                    txtTest5.setText("E) Н.Н. Баранский ");
                    testNumber.setText("7/19");
                }
                else if(count==7){
                    question.setText("Алюминий өндірісін орналастырудағы басты фактор ");
                    txtTest1.setText("A) Қалаға ");
                    txtTest2.setText("B) Шикізат ");
                    txtTest3.setText("C) Арзан энергия ");
                    txtTest4.setText("D) Тұтынушы ");
                    txtTest5.setText("E) Көлік ");
                    testNumber.setText("8/19");
                }
                else if(count==8){
                    question.setText("Маңызды теңіз-каналдар ");
                    txtTest1.setText("A) Ла-Манш, Дрейка ");
                    txtTest2.setText("B) Гибралтар, Мозамбик");
                    txtTest3.setText("C) Суэц, Панама ");
                    txtTest4.setText("D) Киль, Магеллан ");
                    txtTest5.setText("E) Гудзонов, Берингов ");
                    testNumber.setText("9/19");
                }
                else if(count==9){
                    question.setText("Дүние жүзінде жерінің ауданы бойынша бірінші орын алатын ірі мемлекет ");
                    txtTest1.setText("A) Қытай ");
                    txtTest2.setText("B) Ресей ");
                    txtTest3.setText("C) АҚШ ");
                    txtTest4.setText("D) Канада ");
                    txtTest5.setText("E) Үндістан ");
                    testNumber.setText("10/19");
                }
                else if(count==10){
                    question.setText("Солтүстік Сібір мен Қиыр Шығыстағы ежелден қалыптасқан ата кәсіптің бірі ");
                    txtTest1.setText("A) Омарта шаруашылығы ");
                    txtTest2.setText("B) Құс шаруашылығы ");
                    txtTest3.setText("C) Бұғы шаруашылығы ");
                    txtTest4.setText("D) Терісі бағалы аңдарды өсіру ");
                    txtTest5.setText("E) Қой шаруашылығы ");
                    testNumber.setText("11/19");
                }
                else if(count==11){
                    question.setText("Ресейдің сыртқы сауда байланыстарын жүзеге асыратын аса маңызды көлік ");
                    txtTest1.setText("A) Теңіз ");
                    txtTest2.setText("B) Өзен ");
                    txtTest3.setText("C) Автомобиль ");
                    txtTest4.setText("D) Құбыр ");
                    txtTest5.setText("E) Темір жол ");
                    testNumber.setText("12/19");
                }
                else if(count==12){
                    question.setText("Беларусь Республикасы техникалық дақылдардан көп өсіреді ");
                    txtTest1.setText("A) Зығырды ");
                    txtTest2.setText("B) Күнбағысты ");
                    txtTest3.setText("C) Темекіні ");
                    txtTest4.setText("D) Қант қызылшасын ");
                    txtTest5.setText("E) Мақтаны ");
                    testNumber.setText("13/19");
                }
                else if(count==13){
                    question.setText("Украинаның ең ірі өзені ");
                    txtTest1.setText("A) Днестр ");
                    txtTest2.setText("B) Днепр ");
                    txtTest3.setText("C) Оңтүстік Буг");
                    txtTest4.setText("D) Дон ");
                    txtTest5.setText("E) Дунай ");
                    testNumber.setText("14/19");
                }
                else if(count==14){
                    question.setText("Молдованың жүк тасымалдайтын негізгі көліктері ");
                    txtTest1.setText("A) Әуе, өзен ");
                    txtTest2.setText("B) Темір жол, автомобиль ");
                    txtTest3.setText("C) Мұхит, құбыр ");
                    txtTest4.setText("D) Теңіз, әуе ");
                    txtTest5.setText("E) Автомобиль, әуе ");
                    testNumber.setText("15/19");
                }
                else if(count==15){
                    question.setText("Грузия экспортқа шығарады ");
                    txtTest1.setText("A) Машина жасау өнеркәсібінің өнімдерін ");
                    txtTest2.setText("B) Тамақ өнеркәсібінің өнімдерін ");
                    txtTest3.setText("C) Металлургия өнімдерін ");
                    txtTest4.setText("D) Құрылыс материалдарын ");
                    txtTest5.setText("E) Химия өнеркәсібінің өнімдерін ");
                    testNumber.setText("16/19");
                }
                else if(count==16){
                    question.setText("Сырдария мен Әмудария өзендерінің аралығында орналасқан мемлекет");
                    txtTest1.setText("A) Түрікменстан ");
                    txtTest2.setText("B) Өзбекстан ");
                    txtTest3.setText("C) Тәжікстан ");
                    txtTest4.setText("D) Қырғызстан ");
                    txtTest5.setText("E) Қытай ");
                    testNumber.setText("17/19");
                }
                else if(count==17){
                    question.setText("Өзбекстанның ең ежелгі маманданған кәсібі ");
                    txtTest1.setText("A) Жібек құртын өсіру ");
                    txtTest2.setText("B) Бау-бақша өсіру");
                    txtTest3.setText("C) Жүзімдіктер өсіру");
                    txtTest4.setText("D) Күріш өсіру ");
                    txtTest5.setText("E) Темекі өсіру ");
                    testNumber.setText("18/19");
                }
                else if(count==18){
                    question.setText("Өзбекстанда өсірілетін басты дақыл ");
                    txtTest1.setText("A) Күріш");
                    txtTest2.setText("B) Жүгері");
                    txtTest3.setText("C) Мақта");
                    txtTest4.setText("D) Бидай");
                    txtTest5.setText("E) Арпа");
                    testNumber.setText("19/19");
                }
                else if(count==19){
                    question.setText("Бақылау қортындысы бойынша:");
                    txtTest1.setText("Дұрыс жауап "+correct);
                    txtTest2.setText("Дұрыс емес"+incorrect);
                    txtTest3.setText("");
                    txtTest4.setText("");
                    txtTest5.setText("");
                    testNumber.setText("");

                    String correct1 = "" + correct;
                    String name = "Лекция 1";

                    DatabaseHandler db = new DatabaseHandler(this);
                    db.addMark(new MarkData(name, correct1));
                    List<MarkData> markDatas = db.getAllMarks();
                    for (MarkData cn : markDatas) {
                        String log = "Id: "+cn.getMarkID()+" ,Name: " + cn.getMarkName() + " ,Mark: " + cn.getMark();
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
                    correct++;
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
                else if(count==10){
                    correct++;
                    count++;
                }
                else if(count==11){
                    incorrect = (incorrect+" 12");
                    count++;
                }
                else if(count==12){
                    incorrect = (incorrect+" 13");
                    count++;
                }
                else if(count==13){
                    incorrect = (incorrect+" 14");
                    count++;
                }
                else if(count==14){
                    incorrect = (incorrect+" 15");
                    count++;
                }
                else if(count==15){
                    incorrect = (incorrect+" 16");
                    count++;
                }
                else if(count==16){
                    incorrect = (incorrect+" 17");
                    count++;
                }
                else if(count==17){
                    incorrect = (incorrect+" 18");
                    count++;
                }
                else if(count==18){
                    correct++;
                    count++;
                }
                break;
            case R.id.varD:
                if(count==0){
                    question.setText("Дүние жүзінде қазіргі кезде ... монархия бар");
                    txtTest1.setText("A) 24-25 ");
                    txtTest2.setText("B) 30-31 ");
                    txtTest3.setText("C) 28-29 ");
                    txtTest4.setText("D) 40-41 ");
                    txtTest5.setText("E) 45-46 ");
                    testNumber.setText("1/19");
                }
                else if(count==1){
                    question.setText("Дүние жүзіндегі елдердің көпшілігі мемлекетті басқару формасына қарай аталады");
                    txtTest1.setText("A) Монархия ");
                    txtTest2.setText("B) Теокарттық ");
                    txtTest3.setText("C) Республика ");
                    txtTest4.setText("D) Федерация ");
                    txtTest5.setText("E) Унитарлы ");
                    testNumber.setText("2/19");
                }
                else if(count==2){
                    question.setText("Федерациялы мемлекеттер ");
                    txtTest1.setText("A) АҚШ, Италия ");
                    txtTest2.setText("B) Бразилия, Жапония ");
                    txtTest3.setText("C) Ресей, АҚШ ");
                    txtTest4.setText("D) Үндістан, Непал ");
                    txtTest5.setText("E) Аргентина, Армения ");
                    testNumber.setText("3/19");
                }
                else if(count==3){
                    question.setText("Конституциялық монархия мемлекеті ");
                    txtTest1.setText("A) Катар ");
                    txtTest2.setText("B) Жапония ");
                    txtTest3.setText("C) Оман ");
                    txtTest4.setText("D) Бахрейн ");
                    txtTest5.setText("E) Кувейт ");
                    testNumber.setText("4/19");
                }
                else if(count==4){
                    question.setText("Дүние жүзінде алғашқы халық санағы жүргізілген ");
                    txtTest1.setText("A) Монғолияда ");
                    txtTest2.setText("B) Египетте ");
                    txtTest3.setText("C) Киев Русінде ");
                    txtTest4.setText("D) Үндістанда ");
                    txtTest5.setText("E) Вавилонияда ");
                    testNumber.setText("5/19");
                }
                else if(count==5){
                    question.setText("Қазіргі кезде әлемдегі аса ірі этнос ");
                    txtTest1.setText("A) Қытайлар ");
                    txtTest2.setText("B) Хиндустандықтар ");
                    txtTest3.setText("C) Орыстар ");
                    txtTest4.setText("D) Шотландықтар ");
                    txtTest5.setText("E) Ағылшындар ");
                    testNumber.setText("6/19");
                }
                else if(count==6){
                    question.setText("Еуразиялық кеңістікте түркі халықтары мен олардың мемлекеттерінің қалыптасуын зерттеген ғалым ");
                    txtTest1.setText("A) Миклухо-Маклай ");
                    txtTest2.setText("B) М. Лики ");
                    txtTest3.setText("C) Л.Н. Гумилев ");
                    txtTest4.setText("D) Конфуций ");
                    txtTest5.setText("E) Н.Н. Баранский ");
                    testNumber.setText("7/19");
                }
                else if(count==7){
                    question.setText("Алюминий өндірісін орналастырудағы басты фактор ");
                    txtTest1.setText("A) Қалаға ");
                    txtTest2.setText("B) Шикізат ");
                    txtTest3.setText("C) Арзан энергия ");
                    txtTest4.setText("D) Тұтынушы ");
                    txtTest5.setText("E) Көлік ");
                    testNumber.setText("8/19");
                }
                else if(count==8){
                    question.setText("Маңызды теңіз-каналдар ");
                    txtTest1.setText("A) Ла-Манш, Дрейка ");
                    txtTest2.setText("B) Гибралтар, Мозамбик");
                    txtTest3.setText("C) Суэц, Панама ");
                    txtTest4.setText("D) Киль, Магеллан ");
                    txtTest5.setText("E) Гудзонов, Берингов ");
                    testNumber.setText("9/19");
                }
                else if(count==9){
                    question.setText("Дүние жүзінде жерінің ауданы бойынша бірінші орын алатын ірі мемлекет ");
                    txtTest1.setText("A) Қытай ");
                    txtTest2.setText("B) Ресей ");
                    txtTest3.setText("C) АҚШ ");
                    txtTest4.setText("D) Канада ");
                    txtTest5.setText("E) Үндістан ");
                    testNumber.setText("10/19");
                }
                else if(count==10){
                    question.setText("Солтүстік Сібір мен Қиыр Шығыстағы ежелден қалыптасқан ата кәсіптің бірі ");
                    txtTest1.setText("A) Омарта шаруашылығы ");
                    txtTest2.setText("B) Құс шаруашылығы ");
                    txtTest3.setText("C) Бұғы шаруашылығы ");
                    txtTest4.setText("D) Терісі бағалы аңдарды өсіру ");
                    txtTest5.setText("E) Қой шаруашылығы ");
                    testNumber.setText("11/19");
                }
                else if(count==11){
                    question.setText("Ресейдің сыртқы сауда байланыстарын жүзеге асыратын аса маңызды көлік ");
                    txtTest1.setText("A) Теңіз ");
                    txtTest2.setText("B) Өзен ");
                    txtTest3.setText("C) Автомобиль ");
                    txtTest4.setText("D) Құбыр ");
                    txtTest5.setText("E) Темір жол ");
                    testNumber.setText("12/19");
                }
                else if(count==12){
                    question.setText("Беларусь Республикасы техникалық дақылдардан көп өсіреді ");
                    txtTest1.setText("A) Зығырды ");
                    txtTest2.setText("B) Күнбағысты ");
                    txtTest3.setText("C) Темекіні ");
                    txtTest4.setText("D) Қант қызылшасын ");
                    txtTest5.setText("E) Мақтаны ");
                    testNumber.setText("13/19");
                }
                else if(count==13){
                    question.setText("Украинаның ең ірі өзені ");
                    txtTest1.setText("A) Днестр ");
                    txtTest2.setText("B) Днепр ");
                    txtTest3.setText("C) Оңтүстік Буг");
                    txtTest4.setText("D) Дон ");
                    txtTest5.setText("E) Дунай ");
                    testNumber.setText("14/19");
                }
                else if(count==14){
                    question.setText("Молдованың жүк тасымалдайтын негізгі көліктері ");
                    txtTest1.setText("A) Әуе, өзен ");
                    txtTest2.setText("B) Темір жол, автомобиль ");
                    txtTest3.setText("C) Мұхит, құбыр ");
                    txtTest4.setText("D) Теңіз, әуе ");
                    txtTest5.setText("E) Автомобиль, әуе ");
                    testNumber.setText("15/19");
                }
                else if(count==15){
                    question.setText("Грузия экспортқа шығарады ");
                    txtTest1.setText("A) Машина жасау өнеркәсібінің өнімдерін ");
                    txtTest2.setText("B) Тамақ өнеркәсібінің өнімдерін ");
                    txtTest3.setText("C) Металлургия өнімдерін ");
                    txtTest4.setText("D) Құрылыс материалдарын ");
                    txtTest5.setText("E) Химия өнеркәсібінің өнімдерін ");
                    testNumber.setText("16/19");
                }
                else if(count==16){
                    question.setText("Сырдария мен Әмудария өзендерінің аралығында орналасқан мемлекет");
                    txtTest1.setText("A) Түрікменстан ");
                    txtTest2.setText("B) Өзбекстан ");
                    txtTest3.setText("C) Тәжікстан ");
                    txtTest4.setText("D) Қырғызстан ");
                    txtTest5.setText("E) Қытай ");
                    testNumber.setText("17/19");
                }
                else if(count==17){
                    question.setText("Өзбекстанның ең ежелгі маманданған кәсібі ");
                    txtTest1.setText("A) Жібек құртын өсіру ");
                    txtTest2.setText("B) Бау-бақша өсіру");
                    txtTest3.setText("C) Жүзімдіктер өсіру");
                    txtTest4.setText("D) Күріш өсіру ");
                    txtTest5.setText("E) Темекі өсіру ");
                    testNumber.setText("18/19");
                }
                else if(count==18){
                    question.setText("Өзбекстанда өсірілетін басты дақыл ");
                    txtTest1.setText("A) Күріш");
                    txtTest2.setText("B) Жүгері");
                    txtTest3.setText("C) Мақта");
                    txtTest4.setText("D) Бидай");
                    txtTest5.setText("E) Арпа");
                    testNumber.setText("19/19");
                }
                else if(count==19){
                    question.setText("Бақылау қортындысы бойынша:");
                    txtTest1.setText("Дұрыс жауап "+correct);
                    txtTest2.setText("Дұрыс емес"+incorrect);
                    txtTest3.setText("");
                    txtTest4.setText("");
                    txtTest5.setText("");
                    testNumber.setText("");

                    String correct1 = "" + correct;
                    String name = "Лекция 1";

                    DatabaseHandler db = new DatabaseHandler(this);
                    db.addMark(new MarkData(name, correct1));
                    List<MarkData> markDatas = db.getAllMarks();
                    for (MarkData cn : markDatas) {
                        String log = "Id: "+cn.getMarkID()+" ,Name: " + cn.getMarkName() + " ,Mark: " + cn.getMark();
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
                    incorrect = (incorrect+" 10");
                    count++;
                }
                else if(count==10){
                    incorrect = (incorrect+" 11");
                    count++;
                }
                else if(count==11){
                    incorrect = (incorrect+" 12");
                    count++;
                }
                else if(count==12){
                    incorrect = (incorrect+" 13");
                    count++;
                }
                else if(count==13){
                    incorrect = (incorrect+" 14");
                    count++;
                }
                else if(count==14){
                    incorrect = (incorrect+" 15");
                    count++;
                }
                else if(count==15){
                    incorrect = (incorrect+" 16");
                    count++;
                }
                else if(count==16){
                    incorrect = (incorrect+" 17");
                    count++;
                }
                else if(count==17){
                    incorrect = (incorrect+" 18");
                    count++;
                }
                else if(count==18){
                    incorrect = (incorrect+" 19");
                    count++;
                }
                break;
            case R.id.varE:
                if(count==0){
                    question.setText("Дүние жүзінде қазіргі кезде ... монархия бар");
                    txtTest1.setText("A) 24-25 ");
                    txtTest2.setText("B) 30-31 ");
                    txtTest3.setText("C) 28-29 ");
                    txtTest4.setText("D) 40-41 ");
                    txtTest5.setText("E) 45-46 ");
                    testNumber.setText("1/19");
                }
                else if(count==1){
                    question.setText("Дүние жүзіндегі елдердің көпшілігі мемлекетті басқару формасына қарай аталады");
                    txtTest1.setText("A) Монархия ");
                    txtTest2.setText("B) Теокарттық ");
                    txtTest3.setText("C) Республика ");
                    txtTest4.setText("D) Федерация ");
                    txtTest5.setText("E) Унитарлы ");
                    testNumber.setText("2/19");
                }
                else if(count==2){
                    question.setText("Федерациялы мемлекеттер ");
                    txtTest1.setText("A) АҚШ, Италия ");
                    txtTest2.setText("B) Бразилия, Жапония ");
                    txtTest3.setText("C) Ресей, АҚШ ");
                    txtTest4.setText("D) Үндістан, Непал ");
                    txtTest5.setText("E) Аргентина, Армения ");
                    testNumber.setText("3/19");
                }
                else if(count==3){
                    question.setText("Конституциялық монархия мемлекеті ");
                    txtTest1.setText("A) Катар ");
                    txtTest2.setText("B) Жапония ");
                    txtTest3.setText("C) Оман ");
                    txtTest4.setText("D) Бахрейн ");
                    txtTest5.setText("E) Кувейт ");
                    testNumber.setText("4/19");
                }
                else if(count==4){
                    question.setText("Дүние жүзінде алғашқы халық санағы жүргізілген ");
                    txtTest1.setText("A) Монғолияда ");
                    txtTest2.setText("B) Египетте ");
                    txtTest3.setText("C) Киев Русінде ");
                    txtTest4.setText("D) Үндістанда ");
                    txtTest5.setText("E) Вавилонияда ");
                    testNumber.setText("5/19");
                }
                else if(count==5){
                    question.setText("Қазіргі кезде әлемдегі аса ірі этнос ");
                    txtTest1.setText("A) Қытайлар ");
                    txtTest2.setText("B) Хиндустандықтар ");
                    txtTest3.setText("C) Орыстар ");
                    txtTest4.setText("D) Шотландықтар ");
                    txtTest5.setText("E) Ағылшындар ");
                    testNumber.setText("6/19");
                }
                else if(count==6){
                    question.setText("Еуразиялық кеңістікте түркі халықтары мен олардың мемлекеттерінің қалыптасуын зерттеген ғалым ");
                    txtTest1.setText("A) Миклухо-Маклай ");
                    txtTest2.setText("B) М. Лики ");
                    txtTest3.setText("C) Л.Н. Гумилев ");
                    txtTest4.setText("D) Конфуций ");
                    txtTest5.setText("E) Н.Н. Баранский ");
                    testNumber.setText("7/19");
                }
                else if(count==7){
                    question.setText("Алюминий өндірісін орналастырудағы басты фактор ");
                    txtTest1.setText("A) Қалаға ");
                    txtTest2.setText("B) Шикізат ");
                    txtTest3.setText("C) Арзан энергия ");
                    txtTest4.setText("D) Тұтынушы ");
                    txtTest5.setText("E) Көлік ");
                    testNumber.setText("8/19");
                }
                else if(count==8){
                    question.setText("Маңызды теңіз-каналдар ");
                    txtTest1.setText("A) Ла-Манш, Дрейка ");
                    txtTest2.setText("B) Гибралтар, Мозамбик");
                    txtTest3.setText("C) Суэц, Панама ");
                    txtTest4.setText("D) Киль, Магеллан ");
                    txtTest5.setText("E) Гудзонов, Берингов ");
                    testNumber.setText("9/19");
                }
                else if(count==9){
                    question.setText("Дүние жүзінде жерінің ауданы бойынша бірінші орын алатын ірі мемлекет ");
                    txtTest1.setText("A) Қытай ");
                    txtTest2.setText("B) Ресей ");
                    txtTest3.setText("C) АҚШ ");
                    txtTest4.setText("D) Канада ");
                    txtTest5.setText("E) Үндістан ");
                    testNumber.setText("10/19");
                }
                else if(count==10){
                    question.setText("Солтүстік Сібір мен Қиыр Шығыстағы ежелден қалыптасқан ата кәсіптің бірі ");
                    txtTest1.setText("A) Омарта шаруашылығы ");
                    txtTest2.setText("B) Құс шаруашылығы ");
                    txtTest3.setText("C) Бұғы шаруашылығы ");
                    txtTest4.setText("D) Терісі бағалы аңдарды өсіру ");
                    txtTest5.setText("E) Қой шаруашылығы ");
                    testNumber.setText("11/19");
                }
                else if(count==11){
                    question.setText("Ресейдің сыртқы сауда байланыстарын жүзеге асыратын аса маңызды көлік ");
                    txtTest1.setText("A) Теңіз ");
                    txtTest2.setText("B) Өзен ");
                    txtTest3.setText("C) Автомобиль ");
                    txtTest4.setText("D) Құбыр ");
                    txtTest5.setText("E) Темір жол ");
                    testNumber.setText("12/19");
                }
                else if(count==12){
                    question.setText("Беларусь Республикасы техникалық дақылдардан көп өсіреді ");
                    txtTest1.setText("A) Зығырды ");
                    txtTest2.setText("B) Күнбағысты ");
                    txtTest3.setText("C) Темекіні ");
                    txtTest4.setText("D) Қант қызылшасын ");
                    txtTest5.setText("E) Мақтаны ");
                    testNumber.setText("13/19");
                }
                else if(count==13){
                    question.setText("Украинаның ең ірі өзені ");
                    txtTest1.setText("A) Днестр ");
                    txtTest2.setText("B) Днепр ");
                    txtTest3.setText("C) Оңтүстік Буг");
                    txtTest4.setText("D) Дон ");
                    txtTest5.setText("E) Дунай ");
                    testNumber.setText("14/19");
                }
                else if(count==14){
                    question.setText("Молдованың жүк тасымалдайтын негізгі көліктері ");
                    txtTest1.setText("A) Әуе, өзен ");
                    txtTest2.setText("B) Темір жол, автомобиль ");
                    txtTest3.setText("C) Мұхит, құбыр ");
                    txtTest4.setText("D) Теңіз, әуе ");
                    txtTest5.setText("E) Автомобиль, әуе ");
                    testNumber.setText("15/19");
                }
                else if(count==15){
                    question.setText("Грузия экспортқа шығарады ");
                    txtTest1.setText("A) Машина жасау өнеркәсібінің өнімдерін ");
                    txtTest2.setText("B) Тамақ өнеркәсібінің өнімдерін ");
                    txtTest3.setText("C) Металлургия өнімдерін ");
                    txtTest4.setText("D) Құрылыс материалдарын ");
                    txtTest5.setText("E) Химия өнеркәсібінің өнімдерін ");
                    testNumber.setText("16/19");
                }
                else if(count==16){
                    question.setText("Сырдария мен Әмудария өзендерінің аралығында орналасқан мемлекет");
                    txtTest1.setText("A) Түрікменстан ");
                    txtTest2.setText("B) Өзбекстан ");
                    txtTest3.setText("C) Тәжікстан ");
                    txtTest4.setText("D) Қырғызстан ");
                    txtTest5.setText("E) Қытай ");
                    testNumber.setText("17/19");
                }
                else if(count==17){
                    question.setText("Өзбекстанның ең ежелгі маманданған кәсібі ");
                    txtTest1.setText("A) Жібек құртын өсіру ");
                    txtTest2.setText("B) Бау-бақша өсіру");
                    txtTest3.setText("C) Жүзімдіктер өсіру");
                    txtTest4.setText("D) Күріш өсіру ");
                    txtTest5.setText("E) Темекі өсіру ");
                    testNumber.setText("18/19");
                }
                else if(count==18){
                    question.setText("Өзбекстанда өсірілетін басты дақыл ");
                    txtTest1.setText("A) Күріш");
                    txtTest2.setText("B) Жүгері");
                    txtTest3.setText("C) Мақта");
                    txtTest4.setText("D) Бидай");
                    txtTest5.setText("E) Арпа");
                    testNumber.setText("19/19");
                }
                else if(count==19){
                    question.setText("Бақылау қортындысы бойынша:");
                    txtTest1.setText("Дұрыс жауап "+correct);
                    txtTest2.setText("Дұрыс емес"+incorrect);
                    txtTest3.setText("");
                    txtTest4.setText("");
                    txtTest5.setText("");
                    testNumber.setText("");

                    String correct1 = "" + correct;
                    String name = "Лекция 1";

                    DatabaseHandler db = new DatabaseHandler(this);
                    db.addMark(new MarkData(name, correct1));
                    List<MarkData> markDatas = db.getAllMarks();
                    for (MarkData cn : markDatas) {
                        String log = "Id: "+cn.getMarkID()+" ,Name: " + cn.getMarkName() + " ,Mark: " + cn.getMark();
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
                    incorrect = (incorrect+" 10");
                    count++;
                }
                else if(count==10){
                    incorrect = (incorrect+" 11");
                    count++;
                }
                else if(count==11){
                    incorrect = (incorrect+" 12");
                    count++;
                }
                else if(count==12){
                    incorrect = (incorrect+" 13");
                    count++;
                }
                else if(count==13){
                    incorrect = (incorrect+" 14");
                    count++;
                }
                else if(count==14){
                    incorrect = (incorrect+" 15");
                    count++;
                }
                else if(count==15){
                    incorrect = (incorrect+" 16");
                    count++;
                }
                else if(count==16){
                    incorrect = (incorrect+" 17");
                    count++;
                }
                else if(count==17){
                    incorrect = (incorrect+" 18");
                    count++;
                }
                else if(count==18){
                    incorrect = (incorrect+" 19");
                    count++;
                }
                break;

        }
    }
}
