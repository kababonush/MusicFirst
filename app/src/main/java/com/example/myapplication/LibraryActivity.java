package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class LibraryActivity extends AppCompatActivity {

    boolean playing = false;
    MediaPlayer mysound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
    }
    public void onClickToHome(View view) {

        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void missingSong(View v){
        mysound = MediaPlayer.create(LibraryActivity.this,R.raw.missing);
        mysound.start();
        playing = true;
    }
    public void prettySong(View v){
        mysound = MediaPlayer.create(LibraryActivity.this,R.raw.songpretty);
        mysound.start();
        playing = true;
    }
    public void tzlalimSong(View v){
        mysound = MediaPlayer.create(LibraryActivity.this,R.raw.tzlalim);
        mysound.start();
        playing = true;
    }
    public void playOrPause(View view){
        if (playing){
            mysound.pause();
            playing = false;
        }
        if(!playing){
            mysound.start();
            playing = true;
        }
    }
}