package com.example.chanalaaa.app01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Chanalaaa on 22/12/2015.
 */
public class MyAdapter extends BaseAdapter {

    private Context objContext;
    private int[] trafficInts;
    private String[] trafficString;


    public MyAdapter(Context objContext, int[] trafficInts, String[] trafficString) {
        this.objContext = objContext;
        this.trafficInts = trafficInts;
        this.trafficString = trafficString;
        //Constructor
    }


    @Override
    public int getCount() {
        return trafficString.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //Open Service
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = objLayoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //Show icon
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imgShowIcon);
        iconImageView.setBackgroundResource(trafficInts[i]);

        //Show Title
        TextView titleTextView = (TextView) view1.findViewById(R.id.txtShowTitle);
        titleTextView.setText(trafficString[i]);

        return view1;
    }// getView
}
