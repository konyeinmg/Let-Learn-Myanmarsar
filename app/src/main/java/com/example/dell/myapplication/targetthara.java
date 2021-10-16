package com.example.dell.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class targetthara extends AppCompatActivity implements View.OnClickListener{
    MediaPlayer sing;
    int[] record = new int[]{
            R.raw.ka,
            R.raw.la,
            R.raw.wa,
            R.raw.khar
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_targetthara);

        TextView text1 = (TextView)findViewById(R.id.text1);
        text1.setOnClickListener(this);

        TextView text2 = (TextView)findViewById(R.id.text2);
        text2.setOnClickListener(this);

        TextView text3 = (TextView)findViewById(R.id.text3);
        text3.setOnClickListener(this);

        TextView text4 = (TextView)findViewById(R.id.text4);
        text4.setOnClickListener(this);

    }
    public void onClick(View v){
        switch(v.getId()){
            case R.id.text1:if(sing == null || !sing.isPlaying()) voice(0);break;
            case R.id.text2:if(sing == null || !sing.isPlaying()) voice(1);break;
            case R.id.text3:if(sing == null || !sing.isPlaying()) voice(2);break;
            case R.id.text4:if(sing == null || !sing.isPlaying()) voice(3);break;
            default:break;
        }
    }
    public void voice(int id){
        sing = MediaPlayer.create(targetthara.this,record[id]);
        sing.start();
    }
    protected void onDestroy(){
        super.onDestroy();
        if(sing != null && sing.isPlaying()) {
            sing.stop();
            sing.release();
            sing = null;
        }
    }

}



