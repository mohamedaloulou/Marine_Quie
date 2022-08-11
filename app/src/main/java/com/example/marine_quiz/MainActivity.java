package com.example.marine_quiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

public class MainActivity extends AppCompatActivity {



    public String selectedLevel ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LinearLayoutCompat easy = findViewById(R.id.easyLayout);
        final LinearLayoutCompat medium = findViewById(R.id.mediumLayout);
        final LinearLayoutCompat hard = findViewById(R.id.hardLayout);
        final Button startBtn = findViewById(R.id.startQuizBtn);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        selectedLevel = "level1";
                        easy.setBackgroundResource(R.drawable.round_back_white_stroke);
                        medium.setBackgroundResource(R.drawable.round_back_wrrite10);
                        hard.setBackgroundResource(R.drawable.round_back_wrrite10);



            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedLevel = "level2";
                medium.setBackgroundResource(R.drawable.round_back_white_stroke);
                easy.setBackgroundResource(R.drawable.round_back_wrrite10);
                hard.setBackgroundResource(R.drawable.round_back_wrrite10);


            }
        });
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedLevel="level3";
                hard.setBackgroundResource(R.drawable.round_back_white_stroke);
                easy.setBackgroundResource(R.drawable.round_back_wrrite10);
                medium.setBackgroundResource(R.drawable.round_back_wrrite10);


            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedLevel.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please select the level", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("Selected Level", selectedLevel);
                    intent.putExtra("Cat Level",selectedLevel);
                    intent.putExtra("Mins",selectedLevel);
                    startActivity(intent);
                }

            }
        });


    }

}