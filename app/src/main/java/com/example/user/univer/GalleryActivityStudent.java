package com.example.user.univer;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Gallery;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 14.06.2016.
 */
public class GalleryActivityStudent extends Activity implements View.OnClickListener{

    private TextView txtTitle;
    private ImageButton btnBack;
    private Button btnSave;

    EditText etName,  etCommentSubject;
    String stFullName, stCommentSubject;

    TextView name;
    Integer[] imageIDs = {
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7,
            R.drawable.picfornews1,
            R.drawable.picfornews2
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText(getString(R.string.gallery));

        name = (TextView) findViewById(R.id.name);
        btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);


        Gallery gallery = (Gallery) findViewById(R.id.gallery1);
        gallery.setAdapter(new ImageAdapter(this));
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position,long id)
            {
                if(position==0){
                    name.setText("Международный IT Университет");
                }
                else if(position==1){
                    name.setText("проект «3D Принтер»");
                }
                else if(position==2){
                    name.setText("На встрече с компаниями KCELL, Нурсат, Казтелерадио, ТрансТелеком");
                }
                else if(position==3){
                    name.setText("Студенты МУИТ — чемпионы Казахстана по программированию");
                }
                else if(position==4){
                    name.setText("Лига IT Университета");
                }
                else if(position==5){
                    name.setText("Карим Ринат вместе «Вычислительная Техника и Программное обеспечение»");
                }
                else if(position==6){
                    name.setText("Представители компании «Huawei Kazakhstan» посетили Международный IT Университет.");
                }
                else if(position==7){
                    name.setText("Встреча с казахстанским космонавтом Айдыном Аимбетовым");
                }
                else if(position==8){
                    name.setText("Ярмарка вакансий");
                }
                // display the images selected
                ImageView imageView = (ImageView) findViewById(R.id.image1);
                imageView.setImageResource(imageIDs[position]);
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnBack:
                NavUtils.navigateUpFromSameTask(this);
            break;

            case R.id.btnSave:
                stFullName = "" + etName.getText();
                etName.setText("");
                stCommentSubject = "" + etCommentSubject.getText();
                etCommentSubject.setText("");
                System.out.println(stFullName);
                System.out.println(stCommentSubject);

            DatabaseHandler db = new DatabaseHandler(this);
            db.addSubject(new SubjectData(stFullName, stCommentSubject));
            List<SubjectData> subjects = db.getAllSubjects();
            for (SubjectData cn : subjects) {
                String log = "Id: " + cn.getSubjectID() + " ,Names: " + cn.getSubjectName() + " ,Comment: " + cn.getSubjectComment();
                Log.d("Name: ", log);
            }
            break;
    }

    }

    public class ImageAdapter extends BaseAdapter {
        private Context context;
        private int itemBackground;
        public ImageAdapter(Context c)
        {
            context = c;
            // sets a grey background; wraps around the images
            TypedArray a =obtainStyledAttributes(R.styleable.MyGallery);
            itemBackground = a.getResourceId(R.styleable.MyGallery_android_galleryItemBackground, 0);
            a.recycle();
        }
        // returns the number of images
        public int getCount() {
            return imageIDs.length;
        }
        // returns the ID of an item
        public Object getItem(int position) {
            return position;
        }
        // returns the ID of an item
        public long getItemId(int position) {
            return position;
        }
        // returns an ImageView view
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(imageIDs[position]);
            imageView.setLayoutParams(new Gallery.LayoutParams(160, 160));
            imageView.setBackgroundResource(itemBackground);
            return imageView;
        }
    }
}
