package com.app.android.deal.club.demodealandroid;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List< flowerData > mFlowerList;
    flowerData mFlowerData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
        mRecyclerView.setLayoutManager(mGridLayoutManager);

        mFlowerList = new ArrayList<>();
        mFlowerData = new flowerData("Honda", getString(R.string.description_flower_rose),
                R.drawable.grid_img1);
        mFlowerList.add(mFlowerData);
        mFlowerData = new flowerData("Carnation", getString(R.string.description_flower_rose),
                R.drawable.grid_img2);
        mFlowerList.add(mFlowerData);
        mFlowerData = new flowerData("Tvs", getString(R.string.description_flower_rose),
                R.drawable.grid_img3);
        mFlowerList.add(mFlowerData);
        mFlowerData = new flowerData("Yamaha", getString(R.string.description_flower_rose),
                R.drawable.grid_img1);
        mFlowerList.add(mFlowerData);
        mFlowerData = new flowerData("Tvs", getString(R.string.description_flower_rose),
                R.drawable.grid_img2);
        mFlowerList.add(mFlowerData);
        mFlowerData = new flowerData("Tvs", getString(R.string.description_flower_rose),
                R.drawable.grid_img1);
        mFlowerList.add(mFlowerData);
        mFlowerData = new flowerData("Honda ", getString(R.string.description_flower_rose),
                R.drawable.grid_img1);
        mFlowerList.add(mFlowerData);
        mFlowerData = new flowerData("Yamaha", getString(R.string.description_flower_rose),
                R.drawable.grid_img2);
        mFlowerList.add(mFlowerData);
        mFlowerData = new flowerData("Tvs", getString(R.string.description_flower_rose),
                R.drawable.grid_img1);
        mFlowerList.add(mFlowerData);
        mFlowerData = new flowerData("Yamaha", getString(R.string.description_flower_rose),
                R.drawable.grid_img2);
        mFlowerList.add(mFlowerData);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, mFlowerList);
        mRecyclerView.setAdapter(myAdapter);


    }
}
