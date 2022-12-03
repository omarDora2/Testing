package com.api.testing.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import com.api.testing.MainActivity;
import com.api.testing.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //دا كود ال full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        //كود ال بيعرض الشاشة عدد ثواني معينه مع كود الانتقال من شاشة الي اخر

        new Handler().postDelayed(() -> {
            Intent intent=new Intent(SplashActivity.this, MainActivity.class);
             startActivity(intent);
                finish();
        },3000);
    }
}