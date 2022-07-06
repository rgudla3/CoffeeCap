package com.example.coffeecap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private User person;
    private String name;
    private ArrayList<Coffee> consumedList = new ArrayList<Coffee>();
    private ArrayList<Coffee> favorites = new ArrayList<Coffee>();
    private int points;
    private TextView tester;
    private int caffeineLeft;
    private ArrayList<Coffee> firstRec;
    private ArrayList<Coffee> secondRec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        person = new User(name, 0);
        tester = findViewById(R.id.tester);
        tester.setText("Hello, " + name + "! Here is a list of recommended drinks. Please select one or enter a drink of your choice.");
    }
}
