package com.example.recyclerviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyCardJob[] myCardJobs = new MyCardJob[]{
                new MyCardJob("Camera","Pic & Rec",R.drawable.camera),
                new MyCardJob("Facebook","Pic & Rec",R.drawable.facebook),
                new MyCardJob("Gmail","Pic & Rec",R.drawable.gmail),
                new MyCardJob("Instagram","Pic & Rec",R.drawable.instagram),
                new MyCardJob("Google","Pic & Rec",R.drawable.search),
                new MyCardJob("Telegram","Pic & Rec",R.drawable.telegram),
                new MyCardJob("Whatsapp","Pic & Rec",R.drawable.whatsapp)
        };
        MyCardAdapter myCardAdapter = new MyCardAdapter(myCardJobs,MainActivity.this);
        recyclerView.setAdapter(myCardAdapter);


    }
}