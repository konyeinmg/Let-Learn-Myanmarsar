package com.example.dell.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import java.util.Timer;
import java.util.TimerTask;

public class StoryFriend extends AppCompatActivity {
    private ImageSwitcher imageSwitcher;
    private Toolbar mtoolbar;
    int[] images = new int[8];int count = -1;
    MediaPlayer sing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_friend);

        mtoolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        prepareImage();
        imageSwitcher = (ImageSwitcher)findViewById(R.id.imageSwitcher1);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            public View makeView() {
                ImageView myView = new ImageView(getApplicationContext());
                return myView;
            }
        });

        Animation in = AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        imageSwitcher.setInAnimation(in);

        final Timer t = new Timer();
        sing = MediaPlayer.create(StoryFriend.this,R.raw.story);

        final Button btnGo = (Button) findViewById(R.id.button);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnGo.setEnabled(false);
                sing.start();
                t.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        count++;
                        if(count == images.length){
                            count=0;
                        }
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                imageSwitcher.setImageResource(images[count]);
                            }
                        });
                    }
                },0,5000);
            }
        });

    }
    private void prepareImage(){
        images = new int[]{
                R.drawable.friend1,
                R.drawable.friend2,
                R.drawable.friend3,
                R.drawable.friend4,
                R.drawable.friend5,
                R.drawable.friend6,
                R.drawable.friend7,
                R.drawable.friend8,
        };
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
