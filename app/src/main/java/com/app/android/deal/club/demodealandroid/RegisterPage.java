package com.app.android.deal.club.demodealandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);


    }
    public void onClickBack(View v)
    {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        Intent in = new Intent(RegisterPage.this,LoginPage.class);
        startActivity(in);
        finish();
    }
}
