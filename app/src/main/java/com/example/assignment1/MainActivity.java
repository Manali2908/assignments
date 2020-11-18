package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.assignment1.adapter.Customadapter;
import com.example.assignment1.models.MovieList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList <MovieList> movieLists;
    Customadapter customadapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        movieLists = new ArrayList<MovieList>();

        movieLists.add(new MovieList("Dhol","7","bakwas"));
        movieLists.add(new MovieList("Dhamal","4","bakwacdsgjgjss"));
        movieLists.add(new MovieList("MunnaBhai MBBS","2","ncdsj"));
        movieLists.add(new MovieList("Sooryavansham","3","bakwas"));


        customadapter = new Customadapter(movieLists);


        listView.setAdapter(customadapter);
    }
}
