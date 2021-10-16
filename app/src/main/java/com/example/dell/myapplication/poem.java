package com.example.dell.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TableRow;

import java.util.ArrayList;
import java.util.List;

public class poem extends AppCompatActivity {
    private List<poemData> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private adapter pAdapter;
    TableRow clickRow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        pAdapter = new adapter(poem.this, movieList);

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
                R.drawable.album1,
                R.drawable.album2,
                R.drawable.album3,
                R.drawable.album4,
                R.drawable.album5,
                R.drawable.album6,
                R.drawable.albumm7,
                R.drawable.album8,
                R.drawable.album9,
                R.drawable.album10,
                R.drawable.album11,
                R.drawable.album12,
                R.drawable.album13};
        poemData poemdata = new poemData("ဖုိးစလုံး", cover[0]);
        movieList.add(poemdata);

        poemdata = new poemData("တုိ့ေက်ာင္း", cover[1]);
        movieList.add(poemdata);

        poemdata = new poemData("ေတာင္ေတာရယ္သာ", cover[2]);
        movieList.add(poemdata);

        poemdata = new poemData("အေပ်ာ္မီးရထား", cover[3]);
        movieList.add(poemdata);

        poemdata = new poemData("မမ ၀၀", cover[4]);
        movieList.add(poemdata);

        poemdata = new poemData("ဆန္းသစ္လ", cover[5]);
        movieList.add(poemdata);

        poemdata = new poemData("ေျပးပြဲ ျပိဳင္ပြဲ", cover[6]);
        movieList.add(poemdata);

        poemdata = new poemData("ဖုိးသာထူး", cover[7]);
        movieList.add(poemdata);

        poemdata = new poemData("စံပယ္ပြင့္ကေလးမ်ား", cover[8]);
        movieList.add(poemdata);

        poemdata = new poemData("သေျပသီးေကာက္", cover[9]);
        movieList.add(poemdata);

        poemdata = new poemData("ျကာဆစ္ျကုိး", cover[10]);
        movieList.add(poemdata);

        poemdata = new poemData("ဆုေတာင္း", cover[11]);
        movieList.add(poemdata);

        poemdata = new poemData("မဂၤလာကဗ်ာ", cover[12]);
        movieList.add(poemdata);


        pAdapter.notifyDataSetChanged();
    }
}
