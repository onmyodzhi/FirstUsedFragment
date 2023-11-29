 package com.example.fragmentfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

 public class MainActivity extends AppCompatActivity {

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);


         TabLayout tabLayout = findViewById(R.id.tabLayout);
         TabItem tabChat = findViewById(R.id.tabChats);
         TabItem tabStatus = findViewById(R.id.tabStatus);
         TabItem tabCals = findViewById(R.id.tabCalls);

         ViewPager viewPager = findViewById(R.id.viewPager);

         MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
         viewPager.setAdapter(pagerAdapter);


         tabLayout.setupWithViewPager(viewPager);





     }
 }