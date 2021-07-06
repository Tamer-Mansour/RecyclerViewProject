package com.example.recyclerviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<MyCardJob>myCardJobs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myCardJobs = new ArrayList<>();
        myCardJobs.add(new MyCardJob(R.drawable.camera,"Camera","Pic & Rec"));
        myCardJobs.add(new MyCardJob(R.drawable.facebook,"Facebook","Posts & News"));
        myCardJobs.add(new MyCardJob(R.drawable.gmail,"Gmail","Emails"));
        myCardJobs.add(new MyCardJob(R.drawable.instagram,"Instagram","Posts & News"));
        myCardJobs.add(new MyCardJob(R.drawable.search,"Google","Search"));
        myCardJobs.add(new MyCardJob(R.drawable.telegram,"Telegram","Chat & Call"));
        myCardJobs.add(new MyCardJob(R.drawable.whatsapp,"Whatsapp","Chat & Call"));


        MyCardAdapter myCardAdapter = new MyCardAdapter(myCardJobs,MainActivity.this);
        recyclerView.setAdapter(myCardAdapter);
    }











}



//                new MyCardJob("Camera","Pic & Rec",R.drawable.camera),
//                new MyCardJob("Facebook","Posts & News",R.drawable.facebook),
//                new MyCardJob("Gmail","Emails",R.drawable.gmail),
//                new MyCardJob("Instagram","Posts & News",R.drawable.instagram),
//                new MyCardJob("Google","Search",R.drawable.search),
//                new MyCardJob("Telegram","Chat & Call",R.drawable.telegram),
//                new MyCardJob("Whatsapp","Chat & Call",R.drawable.whatsapp)