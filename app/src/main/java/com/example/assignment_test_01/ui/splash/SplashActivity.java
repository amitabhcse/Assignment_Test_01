package com.example.assignment_test_01.ui.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;

import com.example.assignment_test_01.R;
import com.example.assignment_test_01.ui.product.ProductActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        CountDownTimer timer = new CountDownTimer(5000,500) {
            @Override
            public void onTick(long l) {

                Log.d("checktrick", "Tricked");
            }

            @Override
            public void onFinish() {

                Intent intent =new Intent(SplashActivity.this, ProductActivity.class);
                startActivity(intent);
                finish();
            }
        };
        timer.start();
    }
}
