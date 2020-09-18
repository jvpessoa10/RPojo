package com.jvp.rpojoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jvp.rpojo.annotation.Origin;

@Origin
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
