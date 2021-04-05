package com.example.assignmet_1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Nasheeds extends AppCompatActivity {
    private ImageButton audioOnePlay;
    private ImageButton audioTwoPlay;
    private ImageButton audioThreePlay;
    private ImageButton audioFourPlay;

    private ImageButton audioOnePause;
    private ImageButton audioTwoPause;
    private ImageButton audioThreePause;
    private ImageButton audioFourPause;

    private ImageButton audioOneStop;
    private ImageButton audioTwoStop;
    private ImageButton audioThreeStop;
    private ImageButton audioFourStop;

    MediaPlayer mp1;
    MediaPlayer mp2;
    MediaPlayer mp3;
    MediaPlayer mp4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasheeds);
    //Hooks for buttons
        audioOnePlay=findViewById(R.id.audioOnePlay);
        audioOnePause=findViewById(R.id.audioOnePause);
        audioOneStop=findViewById(R.id.audioOneStop);

        audioTwoPlay=findViewById(R.id.audioTwoPlay);
        audioTwoPause=findViewById(R.id.audioTwoPause);
        audioTwoStop=findViewById(R.id.audioTwoStop);

        audioThreePlay=findViewById(R.id.audioThreePlay);
        audioThreePause=findViewById(R.id.audioThreePause);
        audioThreeStop=findViewById(R.id.audioThreeStop);


        audioFourPlay=findViewById(R.id.audioFourPlay);
        audioFourPause=findViewById(R.id.audioFourPause);
        audioFourStop=findViewById(R.id.audioFourStop);

        // Hooks for mp3
        mp1=MediaPlayer.create(this,R.raw.audio1);
        mp2=MediaPlayer.create(this,R.raw.audio2);
        mp3=MediaPlayer.create(this,R.raw.audio3);
        mp4=MediaPlayer.create(this,R.raw.audio4);

        //onclick methods
        // Audio 1
        audioOnePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.start();
            }
        });
        audioOnePause.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.pause();
            }
        }));
        audioOneStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.stop();
            }
        });

        //Audio 2
        audioTwoPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
            }
        });
        audioTwoPause.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.pause();
            }
        }));
        audioTwoStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.stop();
            }
        });

        // Audio 3
        audioThreePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
            }
        });
        audioThreePause.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.pause();
            }
        }));
        audioThreeStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.stop();
            }
        });

        // Audio 4
        audioFourPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.start();
            }
        });
        audioFourPause.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.pause();
            }
        }));
        audioFourStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.stop();
            }
        });


    }
}