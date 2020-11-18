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

    public  ArrayList<MovieList> getMovieLists()
    {
        ArrayList<MovieList> movieLists = new ArrayList<>();

      movieLists.add(new MovieList("abc","7","bakwas"));
        movieLists.add(new MovieList("hjk","4","bakwacdsgjgjss"));
        movieLists.add(new MovieList("bxb","2","ncdsj"));

        movieLists.add(new MovieList("jis","3","bakwas"));
        movieLists.add(new MovieList("acx","8","bakwas"));

      return movieLists;






    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView.findViewById(R.id.listview);
        Customadapter customadapter = new Customadapter(movieLists);
        listView.setAdapter(customadapter);
    }
}
