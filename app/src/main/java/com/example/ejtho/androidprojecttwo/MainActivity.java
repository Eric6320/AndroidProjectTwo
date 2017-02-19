package com.example.ejtho.androidprojecttwo;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;

public class MainActivity extends AppCompatActivity {

    private int screenheight;
    private int screenwidth;

    private SharedPreferences.OnSharedPreferenceChangeListener myListener;
    private SharedPreferences myPreferences;

    //TODO Figure out all this permissions nonsense



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics metrics = this.getResources().getDisplayMetrics();
        screenheight = metrics.heightPixels;
        screenwidth = metrics.widthPixels;


    }
}
