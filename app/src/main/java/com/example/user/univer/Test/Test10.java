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
public class Test10 extends Activity implements View.OnClickListener {

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

        question.setText("Ауадағы су буы тұтастай орналасқан қабат");
        txtTest1.setText("A) атмосфераның жоғарғы қабаты ");
        txtTest2.setText("B) ионосфера  ");
        txtTest3.setText("C) мезосфера  ");
        txtTest4.setText("D) стратосфера  ");
        txtTest5.setText("E) тропосфера");
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
                    question.setText("Ауадағы су буы тұтастай орналасқан қабат");
                    txtTest1.setText("A) атмосфераның жоғарғы қабаты ");
                    txtTest2.setText("B) ионосфера  ");
                    txtTest3.setText("C) мезосфера  ");
                    txtTest4.setText("D) стратосфера  ");
                    txtTest5.setText("E) тропосфера");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Атмосфераның төменгі қабаты ");
                    txtTest1.setText("A) стратосфера ");
                    txtTest2.setText("B) экзосфера  ");
                    txtTest3.setText("C) мезосфера  ");
                    txtTest4.setText("D) тропосфера  ");
                    txtTest5.setText("E) термосфера");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Жоғарғы қысым аймағы ");
                    txtTest1.setText("A) булану  ");
                    txtTest2.setText("B) атмосфералық фронт ");
                    txtTest3.setText("C) циклон  ");
                    txtTest4.setText("D) ылғалдану  ");
                    txtTest5.setText("E) антициклон  ");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Атмосферада бұл қабаттың биіктігі 50-55 шақырым");
                    txtTest1.setText("A) термосфера ");
                    txtTest2.setText("B) стратосфера ");
                    txtTest3.setText("C) ионосфера ");
                    txtTest4.setText("D) мезосфера ");
                    txtTest5.setText("E) тропосфера ");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Әр түрлі ауа массаларының аралығында өтпелі аймақтар");
                    txtTest1.setText("A) ылғалдану коэффициент ");
                    txtTest2.setText("B) атмосфералық фронт ");
                    txtTest3.setText("C) антициклон ");
                    txtTest4.setText("D) циклон ");
                    txtTest5.setText("E) ауа массалары ");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Ең суық климаттық белдеу");
                    txtTest1.setText("A) қоңыржай белдеу ");
                    txtTest2.setText("B) арктикалық белдеу ");
                    txtTest3.setText("C) субтропиктік белдеу ");
                    txtTest4.setText("D) тропикалық белдеу ");
                    txtTest5.setText("E) экваторлық белдеу ");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Қысымы бірдей нүктелерді қосатын сызықтарды ... деп атайды");
                    txtTest1.setText("A) изогиета   ");
                    txtTest2.setText("B) изотерма   ");
                    txtTest3.setText("C) циклон   ");
                    txtTest4.setText("D) изобара   ");
                    txtTest5.setText("E) ауа температурасы  ");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Атмосфералық қысымды өлшейтін құрал");
                    txtTest1.setText("A) изобар    ");
                    txtTest2.setText("B) борометр    ");
                    txtTest3.setText("C) термометр    ");
                    txtTest4.setText("D) психометр    ");
                    txtTest5.setText("E) нивелир  ");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Тәулігіне бағытын өзгертіп отыратын желдер");
                    txtTest1.setText("A) Ебі желі ");
                    txtTest2.setText("B) Пассат желі ");
                    txtTest3.setText("C) Бриз ");
                    txtTest4.setText("D) Сайқан желі ");
                    txtTest5.setText("Е) Муссон ");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Орыс климатологы Б.П.Алисов жер шарын неше климаттық белдеу жіктеген");
                    txtTest1.setText("A) 5  ");
                    txtTest2.setText("B) 6  ");
                    txtTest3.setText("C) 7  ");
                    txtTest4.setText("D) 13  ");
                    txtTest5.setText("E) 14 ");
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
                    String name = "Атмосфера және климат";
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
            case R.id.varB:
                if(count==0){
                    question.setText("Ауадағы су буы тұтастай орналасқан қабат");
                    txtTest1.setText("A) атмосфераның жоғарғы қабаты ");
                    txtTest2.setText("B) ионосфера  ");
                    txtTest3.setText("C) мезосфера  ");
                    txtTest4.setText("D) стратосфера  ");
                    txtTest5.setText("E) тропосфера");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Атмосфераның төменгі қабаты ");
                    txtTest1.setText("A) стратосфера ");
                    txtTest2.setText("B) экзосфера  ");
                    txtTest3.setText("C) мезосфера  ");
                    txtTest4.setText("D) тропосфера  ");
                    txtTest5.setText("E) термосфера");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Жоғарғы қысым аймағы ");
                    txtTest1.setText("A) булану  ");
                    txtTest2.setText("B) атмосфералық фронт ");
                    txtTest3.setText("C) циклон  ");
                    txtTest4.setText("D) ылғалдану  ");
                    txtTest5.setText("E) антициклон  ");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Атмосферада бұл қабаттың биіктігі 50-55 шақырым");
                    txtTest1.setText("A) термосфера ");
                    txtTest2.setText("B) стратосфера ");
                    txtTest3.setText("C) ионосфера ");
                    txtTest4.setText("D) мезосфера ");
                    txtTest5.setText("E) тропосфера ");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Әр түрлі ауа массаларының аралығында өтпелі аймақтар");
                    txtTest1.setText("A) ылғалдану коэффициент ");
                    txtTest2.setText("B) атмосфералық фронт ");
                    txtTest3.setText("C) антициклон ");
                    txtTest4.setText("D) циклон ");
                    txtTest5.setText("E) ауа массалары ");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Ең суық климаттық белдеу");
                    txtTest1.setText("A) қоңыржай белдеу ");
                    txtTest2.setText("B) арктикалық белдеу ");
                    txtTest3.setText("C) субтропиктік белдеу ");
                    txtTest4.setText("D) тропикалық белдеу ");
                    txtTest5.setText("E) экваторлық белдеу ");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Қысымы бірдей нүктелерді қосатын сызықтарды ... деп атайды");
                    txtTest1.setText("A) изогиета   ");
                    txtTest2.setText("B) изотерма   ");
                    txtTest3.setText("C) циклон   ");
                    txtTest4.setText("D) изобара   ");
                    txtTest5.setText("E) ауа температурасы  ");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Атмосфералық қысымды өлшейтін құрал");
                    txtTest1.setText("A) изобар    ");
                    txtTest2.setText("B) борометр    ");
                    txtTest3.setText("C) термометр    ");
                    txtTest4.setText("D) психометр    ");
                    txtTest5.setText("E) нивелир  ");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Тәулігіне бағытын өзгертіп отыратын желдер");
                    txtTest1.setText("A) Ебі желі ");
                    txtTest2.setText("B) Пассат желі ");
                    txtTest3.setText("C) Бриз ");
                    txtTest4.setText("D) Сайқан желі ");
                    txtTest5.setText("Е) Муссон ");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Орыс климатологы Б.П.Алисов жер шарын неше климаттық белдеу жіктеген");
                    txtTest1.setText("A) 5  ");
                    txtTest2.setText("B) 6  ");
                    txtTest3.setText("C) 7  ");
                    txtTest4.setText("D) 13  ");
                    txtTest5.setText("E) 14 ");
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
                    String name = "Атмосфера және климат";
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
                    question.setText("Ауадағы су буы тұтастай орналасқан қабат");
                    txtTest1.setText("A) атмосфераның жоғарғы қабаты ");
                    txtTest2.setText("B) ионосфера  ");
                    txtTest3.setText("C) мезосфера  ");
                    txtTest4.setText("D) стратосфера  ");
                    txtTest5.setText("E) тропосфера");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Атмосфераның төменгі қабаты ");
                    txtTest1.setText("A) стратосфера ");
                    txtTest2.setText("B) экзосфера  ");
                    txtTest3.setText("C) мезосфера  ");
                    txtTest4.setText("D) тропосфера  ");
                    txtTest5.setText("E) термосфера");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Жоғарғы қысым аймағы ");
                    txtTest1.setText("A) булану  ");
                    txtTest2.setText("B) атмосфералық фронт ");
                    txtTest3.setText("C) циклон  ");
                    txtTest4.setText("D) ылғалдану  ");
                    txtTest5.setText("E) антициклон  ");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Атмосферада бұл қабаттың биіктігі 50-55 шақырым");
                    txtTest1.setText("A) термосфера ");
                    txtTest2.setText("B) стратосфера ");
                    txtTest3.setText("C) ионосфера ");
                    txtTest4.setText("D) мезосфера ");
                    txtTest5.setText("E) тропосфера ");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Әр түрлі ауа массаларының аралығында өтпелі аймақтар");
                    txtTest1.setText("A) ылғалдану коэффициент ");
                    txtTest2.setText("B) атмосфералық фронт ");
                    txtTest3.setText("C) антициклон ");
                    txtTest4.setText("D) циклон ");
                    txtTest5.setText("E) ауа массалары ");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Ең суық климаттық белдеу");
                    txtTest1.setText("A) қоңыржай белдеу ");
                    txtTest2.setText("B) арктикалық белдеу ");
                    txtTest3.setText("C) субтропиктік белдеу ");
                    txtTest4.setText("D) тропикалық белдеу ");
                    txtTest5.setText("E) экваторлық белдеу ");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Қысымы бірдей нүктелерді қосатын сызықтарды ... деп атайды");
                    txtTest1.setText("A) изогиета   ");
                    txtTest2.setText("B) изотерма   ");
                    txtTest3.setText("C) циклон   ");
                    txtTest4.setText("D) изобара   ");
                    txtTest5.setText("E) ауа температурасы  ");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Атмосфералық қысымды өлшейтін құрал");
                    txtTest1.setText("A) изобар    ");
                    txtTest2.setText("B) борометр    ");
                    txtTest3.setText("C) термометр    ");
                    txtTest4.setText("D) психометр    ");
                    txtTest5.setText("E) нивелир  ");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Тәулігіне бағытын өзгертіп отыратын желдер");
                    txtTest1.setText("A) Ебі желі ");
                    txtTest2.setText("B) Пассат желі ");
                    txtTest3.setText("C) Бриз ");
                    txtTest4.setText("D) Сайқан желі ");
                    txtTest5.setText("Е) Муссон ");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Орыс климатологы Б.П.Алисов жер шарын неше климаттық белдеу жіктеген");
                    txtTest1.setText("A) 5  ");
                    txtTest2.setText("B) 6  ");
                    txtTest3.setText("C) 7  ");
                    txtTest4.setText("D) 13  ");
                    txtTest5.setText("E) 14 ");
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
                    String name = "Атмосфера және климат";
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
                    correct++;
                count++;
            }
            else if(count==9){
                incorrect = (incorrect+" 10");
                count++;
            }
                break;
            case R.id.varD:
                if(count==0){
                    question.setText("Ауадағы су буы тұтастай орналасқан қабат");
                    txtTest1.setText("A) атмосфераның жоғарғы қабаты ");
                    txtTest2.setText("B) ионосфера  ");
                    txtTest3.setText("C) мезосфера  ");
                    txtTest4.setText("D) стратосфера  ");
                    txtTest5.setText("E) тропосфера");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Атмосфераның төменгі қабаты ");
                    txtTest1.setText("A) стратосфера ");
                    txtTest2.setText("B) экзосфера  ");
                    txtTest3.setText("C) мезосфера  ");
                    txtTest4.setText("D) тропосфера  ");
                    txtTest5.setText("E) термосфера");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Жоғарғы қысым аймағы ");
                    txtTest1.setText("A) булану  ");
                    txtTest2.setText("B) атмосфералық фронт ");
                    txtTest3.setText("C) циклон  ");
                    txtTest4.setText("D) ылғалдану  ");
                    txtTest5.setText("E) антициклон  ");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Атмосферада бұл қабаттың биіктігі 50-55 шақырым");
                    txtTest1.setText("A) термосфера ");
                    txtTest2.setText("B) стратосфера ");
                    txtTest3.setText("C) ионосфера ");
                    txtTest4.setText("D) мезосфера ");
                    txtTest5.setText("E) тропосфера ");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Әр түрлі ауа массаларының аралығында өтпелі аймақтар");
                    txtTest1.setText("A) ылғалдану коэффициент ");
                    txtTest2.setText("B) атмосфералық фронт ");
                    txtTest3.setText("C) антициклон ");
                    txtTest4.setText("D) циклон ");
                    txtTest5.setText("E) ауа массалары ");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Ең суық климаттық белдеу");
                    txtTest1.setText("A) қоңыржай белдеу ");
                    txtTest2.setText("B) арктикалық белдеу ");
                    txtTest3.setText("C) субтропиктік белдеу ");
                    txtTest4.setText("D) тропикалық белдеу ");
                    txtTest5.setText("E) экваторлық белдеу ");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Қысымы бірдей нүктелерді қосатын сызықтарды ... деп атайды");
                    txtTest1.setText("A) изогиета   ");
                    txtTest2.setText("B) изотерма   ");
                    txtTest3.setText("C) циклон   ");
                    txtTest4.setText("D) изобара   ");
                    txtTest5.setText("E) ауа температурасы  ");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Атмосфералық қысымды өлшейтін құрал");
                    txtTest1.setText("A) изобар    ");
                    txtTest2.setText("B) борометр    ");
                    txtTest3.setText("C) термометр    ");
                    txtTest4.setText("D) психометр    ");
                    txtTest5.setText("E) нивелир  ");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Тәулігіне бағытын өзгертіп отыратын желдер");
                    txtTest1.setText("A) Ебі желі ");
                    txtTest2.setText("B) Пассат желі ");
                    txtTest3.setText("C) Бриз ");
                    txtTest4.setText("D) Сайқан желі ");
                    txtTest5.setText("Е) Муссон ");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Орыс климатологы Б.П.Алисов жер шарын неше климаттық белдеу жіктеген");
                    txtTest1.setText("A) 5  ");
                    txtTest2.setText("B) 6  ");
                    txtTest3.setText("C) 7  ");
                    txtTest4.setText("D) 13  ");
                    txtTest5.setText("E) 14 ");
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
                    String name = "Атмосфера және климат";
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
            case R.id.varE:
                if(count==0){
                    question.setText("Ауадағы су буы тұтастай орналасқан қабат");
                    txtTest1.setText("A) атмосфераның жоғарғы қабаты ");
                    txtTest2.setText("B) ионосфера  ");
                    txtTest3.setText("C) мезосфера  ");
                    txtTest4.setText("D) стратосфера  ");
                    txtTest5.setText("E) тропосфера");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Атмосфераның төменгі қабаты ");
                    txtTest1.setText("A) стратосфера ");
                    txtTest2.setText("B) экзосфера  ");
                    txtTest3.setText("C) мезосфера  ");
                    txtTest4.setText("D) тропосфера  ");
                    txtTest5.setText("E) термосфера");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Жоғарғы қысым аймағы ");
                    txtTest1.setText("A) булану  ");
                    txtTest2.setText("B) атмосфералық фронт ");
                    txtTest3.setText("C) циклон  ");
                    txtTest4.setText("D) ылғалдану  ");
                    txtTest5.setText("E) антициклон  ");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Атмосферада бұл қабаттың биіктігі 50-55 шақырым");
                    txtTest1.setText("A) термосфера ");
                    txtTest2.setText("B) стратосфера ");
                    txtTest3.setText("C) ионосфера ");
                    txtTest4.setText("D) мезосфера ");
                    txtTest5.setText("E) тропосфера ");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Әр түрлі ауа массаларының аралығында өтпелі аймақтар");
                    txtTest1.setText("A) ылғалдану коэффициент ");
                    txtTest2.setText("B) атмосфералық фронт ");
                    txtTest3.setText("C) антициклон ");
                    txtTest4.setText("D) циклон ");
                    txtTest5.setText("E) ауа массалары ");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Ең суық климаттық белдеу");
                    txtTest1.setText("A) қоңыржай белдеу ");
                    txtTest2.setText("B) арктикалық белдеу ");
                    txtTest3.setText("C) субтропиктік белдеу ");
                    txtTest4.setText("D) тропикалық белдеу ");
                    txtTest5.setText("E) экваторлық белдеу ");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Қысымы бірдей нүктелерді қосатын сызықтарды ... деп атайды");
                    txtTest1.setText("A) изогиета   ");
                    txtTest2.setText("B) изотерма   ");
                    txtTest3.setText("C) циклон   ");
                    txtTest4.setText("D) изобара   ");
                    txtTest5.setText("E) ауа температурасы  ");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Атмосфералық қысымды өлшейтін құрал");
                    txtTest1.setText("A) изобар    ");
                    txtTest2.setText("B) борометр    ");
                    txtTest3.setText("C) термометр    ");
                    txtTest4.setText("D) психометр    ");
                    txtTest5.setText("E) нивелир  ");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Тәулігіне бағытын өзгертіп отыратын желдер");
                    txtTest1.setText("A) Ебі желі ");
                    txtTest2.setText("B) Пассат желі ");
                    txtTest3.setText("C) Бриз ");
                    txtTest4.setText("D) Сайқан желі ");
                    txtTest5.setText("Е) Муссон ");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Орыс климатологы Б.П.Алисов жер шарын неше климаттық белдеу жіктеген");
                    txtTest1.setText("A) 5  ");
                    txtTest2.setText("B) 6  ");
                    txtTest3.setText("C) 7  ");
                    txtTest4.setText("D) 13  ");
                    txtTest5.setText("E) 14 ");
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
                    String name = "Атмосфера және климат";
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
