package com.example.informationbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;

    private ArrayList<ModelClass> arrayList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView=findViewById(R.id.recyclerView);
      //  recyclerView.setLayoutManager(new LinearLayoutManager(this));  --> to show in linear

        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        //gridlayout shows every box of same size;


        //recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
// staggered gridlayout shows un even boxes


        ModelClass modelClass1=new ModelClass("infobook1","The Countries");
        ModelClass modelClass2=new ModelClass("infobook2","The Leaders");
        ModelClass modelClass3=new ModelClass("infobook3","The Museums");
        ModelClass modelClass4=new ModelClass("infobook4","Seven Wonders of The world");


         arrayList =new ArrayList<>();
         arrayList.add(modelClass1);
        arrayList.add(modelClass2);
        arrayList.add(modelClass3);
        arrayList.add(modelClass4);








    }
}