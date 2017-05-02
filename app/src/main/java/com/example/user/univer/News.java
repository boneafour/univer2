package com.example.user.univer;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 14.06.2016.
 */
public class News extends Activity implements View.OnClickListener{

    private TextView txtTitle;
    private ImageButton btnBack;
    ListView lv;
    TextView tvName1, tvNew1;
    String name1 = "Лондондағы әйгілі Корольдік географиялық қоғамында Ұлы Жібек жолына арналған көрме ұйымдастырылды";
    String new1 = "Шара барысында тарихта айрықша орны бар, керуен жүріп өткен елдер туралы айтылды. Магнус Барлет – танымал британиялық баспагер. Ол кітап шығарумен қатар географиялық карталар басумен де айнылысады. Барлет Қазақстанда бірнеше рет болып, кең байтақ даламыздың кеңдігіне тәнті болғанын айтады. Үш рет үш түрлі тапсырыс берушіге республиканың картасын басып шығарып берген екен. Магнус Барлет, баспагер: - Қазақстанның жер көлемі бүкіл Еуропамен пара-пар екендігі мен үшін жаңалық болды. Пайымдауымша, көпшілікке бұл беймәлім дүние. Сондай-ақ маңызды мәселелердің бірі – Қазақстан халқына білікті басшы бұйырды. Корольдік географиялық қоғамы – 180 жылдан астам уақыт бұрын құрылған ғылыми ұйым. Ол Корольдік деген атақ пен ерекше құқықты 1859 жылы Виктория ханшайымнан қабылдаған. Ұйымның мақсаты – география ғылымын дамыту. Қазір ол географиялық зерттеулер саласында бүкіләлемдік көшбасшы орталық саналады. Басым бағыттарының қатарында білім беру, зерттеулер және ғылыми экспедициялар жүргізу бар. Көрме ұйымдастырушылары Ұлы Жібек жолы өткен елдердің қазіргі жағдайы туралы мағлұмат беруді мақсат еткенін айтады. Весна Петкович, ұйымдастырушы: - Шыны керек, Еуропада Орталық Азияның қазіргі мүмкіндіктері туралы аз-кем білетіні мені таң қалдырды. Түрлі салалар бойынша дамыған және гүлденген мемлекеттер туралы еуропалықтардың мағлұматы аз. Мен, мысалы, Қазақстанның тек табиғи ғана емес, адами ресурстарға да бай екендігін білемін. Сіздерде білім мен ғылым жақсы дамыған. Сіздер ұлттық мұраға байсыздар. Көбіне мемлекетін салт-дәстүрлері арқылы таниды. Бұл күні көрмеге қатысушылар Қазақстан жайлы біраз мәселеге қанықты. Әсіресе, оларды келер жылы Астанада өтетін халықаралық ЕХРО көрмесі қызықтырды. Еуропалықтар үшін Ұлы Жібек жолы беймәлім тақырыптардың санатынан екені айдан анық. Еуропалықтардың көпшілігі аты аңызға айналған керуен жолын өз көзімен көргісі келеді. Көрмеден кейін британиялықтар бітімі бөлек, табиғи және географиялық ерекшеліктерден кенде емес Қазақстанға бару туралы ойлайтындықтарын жасырмады. Авторы: Ғалымжан Қараманұлы\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText("Новости");

        tvName1 = (TextView)findViewById(R.id.name1);
        tvName1.setText(name1);
        tvNew1 = (TextView)findViewById(R.id.new1);
        tvNew1.setText(new1);


        btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnBack:
                NavUtils.navigateUpFromSameTask(this);
            break;
    }

    }
}
