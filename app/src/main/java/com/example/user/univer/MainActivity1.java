package com.example.user.univer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity1 extends Activity {

    private TextView txtTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText(getString(R.string.main));

        GridView gridview = (GridView) findViewById(R.id.grid);
        gridview.setAdapter(new ImageAdapter(this));
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

              if(position==0){
                    startActivity(new Intent(MainActivity1.this, LectureStudent.class));
                    }
                else if (position==1){
                    startActivity(new Intent(MainActivity1.this, Report.class));
                }
                else if(position==2){
                    startActivity(new Intent(MainActivity1.this, MarkForStudent.class));
                }
                else if(position==3){
                //    startActivity(new Intent(MainActivity1.this, Teacher.class));
                }
                else if (position==4){
                    startActivity(new Intent(MainActivity1.this, Student.class));
                }

                else if(position==5){
                    startActivity(new Intent(MainActivity1.this, NewsStudent.class));
                }
                else if(position==6){
                    startActivity(new Intent(MainActivity1.this, GalleryActivityStudent.class));
                }
                else if(position==7){
                    startActivity(new Intent(MainActivity1.this, AboutUsStudent.class));
                }
              }

            });


        }
    }

