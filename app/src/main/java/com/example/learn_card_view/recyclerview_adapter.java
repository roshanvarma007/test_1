package com.example.learn_card_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerview_adapter extends RecyclerView.Adapter<recyclerview_adapter.shayariViewHolder> {

    private ArrayList<String> shayari_name_list ;
    private ArrayList<String>shayari_discription;
    private ArrayList<Integer>shayari_image;

    private Context context;

    public recyclerview_adapter(ArrayList<String> shayari_name_list, ArrayList<String> shayari_discription, ArrayList<Integer> shayari_image, Context context) {
        this.shayari_name_list = shayari_name_list;
        this.shayari_discription = shayari_discription;
        this.shayari_image = shayari_image;

        this.context = context;
    }

    @NonNull
    @Override
    public shayariViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);

        return new shayariViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull shayariViewHolder holder,int position) {

        holder.shayari_title_textview.setText(shayari_name_list.get(position));
        holder.shayari_discription_textview.setText(shayari_discription.get(position));
        holder.shayari_image_view.setImageResource(shayari_image.get(position));
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    Toast.makeText(context,"You selected Love Shayari",Toast.LENGTH_SHORT).show();
                } else if (position == 1) {
                    Toast.makeText(context,"You selected Heart Break Shayari",Toast.LENGTH_SHORT).show();
                }  else if (position == 2) {
                    Toast.makeText(context,"You selected Sad Shayari",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return shayari_name_list.size();
    }

    public class shayariViewHolder extends RecyclerView.ViewHolder {

        private TextView shayari_title_textview ,shayari_discription_textview;
        private ImageView shayari_image_view;

        private CardView cardView;
        public shayariViewHolder(@NonNull View itemView) {
            super(itemView);

            shayari_title_textview = itemView.findViewById(R.id.shayari_title_textview);
            shayari_discription_textview = itemView.findViewById(R.id.shayari_discription_textview);
            shayari_image_view = itemView.findViewById(R.id.shayari_image_view);
            cardView = itemView.findViewById(R.id.card_view);
        }
    }
}
