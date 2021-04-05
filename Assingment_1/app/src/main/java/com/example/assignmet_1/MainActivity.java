package com.example.assignmet_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //Animation
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        //Hooks from main Activity
        imageView = findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView2);
        imageView.animate().yBy(400).alpha(1).alphaBy(0.1f).setDuration(2000);
        imageView2.setAnimation(animation);

        // Delay for the screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,UserPage.class);
                startActivity(intent);
                finish();
            }
        },4000);
    }
}