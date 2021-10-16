package com.example.dell.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPoem = (Button) findViewById(R.id.poem);
        btnPoem.setOnClickListener(this);

        Button btnVowel = (Button) findViewById(R.id.vowel);
        btnVowel.setOnClickListener(this);

        Button btnStory = (Button) findViewById(R.id.story);
        btnStory.setOnClickListener(this);

        Button btnAlpha = (Button) findViewById(R.id.alpha);
        btnAlpha.setOnClickListener(this);

        Button btnGame = (Button) findViewById(R.id.game);
        btnGame.setOnClickListener(this);
    }
    public void onClick(View v){
        switch(v.getId()){
            case R.id.poem: Intent intent = new Intent(MainActivity.this,poem.class);
                            startActivity(intent);break;
            case R.id.vowel: Intent intent1 = new Intent (MainActivity.this,vowel.class);
                            startActivity(intent1);break;
            case R.id.story: Intent intent2 = new Intent(MainActivity.this,story.class);
                            startActivity(intent2);break;
            case R.id.alpha: Intent intent3 = new Intent(MainActivity.this,thara.class);
                            startActivity(intent3);break;
            case R.id.game: Intent intent4 = new Intent(MainActivity.this, GameActivity .class);
                            startActivity(intent4);break;
            default:break;
        }
    }
}
