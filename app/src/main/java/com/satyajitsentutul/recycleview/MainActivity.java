package com.satyajitsentutul.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    String countryName[]={"Bangladesh","India","China","America","Austrilia","New Zeland"};
    int imgflag[]={R.drawable.bd,R.drawable.india,R.drawable.china,R.drawable.america,R.drawable.australia,R.drawable.new_zealand};
    RecyclerView recyclerView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycleview);
        LinearLayoutManager manager=new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(manager);

        CustomAdapter customAdapter=new CustomAdapter(MainActivity.this,countryName,imgflag);
        recyclerView.setAdapter(customAdapter);
    }
}
