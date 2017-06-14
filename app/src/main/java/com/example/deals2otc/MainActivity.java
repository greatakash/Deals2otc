package com.example.deals2otc;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    customSwip  customSwip;
    private Context mContext;
    private MainActivity mActivity;
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private Random mRandom = new Random();
    private ItemRecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=(ViewPager)findViewById(R.id.viewPager);
        customSwip=new customSwip(this);
        viewPager.setAdapter(customSwip);

        mContext = getApplicationContext();
        mActivity = MainActivity.this;

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mLayoutManager = new LinearLayoutManager(
                mContext,
                LinearLayoutManager.HORIZONTAL,
                false
        );
        mRecyclerView.setLayoutManager(mLayoutManager);

        List<String> Items = new ArrayList<>();
        for (int i=0;i<20;i++){
            Items.add("");
        }
        mAdapter = new ItemRecyclerAdapter(mContext,Items);
        mRecyclerView.setAdapter(mAdapter);
    }
}
