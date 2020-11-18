package com.example.assignment1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.assignment1.R;
import com.example.assignment1.models.MovieList;

import java.util.ArrayList;

public class Customadapter extends BaseAdapter {

    ArrayList<MovieList>  movies;

    public  Customadapter (ArrayList<MovieList> movies)
    {
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

        ViewHoder viewHoder;

        if (convertView==null)
        {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_row_layout,null);
            viewHoder = new ViewHoder(convertView);
            convertView.setTag(viewHoder);
        }
        else {

            viewHoder = (ViewHoder) convertView.getTag();
        }


        MovieList movieList = getItem(position);
        viewHoder.movietitle.setText(movieList.getMoviename());
        viewHoder.ratings.setText(movieList.getRatings());
        viewHoder.description.setText(movieList.getDescription());
        return null;
    }


    class  ViewHoder
    {
        TextView movietitle;
        TextView ratings;
        TextView description;
        ImageView image;

        public ViewHoder ( View view)

        {

            movietitle = view.findViewById(R.id.MT);
            ratings = view.findViewById(R.id.R);
            description =  view.findViewById(R.id.D);
            image =  view.findViewById(R.id.I);



        }





    }

}
