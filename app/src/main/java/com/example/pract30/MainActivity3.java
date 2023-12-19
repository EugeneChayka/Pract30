package com.example.pract30;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void onClickStart(View v) {
        startService(new Intent(this,MyService3.class).putExtra("name", "value"));
    }
    public void onClickNext(View v) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}
