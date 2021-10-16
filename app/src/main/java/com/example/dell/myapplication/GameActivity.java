package com.example.dell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TableRow;

import java.util.ArrayList;
import java.util.List;

public class GameActivity extends AppCompatActivity {
    private List<poemData> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private adapter pAdapter;
    TableRow clickRow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        pAdapter = new adapter(GameActivity.this, movieList);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DriverItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(pAdapter);

        prepareMovieData();
        // clickRow.setOnClickListener(this);

    }
    private void prepareMovieData() {
        int[] cover =new int[]{
                R.drawable.gamekids1,
                R.drawable.gamekids2,
                R.drawable.gamekids3,
                R.drawable.gamekids4,
                R.drawable.gamekids5,
                R.drawable.gamekids6,
                R.drawable.album6};
        poemData poemdata = new poemData("ဗ်ည္းပုံစံတူယွဥ္တြဲၾကမယ္", cover[0]);
        movieList.add(poemdata);

        poemdata = new poemData("တူရာရုပ္ပုံ ေရြးၾကမယ္", cover[1]);
        movieList.add(poemdata);

        poemdata = new poemData("သင့္ေလ်ာ္ေသာ \nသရေရြးၾကမယ္", cover[2]);
        movieList.add(poemdata);

        poemdata = new poemData("သတ္ပုံ မွန္မွား ေရြးၾကမယ္", cover[3]);
        movieList.add(poemdata);

        poemdata = new poemData("သံတူအမွန္ျဖည့္ၾကမယ္", cover[4]);
        movieList.add(poemdata);

        poemdata = new poemData("ကြက္လပ္ျဖည့္ၾကမယ္", cover[5]);
        movieList.add(poemdata);

        pAdapter.notifyDataSetChanged();
    }
}





