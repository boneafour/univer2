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
public class Test9 extends Activity implements View.OnClickListener {

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

        question.setText("Жер қыртысындағы ең ежелгі тау жынысының абсолюттік жасы ");
        txtTest1.setText("A) 3,4 млрд ");
        txtTest2.setText("B) 3,6 млрд ");
        txtTest3.setText("C) 3,8 млрд ");
        txtTest4.setText("D) 4,8 млрд ");
        txtTest5.setText("E) 5,5 млрд");
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
                    question.setText("Жер қыртысындағы ең ежелгі тау жынысының абсолюттік жасы ");
                    txtTest1.setText("A) 3,4 млрд ");
                    txtTest2.setText("B) 3,6 млрд ");
                    txtTest3.setText("C) 3,8 млрд ");
                    txtTest4.setText("D) 4,8 млрд ");
                    txtTest5.setText("E) 5,5 млрд");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Соңғы эраны атаңыз");
                    txtTest1.setText("A) мезазой");
                    txtTest2.setText("B) архей ");
                    txtTest3.setText("C) протерозой ");
                    txtTest4.setText("D) кайназой ");
                    txtTest5.setText("E) палеозой");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Жердің ішкі, сырты құрылысын зерттейтін ғылым");
                    txtTest1.setText("A) геология ");
                    txtTest2.setText("B) география ");
                    txtTest3.setText("C) геоморфология ");
                    txtTest4.setText("D) геология ");
                    txtTest5.setText("E) барлығы ");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Литосфера бөліктері");
                    txtTest1.setText("A) жер қыртысы, мантияның беткі бөлігі ");
                    txtTest2.setText("B) ядро, гранит, базальт  ");
                    txtTest3.setText("C) мантия, магма, ядро ");
                    txtTest4.setText("D) саз, әктас, гранит  ");
                    txtTest5.setText("E) ядро базальт");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Үгілу дегеніміз");
                    txtTest1.setText("A) тау жыныстарының күйреуі ");
                    txtTest2.setText("B) циклонның әсері ");
                    txtTest3.setText("C) жел жынысы  ");
                    txtTest4.setText("D) жыныстардың жиналуы барысында отыруы  ");
                    txtTest5.setText("E) қатты жыныстарды жер арқылы ауыстыру");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Эндогендік процестер бұл ...");
                    txtTest1.setText("A) жел  ");
                    txtTest2.setText("B) өсімдік  ");
                    txtTest3.setText("C) су ");
                    txtTest4.setText("D) жел сілкінісі  ");
                    txtTest5.setText("E) ауа");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Литосфералық тақталардың қозғалысы жылдамдығы жылына ....");
                    txtTest1.setText("A) 2 см-ден 5 см-ге дейін ");
                    txtTest2.setText("B) 8 см-ден 5см-ге дейін  ");
                    txtTest3.setText("C) 1 см-ден 1 см-ге дейін ");
                    txtTest4.setText("D) 7 см-ден 15 см-ге дейін ");
                    txtTest5.setText("E) 10 см-ден 16 см-ге дейін");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Жер қыртысының ежелгі, біршама, тұрақты әр тегіс учаскесі");
                    txtTest1.setText("A) плита  ");
                    txtTest2.setText("B) рифт  ");
                    txtTest3.setText("C) платформа  ");
                    txtTest4.setText("D) континент  ");
                    txtTest5.setText("E) құрлық  ");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Жер бедерінің қалыптастыратын жағдайлар ");
                    txtTest1.setText("A) мұхиттардың жақындығы ");
                    txtTest2.setText("B) атмосфера циркуляциясы ");
                    txtTest3.setText("C) жердің өз осьнен қозғалуы ");
                    txtTest4.setText("D) ішкі және сыртқы күштер ");
                    txtTest5.setText("Е) жердің орбиталық қозғалысы");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Жартылай немесе толығымен жарамсыз жерлер");
                    txtTest1.setText("A) карьер ");
                    txtTest2.setText("B) сай ");
                    txtTest3.setText("C) бедленд ");
                    txtTest4.setText("D) бос жерлер ");
                    txtTest5.setText("E) батпақ ");
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
                    String name = "Лекция 9";
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
                    question.setText("Жер қыртысындағы ең ежелгі тау жынысының абсолюттік жасы ");
                    txtTest1.setText("A) 3,4 млрд ");
                    txtTest2.setText("B) 3,6 млрд ");
                    txtTest3.setText("C) 3,8 млрд ");
                    txtTest4.setText("D) 4,8 млрд ");
                    txtTest5.setText("E) 5,5 млрд");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Соңғы эраны атаңыз");
                    txtTest1.setText("A) мезазой");
                    txtTest2.setText("B) архей ");
                    txtTest3.setText("C) протерозой ");
                    txtTest4.setText("D) кайназой ");
                    txtTest5.setText("E) палеозой");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Жердің ішкі, сырты құрылысын зерттейтін ғылым");
                    txtTest1.setText("A) геология ");
                    txtTest2.setText("B) география ");
                    txtTest3.setText("C) геоморфология ");
                    txtTest4.setText("D) геология ");
                    txtTest5.setText("E) барлығы ");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Литосфера бөліктері");
                    txtTest1.setText("A) жер қыртысы, мантияның беткі бөлігі ");
                    txtTest2.setText("B) ядро, гранит, базальт  ");
                    txtTest3.setText("C) мантия, магма, ядро ");
                    txtTest4.setText("D) саз, әктас, гранит  ");
                    txtTest5.setText("E) ядро базальт");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Үгілу дегеніміз");
                    txtTest1.setText("A) тау жыныстарының күйреуі ");
                    txtTest2.setText("B) циклонның әсері ");
                    txtTest3.setText("C) жел жынысы  ");
                    txtTest4.setText("D) жыныстардың жиналуы барысында отыруы  ");
                    txtTest5.setText("E) қатты жыныстарды жер арқылы ауыстыру");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Эндогендік процестер бұл ...");
                    txtTest1.setText("A) жел  ");
                    txtTest2.setText("B) өсімдік  ");
                    txtTest3.setText("C) су ");
                    txtTest4.setText("D) жел сілкінісі  ");
                    txtTest5.setText("E) ауа");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Литосфералық тақталардың қозғалысы жылдамдығы жылына ....");
                    txtTest1.setText("A) 2 см-ден 5 см-ге дейін ");
                    txtTest2.setText("B) 8 см-ден 5см-ге дейін  ");
                    txtTest3.setText("C) 1 см-ден 1 см-ге дейін ");
                    txtTest4.setText("D) 7 см-ден 15 см-ге дейін ");
                    txtTest5.setText("E) 10 см-ден 16 см-ге дейін");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Жер қыртысының ежелгі, біршама, тұрақты әр тегіс учаскесі");
                    txtTest1.setText("A) плита  ");
                    txtTest2.setText("B) рифт  ");
                    txtTest3.setText("C) платформа  ");
                    txtTest4.setText("D) континент  ");
                    txtTest5.setText("E) құрлық  ");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Жер бедерінің қалыптастыратын жағдайлар ");
                    txtTest1.setText("A) мұхиттардың жақындығы ");
                    txtTest2.setText("B) атмосфера циркуляциясы ");
                    txtTest3.setText("C) жердің өз осьнен қозғалуы ");
                    txtTest4.setText("D) ішкі және сыртқы күштер ");
                    txtTest5.setText("Е) жердің орбиталық қозғалысы");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Жартылай немесе толығымен жарамсыз жерлер");
                    txtTest1.setText("A) карьер ");
                    txtTest2.setText("B) сай ");
                    txtTest3.setText("C) бедленд ");
                    txtTest4.setText("D) бос жерлер ");
                    txtTest5.setText("E) батпақ ");
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
                    String name = "Лекция 9";
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
                    question.setText("Жер қыртысындағы ең ежелгі тау жынысының абсолюттік жасы ");
                    txtTest1.setText("A) 3,4 млрд ");
                    txtTest2.setText("B) 3,6 млрд ");
                    txtTest3.setText("C) 3,8 млрд ");
                    txtTest4.setText("D) 4,8 млрд ");
                    txtTest5.setText("E) 5,5 млрд");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Соңғы эраны атаңыз");
                    txtTest1.setText("A) мезазой");
                    txtTest2.setText("B) архей ");
                    txtTest3.setText("C) протерозой ");
                    txtTest4.setText("D) кайназой ");
                    txtTest5.setText("E) палеозой");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Жердің ішкі, сырты құрылысын зерттейтін ғылым");
                    txtTest1.setText("A) геология ");
                    txtTest2.setText("B) география ");
                    txtTest3.setText("C) геоморфология ");
                    txtTest4.setText("D) геология ");
                    txtTest5.setText("E) барлығы ");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Литосфера бөліктері");
                    txtTest1.setText("A) жер қыртысы, мантияның беткі бөлігі ");
                    txtTest2.setText("B) ядро, гранит, базальт  ");
                    txtTest3.setText("C) мантия, магма, ядро ");
                    txtTest4.setText("D) саз, әктас, гранит  ");
                    txtTest5.setText("E) ядро базальт");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Үгілу дегеніміз");
                    txtTest1.setText("A) тау жыныстарының күйреуі ");
                    txtTest2.setText("B) циклонның әсері ");
                    txtTest3.setText("C) жел жынысы  ");
                    txtTest4.setText("D) жыныстардың жиналуы барысында отыруы  ");
                    txtTest5.setText("E) қатты жыныстарды жер арқылы ауыстыру");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Эндогендік процестер бұл ...");
                    txtTest1.setText("A) жел  ");
                    txtTest2.setText("B) өсімдік  ");
                    txtTest3.setText("C) су ");
                    txtTest4.setText("D) жел сілкінісі  ");
                    txtTest5.setText("E) ауа");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Литосфералық тақталардың қозғалысы жылдамдығы жылына ....");
                    txtTest1.setText("A) 2 см-ден 5 см-ге дейін ");
                    txtTest2.setText("B) 8 см-ден 5см-ге дейін  ");
                    txtTest3.setText("C) 1 см-ден 1 см-ге дейін ");
                    txtTest4.setText("D) 7 см-ден 15 см-ге дейін ");
                    txtTest5.setText("E) 10 см-ден 16 см-ге дейін");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Жер қыртысының ежелгі, біршама, тұрақты әр тегіс учаскесі");
                    txtTest1.setText("A) плита  ");
                    txtTest2.setText("B) рифт  ");
                    txtTest3.setText("C) платформа  ");
                    txtTest4.setText("D) континент  ");
                    txtTest5.setText("E) құрлық  ");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Жер бедерінің қалыптастыратын жағдайлар ");
                    txtTest1.setText("A) мұхиттардың жақындығы ");
                    txtTest2.setText("B) атмосфера циркуляциясы ");
                    txtTest3.setText("C) жердің өз осьнен қозғалуы ");
                    txtTest4.setText("D) ішкі және сыртқы күштер ");
                    txtTest5.setText("Е) жердің орбиталық қозғалысы");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Жартылай немесе толығымен жарамсыз жерлер");
                    txtTest1.setText("A) карьер ");
                    txtTest2.setText("B) сай ");
                    txtTest3.setText("C) бедленд ");
                    txtTest4.setText("D) бос жерлер ");
                    txtTest5.setText("E) батпақ ");
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
                    String name = "Лекция 9";
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
            case R.id.varD:
                if(count==0){
                    question.setText("Жер қыртысындағы ең ежелгі тау жынысының абсолюттік жасы ");
                    txtTest1.setText("A) 3,4 млрд ");
                    txtTest2.setText("B) 3,6 млрд ");
                    txtTest3.setText("C) 3,8 млрд ");
                    txtTest4.setText("D) 4,8 млрд ");
                    txtTest5.setText("E) 5,5 млрд");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Соңғы эраны атаңыз");
                    txtTest1.setText("A) мезазой");
                    txtTest2.setText("B) архей ");
                    txtTest3.setText("C) протерозой ");
                    txtTest4.setText("D) кайназой ");
                    txtTest5.setText("E) палеозой");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Жердің ішкі, сырты құрылысын зерттейтін ғылым");
                    txtTest1.setText("A) геология ");
                    txtTest2.setText("B) география ");
                    txtTest3.setText("C) геоморфология ");
                    txtTest4.setText("D) геология ");
                    txtTest5.setText("E) барлығы ");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Литосфера бөліктері");
                    txtTest1.setText("A) жер қыртысы, мантияның беткі бөлігі ");
                    txtTest2.setText("B) ядро, гранит, базальт  ");
                    txtTest3.setText("C) мантия, магма, ядро ");
                    txtTest4.setText("D) саз, әктас, гранит  ");
                    txtTest5.setText("E) ядро базальт");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Үгілу дегеніміз");
                    txtTest1.setText("A) тау жыныстарының күйреуі ");
                    txtTest2.setText("B) циклонның әсері ");
                    txtTest3.setText("C) жел жынысы  ");
                    txtTest4.setText("D) жыныстардың жиналуы барысында отыруы  ");
                    txtTest5.setText("E) қатты жыныстарды жер арқылы ауыстыру");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Эндогендік процестер бұл ...");
                    txtTest1.setText("A) жел  ");
                    txtTest2.setText("B) өсімдік  ");
                    txtTest3.setText("C) су ");
                    txtTest4.setText("D) жел сілкінісі  ");
                    txtTest5.setText("E) ауа");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Литосфералық тақталардың қозғалысы жылдамдығы жылына ....");
                    txtTest1.setText("A) 2 см-ден 5 см-ге дейін ");
                    txtTest2.setText("B) 8 см-ден 5см-ге дейін  ");
                    txtTest3.setText("C) 1 см-ден 1 см-ге дейін ");
                    txtTest4.setText("D) 7 см-ден 15 см-ге дейін ");
                    txtTest5.setText("E) 10 см-ден 16 см-ге дейін");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Жер қыртысының ежелгі, біршама, тұрақты әр тегіс учаскесі");
                    txtTest1.setText("A) плита  ");
                    txtTest2.setText("B) рифт  ");
                    txtTest3.setText("C) платформа  ");
                    txtTest4.setText("D) континент  ");
                    txtTest5.setText("E) құрлық  ");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Жер бедерінің қалыптастыратын жағдайлар ");
                    txtTest1.setText("A) мұхиттардың жақындығы ");
                    txtTest2.setText("B) атмосфера циркуляциясы ");
                    txtTest3.setText("C) жердің өз осьнен қозғалуы ");
                    txtTest4.setText("D) ішкі және сыртқы күштер ");
                    txtTest5.setText("Е) жердің орбиталық қозғалысы");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Жартылай немесе толығымен жарамсыз жерлер");
                    txtTest1.setText("A) карьер ");
                    txtTest2.setText("B) сай ");
                    txtTest3.setText("C) бедленд ");
                    txtTest4.setText("D) бос жерлер ");
                    txtTest5.setText("E) батпақ ");
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
                    String name = "Лекция 9";
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
                    question.setText("Жер қыртысындағы ең ежелгі тау жынысының абсолюттік жасы ");
                    txtTest1.setText("A) 3,4 млрд ");
                    txtTest2.setText("B) 3,6 млрд ");
                    txtTest3.setText("C) 3,8 млрд ");
                    txtTest4.setText("D) 4,8 млрд ");
                    txtTest5.setText("E) 5,5 млрд");
                    testNumber.setText("1/10");
                }
                else if(count==1){
                    question.setText("Соңғы эраны атаңыз");
                    txtTest1.setText("A) мезазой");
                    txtTest2.setText("B) архей ");
                    txtTest3.setText("C) протерозой ");
                    txtTest4.setText("D) кайназой ");
                    txtTest5.setText("E) палеозой");
                    testNumber.setText("2/10");
                }
                else if(count==2){
                    question.setText("Жердің ішкі, сырты құрылысын зерттейтін ғылым");
                    txtTest1.setText("A) геология ");
                    txtTest2.setText("B) география ");
                    txtTest3.setText("C) геоморфология ");
                    txtTest4.setText("D) геология ");
                    txtTest5.setText("E) барлығы ");
                    testNumber.setText("3/10");
                }
                else if(count==3){
                    question.setText("Литосфера бөліктері");
                    txtTest1.setText("A) жер қыртысы, мантияның беткі бөлігі ");
                    txtTest2.setText("B) ядро, гранит, базальт  ");
                    txtTest3.setText("C) мантия, магма, ядро ");
                    txtTest4.setText("D) саз, әктас, гранит  ");
                    txtTest5.setText("E) ядро базальт");
                    testNumber.setText("4/10");
                }
                else if(count==4){
                    question.setText("Үгілу дегеніміз");
                    txtTest1.setText("A) тау жыныстарының күйреуі ");
                    txtTest2.setText("B) циклонның әсері ");
                    txtTest3.setText("C) жел жынысы  ");
                    txtTest4.setText("D) жыныстардың жиналуы барысында отыруы  ");
                    txtTest5.setText("E) қатты жыныстарды жер арқылы ауыстыру");
                    testNumber.setText("5/10");
                }
                else if(count==5){
                    question.setText("Эндогендік процестер бұл ...");
                    txtTest1.setText("A) жел  ");
                    txtTest2.setText("B) өсімдік  ");
                    txtTest3.setText("C) су ");
                    txtTest4.setText("D) жел сілкінісі  ");
                    txtTest5.setText("E) ауа");
                    testNumber.setText("6/10");
                }
                else if(count==6){
                    question.setText("Литосфералық тақталардың қозғалысы жылдамдығы жылына ....");
                    txtTest1.setText("A) 2 см-ден 5 см-ге дейін ");
                    txtTest2.setText("B) 8 см-ден 5см-ге дейін  ");
                    txtTest3.setText("C) 1 см-ден 1 см-ге дейін ");
                    txtTest4.setText("D) 7 см-ден 15 см-ге дейін ");
                    txtTest5.setText("E) 10 см-ден 16 см-ге дейін");
                    testNumber.setText("7/10");
                }
                else if(count==7){
                    question.setText("Жер қыртысының ежелгі, біршама, тұрақты әр тегіс учаскесі");
                    txtTest1.setText("A) плита  ");
                    txtTest2.setText("B) рифт  ");
                    txtTest3.setText("C) платформа  ");
                    txtTest4.setText("D) континент  ");
                    txtTest5.setText("E) құрлық  ");
                    testNumber.setText("8/10");
                }
                else if(count==8){
                    question.setText("Жер бедерінің қалыптастыратын жағдайлар ");
                    txtTest1.setText("A) мұхиттардың жақындығы ");
                    txtTest2.setText("B) атмосфера циркуляциясы ");
                    txtTest3.setText("C) жердің өз осьнен қозғалуы ");
                    txtTest4.setText("D) ішкі және сыртқы күштер ");
                    txtTest5.setText("Е) жердің орбиталық қозғалысы");
                    testNumber.setText("9/10");
                }
                else if(count==9){
                    question.setText("Жартылай немесе толығымен жарамсыз жерлер");
                    txtTest1.setText("A) карьер ");
                    txtTest2.setText("B) сай ");
                    txtTest3.setText("C) бедленд ");
                    txtTest4.setText("D) бос жерлер ");
                    txtTest5.setText("E) батпақ ");
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
                    String name = "Лекция 9";
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
