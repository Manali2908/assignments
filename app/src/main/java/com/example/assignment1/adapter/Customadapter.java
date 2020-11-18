package com.example.assignment1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.assignment1.R;
import com.example.assignment1.models.MovieList;

import java.util.ArrayList;

public class Customadapter extends BaseAdapter {

    ArrayList<MovieList> movies;
    TextView movietitle;
    TextView ratings;
    TextView description;
    ImageView image;

    public Customadapter(ArrayList<MovieList> movies) {
        this.movies = movies;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public  MovieList  getItem(int position) {
        return movies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_row_layout,null);

        if (convertView != null)
        {
            movietitle = convertView.findViewById(R.id.MT);
            ratings = convertView.findViewById(R.id.R);
            description =  convertView.findViewById(R.id.D);
            image =  convertView.findViewById(R.id.I);
        }





        MovieList movieList = getItem(position);

        movietitle.setText(movieList.getMoviename());
        ratings.setText(movieList.getRatings());
        description.setText(movieList.getDescription());

        return convertView;
    }


}
