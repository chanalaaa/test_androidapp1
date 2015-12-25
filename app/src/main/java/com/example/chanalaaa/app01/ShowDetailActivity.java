package com.example.chanalaaa.app01;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowDetailActivity extends AppCompatActivity {

    //Explicit
    private TextView showTitleTextView, showDetailTextView;
    private ImageView showTrafficImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);
        /*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */

        bindWidget();

        showWidget();
    }

    private void bindWidget(){

        showTitleTextView = (TextView) findViewById(R.id.txtTextTitle);
        showDetailTextView = (TextView) findViewById(R.id.txtDetail);
        showTrafficImageView = (ImageView) findViewById(R.id.imgTrafficDetail);
    } //bindWidget

    private void showWidget(){
        //Receive from Intent
        int  intClick = getIntent().getIntExtra("click",0);

        //Show Title
        MyData objMyData = new MyData();
        String[] strTitle = objMyData.title();
        showTitleTextView.setText(strTitle[intClick]);

        //Show imgTraffic
        int[] intDrawable = objMyData.icon();
        showTrafficImageView.setImageResource(intDrawable[intClick]);

    } //Show Widget
}

