package com.example.dell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class story extends AppCompatActivity {

    private List<poemData> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private adapter sAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        sAdapter = new adapter(story.this, movieList);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DriverItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(sAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {
        int[] cover =new int[]{
                R.drawable.story1,
                R.drawable.story2,
                R.drawable.story3,
                R.drawable.story4,
                R.drawable.story5,
                R.drawable.story6,
                R.drawable.story7,
                R.drawable.story8,
                R.drawable.story9};
        poemData poemlist = new poemData("ၾကက္\u200Bက\u200Bေလး", cover[0]);
        movieList.add(poemlist);

        poemlist = new poemData("သူငယ္\u200Bခ်င္\u200Bး သုံး\u200Bေယာက္", cover[1]);
        movieList.add(poemlist);

        poemlist = new poemData("\u200Bေၾကာင္\u200Bနဲ႔ ႂကြက္\u200B", cover[2]);
        movieList.add(poemlist);

        poemlist = new poemData("ယုန္\u200Bက\u200Bေလးရဲ႕ ဥာဏ္\u200Bစြမ္\u200Bး", cover[3]);
        movieList.add(poemlist);

        poemlist = new poemData("မိတ္\u200B\u200Bေဆြသုံးဦး", cover[4]);
        movieList.add(poemlist);

        poemlist = new poemData("\u200Bပုရႊက္\u200Bဆိတ္\u200Bနဲ႔ နဲ\u200Bေကာင္", cover[5]);
        movieList.add(poemlist);

        poemlist = new poemData("ကု\u200Bေဋ႐ွစ္\u200Bဆယ္\u200B သူ\u200Bေ႒းသား", cover[6]);
        movieList.add(poemlist);

        poemlist = new poemData("က်ားပုံျပင္", cover[7]);
        movieList.add(poemlist);

        poemlist = new poemData("သူငယ္\u200Bခ်င္\u200Bး\u200Bေကာင္\u200Bး", cover[8]);
        movieList.add(poemlist);

        sAdapter.notifyDataSetChanged();
    }
}
