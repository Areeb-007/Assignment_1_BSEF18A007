package com.example.assignmet_1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

public class Nasheeds extends AppCompatActivity {
    private Button audioOnePlay;
    private Button audioTwoPlay;
    private Button audioThreePlay;
    private Button audioFourPlay;

    private Button audioOnePause;
    private Button audioTwoPause;
    private Button audioThreePause;
    private Button audioFourPause;

    private Button audioOneStop;
    private Button audioTwoStop;
    private Button audioThreeStop;
    private Button audioFourStop;

    MediaPlayer mp1;
    MediaPlayer mp2;
    MediaPlayer mp3;
    MediaPlayer mp4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasheeds);


    }
}