package com.example.pract30;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;

import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
        ProgressBar bar;
        final String LOG_TAG = "myLogs";
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
        }
        public void onClickStart(View v) {

            startService(new Intent(this, MyService.class));
        }

        public void onClickStop(View v) {

            stopService(new Intent(this, MyService.class));
        }
        public void onClickNext(View v) {
                Intent intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
        }


}