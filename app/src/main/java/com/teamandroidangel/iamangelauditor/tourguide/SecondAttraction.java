package com.teamandroidangel.iamangelauditor.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by iamangelauditor on 09/12/2017.
 */

public class SecondAttraction extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_activity);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new SecondAttractionFragment())
                .commit();
    }
}
