package com.example.dell.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TableRow;

import java.util.ArrayList;
import java.util.List;

public class vowel extends AppCompatActivity {

    private List<poemData> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private adapter alAdapter;
    TableRow clickRow;
    MediaPlayer sing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vowel);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        sing  = MediaPlayer.create(this,R.raw.alphamusic);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        //clickRow = (TableRow) findViewById(R.id.table1);
        //clickRow.setClickable(true);
        alAdapter = new adapter(vowel.this, movieList);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DriverItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(alAdapter);

        prepareMovieData();
        // clickRow.setOnClickListener(this);

    }
    private void prepareMovieData() {
        int[] cover =new int[]{
                R.drawable.alph1,
                R.drawable.alph2,
                R.drawable.alph3,
                R.drawable.alph4,
                R.drawable.alph5,
                R.drawable.alph6,
                R.drawable.alph7,
                R.drawable.alph8,
                R.drawable.alph9,
                R.drawable.alph10,
                R.drawable.alph11,
                R.drawable.alph12,
                R.drawable.alph13,
                R.drawable.alph14,
                R.drawable.alph15,
                R.drawable.alph16,
                R.drawable.alph17,
                R.drawable.alph18,
                R.drawable.alph19,
                R.drawable.alph20,
                R.drawable.alph21,
                R.drawable.alph22,
                R.drawable.alph23,
                R.drawable.alph24,
                R.drawable.alph25};
        poemData movie = new poemData(" က က\u200Bေလးငယ္\u200B ခ်စ္\u200Bစဖြယ္\u200B", cover[0]);
        movieList.add(movie);

        movie = new poemData("ခ ခ\u200Bေရကုံး မ\u200Bေလးျပဳံး", cover[1]);
        movieList.add(movie);

        movie = new poemData(" ဂ ဂဏန္\u200Bးသင္\u200B ျပဳံးရႊင္\u200Bရႊင္\u200B", cover[2]);
        movieList.add(movie);

        movie = new poemData(" င ငခ်ိတ္\u200B\u200Bေပါင္\u200Bး စားလုိ႔\u200Bေကာင္\u200Bး", cover[3]);
        movieList.add(movie);

        movie = new poemData(" စ စခန္\u200Bးသာ \u200Bေတာင္\u200Bတန္\u200Bးျပာ", cover[4]);
        movieList.add(movie);

        movie = new poemData(" ဆ ဆရာမ ႐ုိ\u200Bေသၾက", cover[5]);
        movieList.add(movie);

        movie = new poemData("  ဇ ဇလပ္\u200Bျဖဴ   သင္\u200Bးၾကဴ ၾကဴ", cover[6]);
        movieList.add(movie);

        movie = new poemData("ည ည\u200Bေနခင္\u200Bး \u200Bေရခပ္\u200Bဆင္\u200Bး", cover[7]);
        movieList.add(movie);

        movie = new poemData("တ တမာပင္\u200B ရႊာအဝင္\u200B", cover[8]);
        movieList.add(movie);

        movie = new poemData(" ထ ထမင္\u200Bးပြဲ လက္\u200Bဆုံႏႊဲ", cover[9]);
        movieList.add(movie);

        movie = new poemData("   ဒ ဒရယ္\u200B ယုန္\u200B သားမ်ဳိးစုံ", cover[10]);
        movieList.add(movie);

        movie = new poemData(" ဓ ဓနိတန္\u200Bး ပင္\u200Bလယ္\u200Bကမ္\u200Bး", cover[11]);
        movieList.add(movie);

        movie = new poemData("န နဖူးျပင္\u200B နံသာတင္\u200B", cover[12]);
        movieList.add(movie);

        movie = new poemData(" ပ ပ\u200Bေလြမႈတ္ ကုိဖုိးတုတ္\u200B", cover[13]);
        movieList.add(movie);

        movie = new poemData(" ဖ ဖ႐ုံယုိ အလြန္\u200Bခ်ိဳ", cover[14]);
        movieList.add(movie);

        movie = new poemData(" ဗ ဗလႀကီး ဆင္\u200B\u200Bေျပာင္\u200Bစီး", cover[15]);
        movieList.add(movie);

        movie = new poemData(" ဘ အဘုိးအုိ ဆီးလု့ိၾကဳိ", cover[16]);
        movieList.add(movie);

        movie = new poemData("မ မမ\u200Bေလး ဝလုံး\u200Bေရး", cover[17]);
        movieList.add(movie);

        movie = new poemData("    ယ ယမင္\u200Bးခင္\u200B ကၾကဳိးဆင္\u200B", cover[18]);
        movieList.add(movie);

        movie = new poemData("ရ ရထားႀကီး \u200Bေပ်ာ္\u200B\u200Bေပ်ာ္\u200Bစီး", cover[19]);
        movieList.add(movie);

        movie = new poemData("  လ လဝါဝါ ထိန္\u200Bထိန္\u200Bသာ", cover[20]);
        movieList.add(movie);

        movie = new poemData(" ဝ ဝတုတ္\u200Bတုတ္\u200B ဖုိးဝ႐ုပ္\u200B", cover[21]);
        movieList.add(movie);

        movie = new poemData("သ သ\u200Bေျပညဳိ \u200Bေအာင္\u200Bပြဲၾကဳိ", cover[22]);
        movieList.add(movie);

        movie = new poemData("ဟ ဟ ဟာ ဟ ရယ္\u200Bလုိ္\u200Bက္\u200Bရ", cover[23]);
        movieList.add(movie);

        movie = new poemData(" အ အမိ\u200Bေျမ. တုိ႔တိုင္\u200Bးျပည္\u200B\n" +
                "            ငါတုိ႔ခ်စ္\u200Bတဲ\u200B့\u200Bေျမ", cover[24]);
        movieList.add(movie);


        alAdapter.notifyDataSetChanged();
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();
        if(id == R.id.start){
                sing.start();
        }
        return super.onOptionsItemSelected(item);
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
