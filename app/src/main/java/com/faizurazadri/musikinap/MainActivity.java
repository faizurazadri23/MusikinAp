package com.faizurazadri.musikinap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.faizurazadri.musikinap.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        if(getSupportActionBar()!=null){
            getSupportActionBar().setElevation(0);
        }


        SectionpagerAdapter sectionpagerAdapter = new SectionpagerAdapter(this, getSupportFragmentManager());
        mainBinding.viewPagerAudiovideo.setAdapter(sectionpagerAdapter);
        mainBinding.tabAudioVideo.setupWithViewPager(mainBinding.viewPagerAudiovideo);
    }
}