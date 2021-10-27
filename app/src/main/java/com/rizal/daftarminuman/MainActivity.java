package com.rizal.daftarminuman;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DrinksAdapter drinksAdapter;
    private ArrayList<DrinksItem> drinksItemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.rv_drink);
        drinksAdapter = new DrinksAdapter(drinksItemArrayList);

        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(drinksAdapter);
    }

    public void getData(){
        drinksItemArrayList = new ArrayList<>();
        drinksItemArrayList.add(new DrinksItem("Es teh","5","5","5"));
        drinksItemArrayList.add(new DrinksItem("Es Jeruk","5","5","5"));
        drinksItemArrayList.add(new DrinksItem("Es Kopi","5","5","5"));
        drinksItemArrayList.add(new DrinksItem("Es Jahe","5","5","5"));
        drinksItemArrayList.add(new DrinksItem("Es Susu","5","5","5"));
        drinksItemArrayList.add(new DrinksItem("Es Nanas","5","5","5"));
        drinksItemArrayList.add(new DrinksItem("Es TMJ","5","5","5"));
    }
}