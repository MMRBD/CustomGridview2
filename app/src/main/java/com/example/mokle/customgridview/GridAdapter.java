package com.example.mokle.customgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by mokle on 4/22/2017.
 */

public class GridAdapter extends BaseAdapter {

    private Context context;
    private String[] letterList;
    private int[] images;
    private LayoutInflater inflater;

    public GridAdapter(Context context, String[] letterList, int[] images) {
        this.context = context;
        this.letterList = letterList;
        this.images = images;
    }

    @Override
    public int getCount() {
        return letterList.length;
    }

    @Override
    public Object getItem(int position) {
        return letterList[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View gridView = convertView;

        if (convertView == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.custom_layout, null);
        }

        ImageView imageView = (ImageView) gridView.findViewById(R.id.letterImageView);
        TextView textView = (TextView) gridView.findViewById(R.id.letterTextView);

        imageView.setImageResource(images[position]);
        textView.setText(letterList[position]);

        return gridView;
    }
}
