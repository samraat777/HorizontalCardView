package com.example.sam.horizontalcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> headingInput = new ArrayList<>();
    private ArrayList<String> date = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        headingInput.add("A brief introduction about what we do");
        date.add("20 Jan 2019");

        headingInput.add("A brief introduction about what we do");
        date.add("20 Jan 2019");

        headingInput.add("A brief introduction about what we do");
        date.add("20 Jan 2019");

        headingInput.add("A brief introduction about what we do");
        date.add("20 Jan 2019");

        headingInput.add("A brief introduction about what we do");
        date.add("20 Jan 2019");
        initRecycleView();
    }

    private void initRecycleView()
    {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,
                false);
        RecyclerView recyclerView = findViewById(R.id.recylerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(headingInput,date,this);
        recyclerView.setAdapter(adapter);

    }


}
