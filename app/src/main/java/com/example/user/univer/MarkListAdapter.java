package com.example.user.univer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MarkListAdapter extends BaseAdapter implements View.OnClickListener
{
    Activity context;
    ArrayList<String> arName;
    ArrayList<String> arStudent;
    ArrayList<String> arMark;


    public MarkListAdapter(Activity context,  ArrayList<String> arName,  ArrayList<String> arStudent, ArrayList<String> arMark) {
        super();
        this.context = context;
        this.arName = arName;
        this.arStudent = arStudent;
        this.arMark = arMark;
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
        TextView tvName, tvNameStudent,  tvMark;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        // TODO Auto-generated method stub
        ViewHolder holder;
        LayoutInflater inflater =  context.getLayoutInflater();

        if (convertView == null)
        {
            convertView = inflater.inflate(R.layout.activity_mark_list, null);
            holder = new ViewHolder();
            holder.tvName = (TextView) convertView.findViewById(R.id.studentName);
            holder.tvNameStudent = (TextView) convertView.findViewById(R.id.nameStudent);
            holder.tvMark = (TextView) convertView.findViewById(R.id.mark);
            convertView.setTag(holder);
        }
        else
        {

            holder = (ViewHolder) convertView.getTag();
        }

        holder.tvName.setText("Лекция: "+arName.get(position));
        holder.tvNameStudent.setText("Оқушы: "+arStudent.get(position));
        holder.tvMark.setText("Баға: "+arMark.get(position));

        return convertView;
    }

}