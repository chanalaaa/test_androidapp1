package com.example.chanalaaa.app01;

import android.content.Context;


/**
 * Created by Chanalaaa on 22/12/2015.
 */
public class MyAdapter {

    private Context objContext;
    private int[] trafficInts;
    private String[] trafficString;


    public MyAdapter(Context objContext, int[] trafficInts, String[] trafficString) {
        this.objContext = objContext;
        this.trafficInts = trafficInts;
        this.trafficString = trafficString;
        //Constructor
    }

    
}
