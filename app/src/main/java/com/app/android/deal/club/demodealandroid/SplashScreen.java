package com.app.android.deal.club.demodealandroid;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler hd = new Handler();

        hd.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in  = new Intent(SplashScreen.this, LoginPage.class);
                startActivity(in);
                finish();
            }
        },3000);
    }
}
