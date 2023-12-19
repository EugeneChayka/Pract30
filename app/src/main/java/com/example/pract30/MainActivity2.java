package com.example.pract30;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void onClickStart(View v) {
        startService(new Intent(this, MyService2.class).putExtra("time", 7));
        startService(new Intent(this, MyService2.class).putExtra("time", 2));
        startService(new Intent(this, MyService2.class).putExtra("time", 4));
    }
    public void onClickNext(View v) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}
