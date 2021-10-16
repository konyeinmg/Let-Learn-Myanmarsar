package com.example.dell.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder>{
    private Context mContext;
    private List<poemData> poemlist;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        private poemData poemdata;
        ImageView image;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            image=(ImageView)view.findViewById(R.id.image);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Toast.makeText(mContext, poemdata.getTitle() + " is selected!", Toast.LENGTH_SHORT).show();
                   if(poemdata.getTitle() == "သေျပသီးေကာက္"){
                        Context context = v.getContext();
                        Intent intent = new Intent(context,countfruit.class);
                        context.startActivity(intent);
                    }
                    if(poemdata.getTitle() == "ျကာဆစ္ျကုိး"){
                        Context context = v.getContext();
                        Intent intent = new Intent(context,targetpoem.class);
                        context.startActivity(intent);
                    }
                    if(poemdata.getTitle() == "ဗ်ည္းပုံစံတူယွဥ္တြဲၾကမယ္"){
                        Context context = v.getContext();
                        Intent intent = new Intent(context,targetgame1.class);
                        context.startActivity(intent);
                    }
                    if(poemdata.getTitle() == "တူရာရုပ္ပုံ ေရြးၾကမယ္"){
                        Context context = v.getContext();
                        Intent intent = new Intent(context,targetgame2.class);
                        context.startActivity(intent);
                    }
                    if(poemdata.getTitle() == "သူငယ္\u200Bခ်င္\u200Bး သုံး\u200Bေယာက္"){
                        Context context = v.getContext();
                        Intent intent = new Intent(context,StoryFriend.class);
                        context.startActivity(intent);
                    }
                    if(poemdata.getTitle() == "ဆုေတာင္း"){
                        Context context = v.getContext();
                        Intent intent = new Intent(context,wish.class);
                        context.startActivity(intent);
                    }
                    if(poemdata.getTitle() == "စံပယ္ပြင့္ကေလးမ်ား"){
                        Context context = v.getContext();
                        Intent intent = new Intent(context,jasmine.class);
                        context.startActivity(intent);
                    }
                }
            });
        }

        public void bindView(poemData poemdata){

            this.poemdata = poemdata;

            title.setText(poemdata.getTitle());
            Glide.with(mContext).load(poemdata.getimage()).into(image);
        }
    }

    public adapter(Context mContext, List<poemData> poemlist) {
        this.mContext = mContext;
        this.poemlist = poemlist;
    }

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    public void onBindViewHolder(MyViewHolder holder, int position) {
        poemData poemdata = poemlist.get(position);
        holder.bindView(poemdata);
       /* holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());*/
    }

    public int getItemCount() {
        return poemlist.size();
    }
}

