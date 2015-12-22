package com.example.chanalaaa.app01;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;


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
        return 0;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
