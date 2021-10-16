package com.example.dell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class targetgame1 extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.targetgame1);

       Toolbar mtoolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    Button btnGo1 = (Button) findViewById(R.id.btn1);
    Button btnGo2 = (Button) findViewById(R.id.btn2);
    Button btnGo3 = (Button) findViewById(R.id.btn3);
    Button btnGo4 = (Button) findViewById(R.id.btn4);
    Button btnGo5 = (Button) findViewById(R.id.btn5);
    Button btnGo6 = (Button) findViewById(R.id.btn6);
    Button btnGo7 = (Button) findViewById(R.id.btn7);
    Button btnGo8 = (Button) findViewById(R.id.btn8);
    Button btnGo9 = (Button) findViewById(R.id.btn9);
    Button btnGo10 = (Button) findViewById(R.id.btn10);
    Button btnGo11 = (Button) findViewById(R.id.btn11);
    Button btnGo12 = (Button)findViewById(R.id.btn12);

    TextView tvResult1 = (TextView)findViewById(R.id.textView1);
    TextView tvResult2 = (TextView)findViewById(R.id.textView2);
    TextView tvResult3 = (TextView)findViewById(R.id.textView3);
    TextView tvResult4 = (TextView)findViewById(R.id.textView4);

    final ImageButton img1 = (ImageButton) findViewById(R.id.imagebutton1);
    final ImageButton img2 = (ImageButton) findViewById(R.id.imagebutton2);
    final ImageButton img3 = (ImageButton) findViewById(R.id.imagebutton3);
    final ImageButton img4 = (ImageButton) findViewById(R.id.imagebutton4);

    String[] chars = {"က","ခ","ဂ","င","လ","ဘ","ထ","မ","တ","ဆ","စ","ဟ","သ","ပ","အ","ဖ","ဗ"};
    int a = (int) (Math.random() * 17);

        tvResult1.setText(chars[a]);
        btnGo1.setText(chars[(int)(Math.random()*17)]);
        btnGo2.setText(chars[a]);
        btnGo3.setText(chars[(int)(Math.random()*17)]);

    a = (int) (Math.random() * 17);
        tvResult2.setText(chars[a]);
        btnGo5.setText(chars[(int)(Math.random()*17)]);
        btnGo4.setText(chars[a]);
        btnGo6.setText(chars[(int)(Math.random()*17)]);

    a = (int) (Math.random() * 17);
        tvResult3.setText(chars[a]);
        btnGo7.setText(chars[(int)(Math.random()*17)]);
        btnGo8.setText(chars[a]);
        btnGo9.setText(chars[(int)(Math.random()*17)]);

    a = (int) (Math.random() * 17);
        tvResult4.setText(chars[a]);
        btnGo10.setText(chars[(int)(Math.random()*17)]);
        btnGo11.setText(chars[a]);
        btnGo12.setText(chars[(int)(Math.random()*17)]);

        btnGo1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            img1.setImageResource(R.drawable.wrong1);
        }
    });
        btnGo2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            img1.setImageResource(R.drawable.correct);
        }
    });
        btnGo3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            img1.setImageResource(R.drawable.wrong1);
        }
    });
        btnGo4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            img2.setImageResource(R.drawable.correct);
        }
    });
        btnGo5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            img2.setImageResource(R.drawable.wrong1);
        }
    });
        btnGo6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            img2.setImageResource(R.drawable.wrong1);
        }
    });

        btnGo7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            img3.setImageResource(R.drawable.wrong1);
        }
    });
        btnGo8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            img3.setImageResource(R.drawable.correct);
        }
    });
        btnGo9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            img3.setImageResource(R.drawable.wrong1);
        }
    });
        btnGo10.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            img4.setImageResource(R.drawable.wrong1);
        }
    });
        btnGo11.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            img4.setImageResource(R.drawable.correct);
        }
    });
        btnGo12.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            img4.setImageResource(R.drawable.wrong1);
        }
    });
}


}
