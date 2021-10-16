package com.example.dell.myapplication;

import android.media.Image;
import android.media.MediaPlayer;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class targetpoem extends AppCompatActivity {
    boolean isPlaying;
    MediaPlayer sing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.target_poem);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView imageView = (ImageView)findViewById(R.id.imageviewer);
        imageView.setImageResource(R.drawable.poem1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        isPlaying = false;
        final ImageButton btnGo = (ImageButton) findViewById(R.id.voice);
        sing= MediaPlayer.create(this,R.raw.kyar);
        btnGo.setOnClickListener( new View.OnClickListener(){
            public void onClick(View view)
            {
                if(isPlaying){sing.pause();
                    btnGo.setImageResource(R.drawable.play);}
                else {sing.start(); btnGo.setImageResource(R.drawable.pause);}

                isPlaying = !isPlaying;

            }
        });
        ImageButton stop = (ImageButton) findViewById(R.id.restart);
        stop.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                if(sing.isPlaying() || sing.getCurrentPosition() != 0) {
                    sing.seekTo(0);
                    sing.start();
                    isPlaying = true;
                    btnGo.setImageResource(R.drawable.pause);
                }
            }
        });

        sing.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                btnGo.setImageResource(R.drawable.dialogvoice);
                isPlaying=false;
            }
        });
    }
    protected void onPause(){
        super.onPause();
        if(isFinishing()){
            sing.release();
            sing=null;
        }
        else{ sing.stop();}

    }
}
