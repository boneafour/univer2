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
public class Test2 extends Activity implements View.OnClickListener {

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

        Intent intent1 = getIntent();
        sName = intent1.getStringExtra("sName");

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
        question.setText("Дүниежүзілік шаруашылық дегеніміз не?");
        txtTest1.setText("А) ғылыми – техникалық революция");
        txtTest2.setText("В) ғаламдану");
        txtTest3.setText("С) еңбек бөлінісі");
        txtTest4.setText("Д) ұлттық шаруашылықтар жүйесі");
        txtTest5.setText("Е) өнеркәсіптік революция");
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
                    question.setText("Дүниежүзілік шаруашылық дегеніміз не?");
                    txtTest1.setText("А) ғылыми – техникалық революция");
                    txtTest2.setText("В) ғаламдану");
                    txtTest3.setText("С) еңбек бөлінісі");
                    txtTest4.setText("Д) ұлттық шаруашылықтар жүйесі");
                    txtTest5.setText("Е) өнеркәсіптік революция");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Дүниежүзілік шаруашылықтың даму кезеңдері нешеге бөлінеді?");
                    txtTest1.setText("А) 2");
                    txtTest2.setText("В) 3");
                    txtTest3.setText("С) 4");
                    txtTest4.setText("Д) 5");
                    txtTest5.setText("Е) 6");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Қай жылы Суэц каналы іске қосылды?");
                    txtTest1.setText("А) 1863 ж");
                    txtTest2.setText("В) 1869 ж");
                    txtTest3.setText("С) 1870 ж");
                    txtTest4.setText("Д) 1910 ж");
                    txtTest5.setText("Е) 1914 ж");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Жеке елдердің өнімнің белгілі бір түрлерін, шикізат пен даяр бұйымдарды өндіруге және олармен айырбас жасауға мамандануын қалай атаймыз?");
                    txtTest1.setText("А) ғаламдану");
                    txtTest2.setText("В) ғылыми-техникалық революция");
                    txtTest3.setText("С) дүниежүзілік шаруашылық");
                    txtTest4.setText("Д) индустриялық даму");
                    txtTest5.setText("Е) географиялық еңбек бөлінісі");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("«Білім беру – ғылым өндіріс» жүйесі қай елде жоғары дәрежеде дамыған?");
                    txtTest1.setText("А) Болгария");
                    txtTest2.setText("В) Ресей");
                    txtTest3.setText("С) Франция");
                    txtTest4.setText("Д) Жапония");
                    txtTest5.setText("Е) АҚШ");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Қазақстанда қанша технопарк жұмыс істейді");
                    txtTest1.setText("А) 7");
                    txtTest2.setText("В) 6");
                    txtTest3.setText("С) 5");
                    txtTest4.setText("Д) 4");
                    txtTest5.setText("Е) 3");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Шаруашылық ұйымдасуының қазіргі дейін сақталған байырғы типі");
                    txtTest1.setText("А) нарықтық экономика");
                    txtTest2.setText("В) мемлекеттік");
                    txtTest3.setText("С) табиғи шаруашылық");
                    txtTest4.setText("Д) өтпелі экономика");
                    txtTest5.setText("Е) индустриялану");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Жиынтық өнімнің неше түрі бар?");
                    txtTest1.setText("А) 2");
                    txtTest2.setText("В) 3");
                    txtTest3.setText("С) 4");
                    txtTest4.setText("Д) 5");
                    txtTest5.setText("Е) 6");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("«Үлкен жетілік» құрамына кіретін елдер");
                    txtTest1.setText("А) АҚШ, Ұлыбритания, Израль, Аустралия, Қытай, Үндістан, Панама");
                    txtTest2.setText("В) Жаңа Зеландия, АҚШ, Жапония, Италия, Кипр, Ливия, Куба");
                    txtTest3.setText("С) Канада, Ұлыбритания, Шри-Ланка, Венесуэла, Гаита, Мексика, Корея");
                    txtTest4.setText("Д) АҚШ, Жапония, ГФР, Франция, Италия, Ұлыбритания, Канада");
                    txtTest5.setText("Е) АҚШ, ГФР, Лаос, Куба, Панама, Италия, Қытай");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Өтпелі экономика тән елдер тобы");
                    txtTest1.setText("А) Мальта, Кипр, Бразилия, Мексика, Нигерия");
                    txtTest2.setText("В) Қытай, Монғолия, Вьетнам, Лаос, Куба");
                    txtTest3.setText("С) Қытай, Куба, Үндістан, аргентина, Африка");
                    txtTest4.setText("Д) Панама, Мексика, Веневуэла, Қытай, Жапония");
                    txtTest5.setText("Е) Монғолия, Лаос, Бахрейн, Корея, Алжир");
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
                    String name = "Лекция 2";
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
                    question.setText("Дүниежүзілік шаруашылық дегеніміз не?");
                    txtTest1.setText("А) ғылыми – техникалық революция");
                    txtTest2.setText("В) ғаламдану");
                    txtTest3.setText("С) еңбек бөлінісі");
                    txtTest4.setText("Д) ұлттық шаруашылықтар жүйесі");
                    txtTest5.setText("Е) өнеркәсіптік революция");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Дүниежүзілік шаруашылықтың даму кезеңдері нешеге бөлінеді?");
                    txtTest1.setText("А) 2");
                    txtTest2.setText("В) 3");
                    txtTest3.setText("С) 4");
                    txtTest4.setText("Д) 5");
                    txtTest5.setText("Е) 6");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Қай жылы Суэц каналы іске қосылды?");
                    txtTest1.setText("А) 1863 ж");
                    txtTest2.setText("В) 1869 ж");
                    txtTest3.setText("С) 1870 ж");
                    txtTest4.setText("Д) 1910 ж");
                    txtTest5.setText("Е) 1914 ж");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Жеке елдердің өнімнің белгілі бір түрлерін, шикізат пен даяр бұйымдарды өндіруге және олармен айырбас жасауға мамандануын қалай атаймыз?");
                    txtTest1.setText("А) ғаламдану");
                    txtTest2.setText("В) ғылыми-техникалық революция");
                    txtTest3.setText("С) дүниежүзілік шаруашылық");
                    txtTest4.setText("Д) индустриялық даму");
                    txtTest5.setText("Е) географиялық еңбек бөлінісі");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("«Білім беру – ғылым өндіріс» жүйесі қай елде жоғары дәрежеде дамыған?");
                    txtTest1.setText("А) Болгария");
                    txtTest2.setText("В) Ресей");
                    txtTest3.setText("С) Франция");
                    txtTest4.setText("Д) Жапония");
                    txtTest5.setText("Е) АҚШ");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Қазақстанда қанша технопарк жұмыс істейді");
                    txtTest1.setText("А) 7");
                    txtTest2.setText("В) 6");
                    txtTest3.setText("С) 5");
                    txtTest4.setText("Д) 4");
                    txtTest5.setText("Е) 3");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Шаруашылық ұйымдасуының қазіргі дейін сақталған байырғы типі");
                    txtTest1.setText("А) нарықтық экономика");
                    txtTest2.setText("В) мемлекеттік");
                    txtTest3.setText("С) табиғи шаруашылық");
                    txtTest4.setText("Д) өтпелі экономика");
                    txtTest5.setText("Е) индустриялану");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Жиынтық өнімнің неше түрі бар?");
                    txtTest1.setText("А) 2");
                    txtTest2.setText("В) 3");
                    txtTest3.setText("С) 4");
                    txtTest4.setText("Д) 5");
                    txtTest5.setText("Е) 6");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("«Үлкен жетілік» құрамына кіретін елдер");
                    txtTest1.setText("А) АҚШ, Ұлыбритания, Израль, Аустралия, Қытай, Үндістан, Панама");
                    txtTest2.setText("В) Жаңа Зеландия, АҚШ, Жапония, Италия, Кипр, Ливия, Куба");
                    txtTest3.setText("С) Канада, Ұлыбритания, Шри-Ланка, Венесуэла, Гаита, Мексика, Корея");
                    txtTest4.setText("Д) АҚШ, Жапония, ГФР, Франция, Италия, Ұлыбритания, Канада");
                    txtTest5.setText("Е) АҚШ, ГФР, Лаос, Куба, Панама, Италия, Қытай");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Өтпелі экономика тән елдер тобы");
                    txtTest1.setText("А) Мальта, Кипр, Бразилия, Мексика, Нигерия");
                    txtTest2.setText("В) Қытай, Монғолия, Вьетнам, Лаос, Куба");
                    txtTest3.setText("С) Қытай, Куба, Үндістан, аргентина, Африка");
                    txtTest4.setText("Д) Панама, Мексика, Веневуэла, Қытай, Жапония");
                    txtTest5.setText("Е) Монғолия, Лаос, Бахрейн, Корея, Алжир");
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
                    String name = "Лекция 2";
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
                    question.setText("Дүниежүзілік шаруашылық дегеніміз не?");
                    txtTest1.setText("А) ғылыми – техникалық революция");
                    txtTest2.setText("В) ғаламдану");
                    txtTest3.setText("С) еңбек бөлінісі");
                    txtTest4.setText("Д) ұлттық шаруашылықтар жүйесі");
                    txtTest5.setText("Е) өнеркәсіптік революция");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Дүниежүзілік шаруашылықтың даму кезеңдері нешеге бөлінеді?");
                    txtTest1.setText("А) 2");
                    txtTest2.setText("В) 3");
                    txtTest3.setText("С) 4");
                    txtTest4.setText("Д) 5");
                    txtTest5.setText("Е) 6");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Қай жылы Суэц каналы іске қосылды?");
                    txtTest1.setText("А) 1863 ж");
                    txtTest2.setText("В) 1869 ж");
                    txtTest3.setText("С) 1870 ж");
                    txtTest4.setText("Д) 1910 ж");
                    txtTest5.setText("Е) 1914 ж");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Жеке елдердің өнімнің белгілі бір түрлерін, шикізат пен даяр бұйымдарды өндіруге және олармен айырбас жасауға мамандануын қалай атаймыз?");
                    txtTest1.setText("А) ғаламдану");
                    txtTest2.setText("В) ғылыми-техникалық революция");
                    txtTest3.setText("С) дүниежүзілік шаруашылық");
                    txtTest4.setText("Д) индустриялық даму");
                    txtTest5.setText("Е) географиялық еңбек бөлінісі");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("«Білім беру – ғылым өндіріс» жүйесі қай елде жоғары дәрежеде дамыған?");
                    txtTest1.setText("А) Болгария");
                    txtTest2.setText("В) Ресей");
                    txtTest3.setText("С) Франция");
                    txtTest4.setText("Д) Жапония");
                    txtTest5.setText("Е) АҚШ");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Қазақстанда қанша технопарк жұмыс істейді");
                    txtTest1.setText("А) 7");
                    txtTest2.setText("В) 6");
                    txtTest3.setText("С) 5");
                    txtTest4.setText("Д) 4");
                    txtTest5.setText("Е) 3");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Шаруашылық ұйымдасуының қазіргі дейін сақталған байырғы типі");
                    txtTest1.setText("А) нарықтық экономика");
                    txtTest2.setText("В) мемлекеттік");
                    txtTest3.setText("С) табиғи шаруашылық");
                    txtTest4.setText("Д) өтпелі экономика");
                    txtTest5.setText("Е) индустриялану");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Жиынтық өнімнің неше түрі бар?");
                    txtTest1.setText("А) 2");
                    txtTest2.setText("В) 3");
                    txtTest3.setText("С) 4");
                    txtTest4.setText("Д) 5");
                    txtTest5.setText("Е) 6");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("«Үлкен жетілік» құрамына кіретін елдер");
                    txtTest1.setText("А) АҚШ, Ұлыбритания, Израль, Аустралия, Қытай, Үндістан, Панама");
                    txtTest2.setText("В) Жаңа Зеландия, АҚШ, Жапония, Италия, Кипр, Ливия, Куба");
                    txtTest3.setText("С) Канада, Ұлыбритания, Шри-Ланка, Венесуэла, Гаита, Мексика, Корея");
                    txtTest4.setText("Д) АҚШ, Жапония, ГФР, Франция, Италия, Ұлыбритания, Канада");
                    txtTest5.setText("Е) АҚШ, ГФР, Лаос, Куба, Панама, Италия, Қытай");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Өтпелі экономика тән елдер тобы");
                    txtTest1.setText("А) Мальта, Кипр, Бразилия, Мексика, Нигерия");
                    txtTest2.setText("В) Қытай, Монғолия, Вьетнам, Лаос, Куба");
                    txtTest3.setText("С) Қытай, Куба, Үндістан, аргентина, Африка");
                    txtTest4.setText("Д) Панама, Мексика, Веневуэла, Қытай, Жапония");
                    txtTest5.setText("Е) Монғолия, Лаос, Бахрейн, Корея, Алжир");
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
                    String name = "Лекция 2";
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
                    question.setText("Дүниежүзілік шаруашылық дегеніміз не?");
                    txtTest1.setText("А) ғылыми – техникалық революция");
                    txtTest2.setText("В) ғаламдану");
                    txtTest3.setText("С) еңбек бөлінісі");
                    txtTest4.setText("Д) ұлттық шаруашылықтар жүйесі");
                    txtTest5.setText("Е) өнеркәсіптік революция");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Дүниежүзілік шаруашылықтың даму кезеңдері нешеге бөлінеді?");
                    txtTest1.setText("А) 2");
                    txtTest2.setText("В) 3");
                    txtTest3.setText("С) 4");
                    txtTest4.setText("Д) 5");
                    txtTest5.setText("Е) 6");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Қай жылы Суэц каналы іске қосылды?");
                    txtTest1.setText("А) 1863 ж");
                    txtTest2.setText("В) 1869 ж");
                    txtTest3.setText("С) 1870 ж");
                    txtTest4.setText("Д) 1910 ж");
                    txtTest5.setText("Е) 1914 ж");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Жеке елдердің өнімнің белгілі бір түрлерін, шикізат пен даяр бұйымдарды өндіруге және олармен айырбас жасауға мамандануын қалай атаймыз?");
                    txtTest1.setText("А) ғаламдану");
                    txtTest2.setText("В) ғылыми-техникалық революция");
                    txtTest3.setText("С) дүниежүзілік шаруашылық");
                    txtTest4.setText("Д) индустриялық даму");
                    txtTest5.setText("Е) географиялық еңбек бөлінісі");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("«Білім беру – ғылым өндіріс» жүйесі қай елде жоғары дәрежеде дамыған?");
                    txtTest1.setText("А) Болгария");
                    txtTest2.setText("В) Ресей");
                    txtTest3.setText("С) Франция");
                    txtTest4.setText("Д) Жапония");
                    txtTest5.setText("Е) АҚШ");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Қазақстанда қанша технопарк жұмыс істейді");
                    txtTest1.setText("А) 7");
                    txtTest2.setText("В) 6");
                    txtTest3.setText("С) 5");
                    txtTest4.setText("Д) 4");
                    txtTest5.setText("Е) 3");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Шаруашылық ұйымдасуының қазіргі дейін сақталған байырғы типі");
                    txtTest1.setText("А) нарықтық экономика");
                    txtTest2.setText("В) мемлекеттік");
                    txtTest3.setText("С) табиғи шаруашылық");
                    txtTest4.setText("Д) өтпелі экономика");
                    txtTest5.setText("Е) индустриялану");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Жиынтық өнімнің неше түрі бар?");
                    txtTest1.setText("А) 2");
                    txtTest2.setText("В) 3");
                    txtTest3.setText("С) 4");
                    txtTest4.setText("Д) 5");
                    txtTest5.setText("Е) 6");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("«Үлкен жетілік» құрамына кіретін елдер");
                    txtTest1.setText("А) АҚШ, Ұлыбритания, Израль, Аустралия, Қытай, Үндістан, Панама");
                    txtTest2.setText("В) Жаңа Зеландия, АҚШ, Жапония, Италия, Кипр, Ливия, Куба");
                    txtTest3.setText("С) Канада, Ұлыбритания, Шри-Ланка, Венесуэла, Гаита, Мексика, Корея");
                    txtTest4.setText("Д) АҚШ, Жапония, ГФР, Франция, Италия, Ұлыбритания, Канада");
                    txtTest5.setText("Е) АҚШ, ГФР, Лаос, Куба, Панама, Италия, Қытай");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Өтпелі экономика тән елдер тобы");
                    txtTest1.setText("А) Мальта, Кипр, Бразилия, Мексика, Нигерия");
                    txtTest2.setText("В) Қытай, Монғолия, Вьетнам, Лаос, Куба");
                    txtTest3.setText("С) Қытай, Куба, Үндістан, аргентина, Африка");
                    txtTest4.setText("Д) Панама, Мексика, Веневуэла, Қытай, Жапония");
                    txtTest5.setText("Е) Монғолия, Лаос, Бахрейн, Корея, Алжир");
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
                    String name = "Лекция 2";
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
                    question.setText("Дүниежүзілік шаруашылық дегеніміз не?");
                    txtTest1.setText("А) ғылыми – техникалық революция");
                    txtTest2.setText("В) ғаламдану");
                    txtTest3.setText("С) еңбек бөлінісі");
                    txtTest4.setText("Д) ұлттық шаруашылықтар жүйесі");
                    txtTest5.setText("Е) өнеркәсіптік революция");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Дүниежүзілік шаруашылықтың даму кезеңдері нешеге бөлінеді?");
                    txtTest1.setText("А) 2");
                    txtTest2.setText("В) 3");
                    txtTest3.setText("С) 4");
                    txtTest4.setText("Д) 5");
                    txtTest5.setText("Е) 6");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Қай жылы Суэц каналы іске қосылды?");
                    txtTest1.setText("А) 1863 ж");
                    txtTest2.setText("В) 1869 ж");
                    txtTest3.setText("С) 1870 ж");
                    txtTest4.setText("Д) 1910 ж");
                    txtTest5.setText("Е) 1914 ж");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Жеке елдердің өнімнің белгілі бір түрлерін, шикізат пен даяр бұйымдарды өндіруге және олармен айырбас жасауға мамандануын қалай атаймыз?");
                    txtTest1.setText("А) ғаламдану");
                    txtTest2.setText("В) ғылыми-техникалық революция");
                    txtTest3.setText("С) дүниежүзілік шаруашылық");
                    txtTest4.setText("Д) индустриялық даму");
                    txtTest5.setText("Е) географиялық еңбек бөлінісі");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("«Білім беру – ғылым өндіріс» жүйесі қай елде жоғары дәрежеде дамыған?");
                    txtTest1.setText("А) Болгария");
                    txtTest2.setText("В) Ресей");
                    txtTest3.setText("С) Франция");
                    txtTest4.setText("Д) Жапония");
                    txtTest5.setText("Е) АҚШ");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Қазақстанда қанша технопарк жұмыс істейді");
                    txtTest1.setText("А) 7");
                    txtTest2.setText("В) 6");
                    txtTest3.setText("С) 5");
                    txtTest4.setText("Д) 4");
                    txtTest5.setText("Е) 3");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Шаруашылық ұйымдасуының қазіргі дейін сақталған байырғы типі");
                    txtTest1.setText("А) нарықтық экономика");
                    txtTest2.setText("В) мемлекеттік");
                    txtTest3.setText("С) табиғи шаруашылық");
                    txtTest4.setText("Д) өтпелі экономика");
                    txtTest5.setText("Е) индустриялану");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Жиынтық өнімнің неше түрі бар?");
                    txtTest1.setText("А) 2");
                    txtTest2.setText("В) 3");
                    txtTest3.setText("С) 4");
                    txtTest4.setText("Д) 5");
                    txtTest5.setText("Е) 6");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("«Үлкен жетілік» құрамына кіретін елдер");
                    txtTest1.setText("А) АҚШ, Ұлыбритания, Израль, Аустралия, Қытай, Үндістан, Панама");
                    txtTest2.setText("В) Жаңа Зеландия, АҚШ, Жапония, Италия, Кипр, Ливия, Куба");
                    txtTest3.setText("С) Канада, Ұлыбритания, Шри-Ланка, Венесуэла, Гаита, Мексика, Корея");
                    txtTest4.setText("Д) АҚШ, Жапония, ГФР, Франция, Италия, Ұлыбритания, Канада");
                    txtTest5.setText("Е) АҚШ, ГФР, Лаос, Куба, Панама, Италия, Қытай");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Өтпелі экономика тән елдер тобы");
                    txtTest1.setText("А) Мальта, Кипр, Бразилия, Мексика, Нигерия");
                    txtTest2.setText("В) Қытай, Монғолия, Вьетнам, Лаос, Куба");
                    txtTest3.setText("С) Қытай, Куба, Үндістан, аргентина, Африка");
                    txtTest4.setText("Д) Панама, Мексика, Веневуэла, Қытай, Жапония");
                    txtTest5.setText("Е) Монғолия, Лаос, Бахрейн, Корея, Алжир");
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
                    String name = "Лекция 2";
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

        }
    }
}
