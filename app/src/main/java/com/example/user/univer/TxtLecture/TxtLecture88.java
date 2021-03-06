package com.example.user.univer.TxtLecture;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.user.univer.R;

/**
 * Created by user on 14.06.2016.
 */
public class TxtLecture88 extends Activity implements View.OnClickListener {

    private TextView txtTitle, textView;
    private ImageButton btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_txt_lecture);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText("ТМД елдеріне жалпы шолу");

        textView = (TextView) findViewById(R.id.textView);
        textView.setText("ТМД – Тәуелсіз Мемлекеттер Достастығы 1991 жылы құрылды. ТМД-ға 12 ел мүше болып қабылданған. 1996 жылы 1 сәуірде Шанхай ынтымақтастық ұйымы құрылды. ШЫҰ-ға Қазақстан, Қытай, Қырғызстан, Тәжікстан, Ресей елдері мүше болып қабылданды. Жер шарындағы ауданы жөнінен ең ірі мемлекет – Ресейдің жер көлемі 17 млн шаршы шақырымды құрайды. Ресей Еуразияның солтүстік шығысында орналасқан. Ресейдегі мұнай мен газдың негізгі кен орындары Батыс Сібір экономикалық ауданында шоғырланған. Батыс Сібір экономикалық ауданы мұнай мен газдың 90 -ға жуығын береді. Ресей жер шарындағы пайдалы қазбаларға бай мемлекеттердің бірі. Ресейдегі минералды ресурстардың 70 пайызын көмір, мұнай газ сияқты отын энергетикалық ресурстар құрайды. Ресей металл өндіруден дүниежүзінде Жапония, Қытай, АҚШ-тан кейінгі төртінші орынды алады. Ресейдегі ең ірі темір кен орны еуропалық бөліктегі Курск магнит аномалиясы болып саналады. Ресей – жер шарындағы газдың барланған қоры жөнінен бірінші орын алатын мемлекет. Ресейде әлемдегі газ қорының 13 шоғырланған. Ресейде машина жасау салалары ішінде ауылшаруашылығына, жеңіл және тамақ өнеркәсібіне қажетті құрал-жабдықтар жасау дамыған. Астық жинайтын комбайндар Солтүстік Кавказ ауданында құрастырылады. Жеңіл автокөлік жасау саласы шетелдік өнімдермен бәсекеге түсе алмайды. Ресейдегі жалғыз троллейбус зауыты Энгельс қаласында орналасқан. Ресейдің сыртқы сауда байланыстарын жүзеге асыруда теңіз көлігі маңызды орын алады. Ресейде теңіз баланыстарын орнатуға мүмкіндік беретін 11 теңіз порты жұмыс істейді. Ресейдегі мал шаруашылығының жетекші салалары: ірі қара, шошқа, қой шаруашылықтары. Ал кейбір аймақтарда құс шаруашылығы, омарта шаруашылығы, бағалы аңдар терісін өндіру дамыған. Ал Қиыр Шығыстағы халықтар ежелден келе жатқан атакәсіптері – бұғы шаруашылығымен айналысады. Беларусь өнеркәсібі машина жасау, химия өнеркәсібі және мұнай химиясына маманданған. Ресей жерінен басталып, Еуропаны газбен қамтамасыз ететін \"Достық\" мұнай құбыры Беларусь жері арқылы өтеді. Бұл құбыр республиканы газбен қамтамасыз етеді. Беларусь Республикасының машина жасау өнеркәсібінде автомобиль өндірісі жетекші орынды алады. Мұнда тау кен өнеркәсібіне қажетті \"БелАЗ\" машиналарын, автомобильдер жасайды. Беларусь Республикасындағы Минск трактор зауыты ауылшаруашылық машиналары мен трактор жасауға маманданса, химия өндірісі жасанды талшық өндіруден ТМД-да алдыңғы орынды алады. Беларусь Республикасында техникалық дақылдардан ең көп өсірілетіні зығыр. Зығыр көбінесе елдің солтүстік батысында өсіріледі. Ураина өнеркәсібінің жетекші саласы отын-энергетика кешені. Отын энергетика кешенінің елдегі өнеркәсіп өндірісіндегі үлесі 14 құрайды. Украинадағы ең ірі көмір алабы – Донецк көмір алабы. Мұнда жоғары сапалы кокстелетін көмір өндіріледі. Украинадағы ең ірі темір кен орны – Кривой рог. Кривой рог темір кенін өндіретін алабы үлкендігі жөнінен Ресейдегі Курск магнит аномалиясынан кейінгі екінші орынды алады. Сондықтан Украинадағы негізгі қара металлургия орталықтары Кривой рог, Запорожье, Донецк, Днепропетровск болып саналады. Украина машина жасауға маманданған. Украинада жеңіл автокөлік, теміржол, ауыр машиналар жасау, кеме жасау дамыған. Елдегі Керчь, Николаев, Херсон қалаларында кеме жасалады. Украинадағы ең ірі өзен – Днепр өзені. Бұл өзеннің Украинадағы ұзындығы 981 шақырымды құрайды. Украинадағы өзендердің көпшілігі Қара теңіз бен Азов теңізі алаптарына жатады. Молдова ТМД құрамындағы шағын елдердің бірі. Астанасы – Кишинев қаласы. Молдова Прут пен Днестр өзендерінің аралығында орналасқан. Молдованың солтүстігінде қант қызылшасы өсіріледі. Қант қызылшасы өсірілетін аудандарға жақын орналасқан Рыбницы, Бельцы қалаларында қант зауыттары орналасқан. Молдовадағы негізгі көлік түрлері автомобиль мен теміржол көлігі. Молдовадағы жүк тасымалында бұл көліктердің үлесі жоғары.");

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
