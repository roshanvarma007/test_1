package com.example.learn_card_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView ;
    private recyclerview_adapter adapter;
    ImageView imageView;
    TextView textView;

    private ArrayList<String>shayari_name_list =new ArrayList<>();
    private ArrayList<String>shayari_discription =new ArrayList<>();
    private ArrayList<Integer>shayari_image =new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recylerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        shayari_name_list.add("Love Shayari");
        shayari_name_list.add("Heart Break");
        shayari_name_list.add("Sad Shayari");

        shayari_discription.add("Love is seasoned feelings of heart & needs to be expressed");
        shayari_discription.add("Trying to move on from something that broke your heart could be the worst feeling ever.");
        shayari_discription.add("Trying to move on from something that broke your heart could be the worst feeling ever.");

        shayari_image.add(R.drawable.love_shayari);
        shayari_image.add(R.drawable.heart_break);
        shayari_image.add(R.drawable.sad_imoji);

        adapter = new recyclerview_adapter(shayari_name_list,shayari_discription,shayari_image,MainActivity.this);

        recyclerView.setAdapter(adapter);

    }
}