package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    MediaPlayer mysound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mysound=MediaPlayer.create(MainActivity.this,R.raw.songpretty);
    }
    public void playit(View v){
        mysound.start();
    }


}
