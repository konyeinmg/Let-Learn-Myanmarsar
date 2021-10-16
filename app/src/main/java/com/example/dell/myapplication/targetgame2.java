package com.example.dell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class targetgame2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_targetgame2);

        Toolbar mtoolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ImageView one = (ImageView)findViewById(R.id.one);
        final ImageView two = (ImageView)findViewById(R.id.two);
        final ImageView three = (ImageView)findViewById(R.id.three);
        final ImageView four = (ImageView)findViewById(R.id.four);
        final ImageView five = (ImageView)findViewById(R.id.five);
        final ImageView six = (ImageView)findViewById(R.id.six);
        final ImageView seven = (ImageView)findViewById(R.id.seven);
        final ImageView eight = (ImageView)findViewById(R.id.eight);
        final ImageView nine = (ImageView)findViewById(R.id.nin);


        one.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                one.setImageResource(R.drawable.right);
                two.setImageResource(R.drawable.pencil);
                three.setImageResource(R.drawable.police1);
            }});

        two.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                two.setImageResource(R.drawable.wrong);
                three.setImageResource(R.drawable.police1);
                one.setImageResource(R.drawable.clock);
            }});

        three.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                three.setImageResource(R.drawable.wrong);
                one.setImageResource(R.drawable.clock);
                two.setImageResource(R.drawable.pencil);
            }});

        four.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                four.setImageResource(R.drawable.wrong);
                five.setImageResource(R.drawable.ball);
                six.setImageResource(R.drawable.police1);
            }});

        five.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                five.setImageResource(R.drawable.wrong);
                four.setImageResource(R.drawable.lamp);
                six.setImageResource(R.drawable.police1);
            }});

        six.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                six.setImageResource(R.drawable.right);
                four.setImageResource(R.drawable.lamp);
                five.setImageResource(R.drawable.ball);
            }});
        seven.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                seven.setImageResource(R.drawable.wrong);
                eight.setImageResource(R.drawable.pencil);
                nine.setImageResource(R.drawable.ball);
            }});

        eight.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                eight.setImageResource(R.drawable.right);
                seven.setImageResource(R.drawable.cat);
                nine.setImageResource(R.drawable.ball);
            }});

        nine.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                nine.setImageResource(R.drawable.wrong);
                seven.setImageResource(R.drawable.cat);
                eight.setImageResource(R.drawable.pencil);
            }});
    }

}
