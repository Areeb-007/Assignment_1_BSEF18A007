package com.example.assignmet_1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Quran extends AppCompatActivity {
    private TextView textView6;
    private static Boolean toggle=false;
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran);
        textView6=findViewById(R.id.textView6);
        mp=MediaPlayer.create(this,R.raw.audio5);
    }

    public void PlayAudio(View view) {

        if(toggle==false)
        {
            mp.start();
            toggle=true;
        }
        else
        {
            mp.pause();
            toggle=false;
        }


    }
}