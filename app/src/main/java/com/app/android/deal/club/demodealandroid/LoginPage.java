package com.app.android.deal.club.demodealandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }

    public void onClickRegister(View v)
    {
        Intent in = new Intent(LoginPage.this,RegisterPage.class);
        startActivity(in);
        finish();
    }
    public void onClickLogin(View v)
    {
        Intent in = new Intent(LoginPage.this,MainActivity.class);
        startActivity(in);
        finish();
    }
}
