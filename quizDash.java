package com.example.educationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class quizDash extends AppCompatActivity {
    private String selectedTopicName="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_dash);
        final LinearLayout cpp=findViewById(R.id.cppLayout);
        final LinearLayout php=findViewById(R.id.phpLayout);
        final LinearLayout java=findViewById(R.id.javaLayout);
        final LinearLayout python=findViewById(R.id.pythonLayout);

        final Button startBtn=findViewById(R.id.startQuizBtn);


        cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="cpp";

                cpp.setBackgroundResource(R.drawable.round_back_white_stroke10);
                php.setBackgroundResource(R.drawable.round_back_white10);
                java.setBackgroundResource(R.drawable.round_back_white10);
                python.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="php";

                php.setBackgroundResource(R.drawable.round_back_white_stroke10);
                cpp.setBackgroundResource(R.drawable.round_back_white10);
                java.setBackgroundResource(R.drawable.round_back_white10);
                python.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="java";

                java.setBackgroundResource(R.drawable.round_back_white_stroke10);
                php.setBackgroundResource(R.drawable.round_back_white10);
                cpp.setBackgroundResource(R.drawable.round_back_white10);
                python.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="python";

                python.setBackgroundResource(R.drawable.round_back_white_stroke10);
                php.setBackgroundResource(R.drawable.round_back_white10);
                java.setBackgroundResource(R.drawable.round_back_white10);
                cpp.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(quizDash.this,"Please Select the Topic",Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent=new Intent(quizDash.this,QuizActivity.class);
                    intent.putExtra("Selected Topic",selectedTopicName);
                    startActivity(intent);
                }
            }
        });





    }
}