package com.example.user.univer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class ReportListAdapterStudent extends BaseAdapter implements View.OnClickListener
{
    Activity context;
    ArrayList<String> arName;
    ArrayList<String> arTeacher;
    ArrayList<String> arStudent;
    ArrayList<String> arSubject;
    ArrayList<String> arTopic;
    ArrayList<String> arDate;
    ArrayList<String> arTime;
    ArrayList<String> arCommentStudent;
    ArrayList<String> arCommentTeacher;
    ArrayList<String> arCheck;
    ArrayList<String> arLecture;


    public ReportListAdapterStudent(Activity context, ArrayList<String> arName, ArrayList<String> arTeacher, ArrayList<String> arStudent, ArrayList<String> arSubject, ArrayList<String> arTopic, ArrayList<String> arDate, ArrayList<String> arTime, ArrayList<String> arCommentStudent, ArrayList<String> arCommentTeacher, ArrayList<String> arCheck, ArrayList<String> arLecture) {
        super();
        this.context = context;
        this.arName = arName;
        this.arTeacher = arTeacher;
        this.arStudent = arStudent;
        this.arSubject = arSubject;
        this.arTopic = arTopic;
        this.arDate = arDate;
        this.arTime = arTime;
        this.arCommentStudent = arCommentStudent;
        this.arCommentTeacher = arCommentTeacher;
        this.arCheck = arCheck;
        this.arLecture = arLecture;
    }

    public int getCount() {
        // TODO Auto-generated method stub
        return arName.size();
    }

    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void onClick(View v) {

    }

    private class ViewHolder {
        TextView tvTopic, Lecture;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        // TODO Auto-generated method stub
        ViewHolder holder;
        LayoutInflater inflater =  context.getLayoutInflater();

        if (convertView == null)
        {
            convertView = inflater.inflate(R.layout.activity_table_list1, null);
            holder = new ViewHolder();
            holder.tvTopic = (TextView) convertView.findViewById(R.id.topicName);
            holder.Lecture = (TextView) convertView.findViewById(R.id.Lecture);
            convertView.setTag(holder);
        }
        else
        {

            holder = (ViewHolder) convertView.getTag();
        }

        holder.tvTopic.setText("Тема: "+arTopic.get(position));
        holder.Lecture.setText("Лекция: "+arLecture.get(position));

        return convertView;
    }

}