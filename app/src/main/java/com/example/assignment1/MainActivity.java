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

        movieLists.add(new MovieList("Dhol","9","Very entertaining movie,must watch with family"));
        movieLists.add(new MovieList("Dhamal","8.9","funny and nice "));
        movieLists.add(new MovieList("Munnabhai MBBS","8","emotional,funny and lil bit action"));
        movieLists.add(new MovieList("Sooryavansham","3","average movie,if you have very free time then and only then watch"));


        customadapter = new Customadapter(movieLists);


        listView.setAdapter(customadapter);
    }
}
