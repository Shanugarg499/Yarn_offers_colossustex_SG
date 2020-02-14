package com.example.s_module;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> headings = new ArrayList<>();
    ArrayList<String> contents = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContents();

    }

    private void setContents(){
        headings.add("Open End Waxed Yarn for Knitting");
        contents.add("We can offer 100% cotton open end waxed yarn for knitting. Count available is 24s. Can even make 30s if required. The mill is located in North India." +
                "" +
                "Please email oon support@yarnlive.com or whatsapp on 9876543210 if you have any questions." +
                "" +
                "Thank you");
        headings.add("Open End Waxed Yarn for Knitting");
        contents.add("We can offer 100% cotton open end waxed yarn for knitting. Count available is 24s. Can even make 30s if required. The mill is located in North India." +
                "" +
                "Please email oon support@yarnlive.com or whatsapp on 9876543210 if you have any questions." +
                "" +
                "Thank you");
        headings.add("Open End Waxed Yarn for Knitting");
        contents.add("We can offer 100% cotton open end waxed yarn for knitting. Count available is 24s. Can even make 30s if required. The mill is located in North India." +
                "" +
                "Please email oon support@yarnlive.com or whatsapp on 9876543210 if you have any questions." +
                "" +
                "Thank you");
        headings.add("Open End Waxed Yarn for Knitting");
        contents.add("We can offer 100% cotton open end waxed yarn for knitting. Count available is 24s. Can even make 30s if required. The mill is located in North India." +
                "" +
                "Please email oon support@yarnlive.com or whatsapp on 9876543210 if you have any questions." +
                "" +
                "Thank you");
        headings.add("Open End Waxed Yarn for Knitting");
        contents.add("We can offer 100% cotton open end waxed yarn for knitting. Count available is 24s. Can even make 30s if required. The mill is located in North India." +
                "" +
                "Please email oon support@yarnlive.com or whatsapp on 9876543210 if you have any questions." +
                "" +
                "Thank you");
        headings.add("Open End Waxed Yarn for Knitting");
        contents.add("We can offer 100% cotton open end waxed yarn for knitting. Count available is 24s. Can even make 30s if required. The mill is located in North India." +
                "" +
                "Please email oon support@yarnlive.com or whatsapp on 9876543210 if you have any questions." +
                "" +
                "Thank you");
        headings.add("Open End Waxed Yarn for Knitting");
        contents.add("We can offer 100% cotton open end waxed yarn for knitting. Count available is 24s. Can even make 30s if required. The mill is located in North India." +
                "" +
                "Please email oon support@yarnlive.com or whatsapp on 9876543210 if you have any questions." +
                "" +
                "Thank you");


        initializeRV();
    }

    private void initializeRV(){
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        ProgrammingAdapter adapter = new ProgrammingAdapter(headings, contents, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
