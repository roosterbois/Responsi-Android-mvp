package com.responsi.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    MainPresenterImp mainPresenterImp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }
    private  void  init () {
        mainPresenterImp = new  MainPresenterImp ( mainView this);

        mainPresenterImp.callPeopleData ( result "10", nat "en");

    }
    @Override
    public void  setPeopleData (List<ResultData> resultData ) {
        log.i ( tag: "xxxx"), msg "set Data"+ resultData);
    }
}
