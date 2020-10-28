package com.example.w07_teamactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nothing(){
        System.out.println("This is a test");
        System.out.println("New test!");
        System.out.println("first team conflict. ");
        System.out.println("Conflict by Rufino");
    }
}