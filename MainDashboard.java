package com.example.educationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);
    }

    public void quiz(View view) {
        Intent i = new Intent(MainDashboard.this, quizDash.class);
        startActivity(i);
    }

    public void notes(View view){
        Intent i=new Intent(MainDashboard.this,video_ED.class);
        startActivity(i);
    }


    public void downnotes(View view) {
        Intent i=new Intent(MainDashboard.this,notesDash.class);
        startActivity(i);

    }
}