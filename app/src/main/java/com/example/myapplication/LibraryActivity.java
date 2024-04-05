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

    public void playSong(int songID) {
        if(playing) {
            mysound.pause();
        }
        playing = true;
        mysound = MediaPlayer.create(LibraryActivity.this, songID);
        mysound.start();
    }


    public void missingSong(View v)
    {
        playSong(R.raw.missing);
    }

    public void prettySong(View v)
    {
        playSong(R.raw.songpretty);
    }
    public void tzlalimSong(View v)
    {
        playSong(R.raw.tzlalim);
    }
    public void playOrPause(View view)
    {
        if (playing == true)
        {
            mysound.pause();
            playing = false;
        }
        else
        {
            mysound.start();
            playing = true;
        }
    }
}