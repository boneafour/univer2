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
import android.widget.Toast;

import java.util.List;

/**
 * Created by user on 14.06.2016.
 */
public class GalleryActivity extends Activity implements View.OnClickListener{

    private TextView txtTitle;
    private ImageButton btnBack;
    private Button btnSave;

    EditText etName,  etCommentSubject;
    String stFullName, stCommentSubject;

    Integer[] imageIDs = {
            R.drawable.lecture,
            R.drawable.lecture,
            R.drawable.lecture,
            R.drawable.lecture,
            R.drawable.lecture,
            R.drawable.lecture,
            R.drawable.lecture
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText(getString(R.string.gallery));

        btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);


        android.widget.Gallery gallery = (android.widget.Gallery) findViewById(R.id.gallery1);
        gallery.setAdapter(new ImageAdapter(this));
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position,long id)
            {
               // Toast.makeText(getBaseContext(), "pic" + (position + 1) + " selected",
                //        Toast.LENGTH_SHORT).show();
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
            imageView.setLayoutParams(new Gallery.LayoutParams(100, 100));
            imageView.setBackgroundResource(itemBackground);
            return imageView;
        }
    }
}
