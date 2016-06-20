package com.example.user.univer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private String[] main = { "Лекция","Отчет","Предподаватель","Студент", "Предмет" };
    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        View grid;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            grid = new View(mContext);
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            grid = inflater.inflate(R.layout.cellgrid, parent, false);
        } else {
            grid = (View) convertView;
        }
         imageView = (ImageView) grid.findViewById(R.id.cell_image);
        TextView textView = (TextView) grid.findViewById(R.id.cell_text);
        imageView.setImageResource(mThumbIds[position]);
        textView.setText(main[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(18, 18, 18, 18);
        textView.setPadding(18, 18, 18, 18);

        return grid;

    }
    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.lecture, R.drawable.otchet, R.drawable.teacher2, R.drawable.student2, R.drawable.subject1,

    };
}