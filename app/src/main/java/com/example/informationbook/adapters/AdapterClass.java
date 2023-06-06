package com.example.informationbook.adapters;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.informationbook.R;
import com.example.informationbook.activities.CountriesActivity;
import com.example.informationbook.activities.LeadersActivity;
import com.example.informationbook.activities.WondersActivity;

import java.util.*;
public class AdapterClass  extends RecyclerView.Adapter<AdapterClass.cardViewHolder>{

    private ArrayList<ModelClass> modelList;

    private Context context;
    public AdapterClass(ArrayList<ModelClass> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public cardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {




        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);
        return new cardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull cardViewHolder holder, int position) {


   ModelClass model=modelList.get(position);
   holder.textViewSplash.setText(model.getCategoryName());
   holder.imageViewSplash.setImageResource(context.getResources().getIdentifier(model.getImageName(),"drawable", context.getPackageName()));

holder.cardView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        if(position==0)
        {
            Intent intent=new Intent(context, CountriesActivity.class);
            context.startActivity(intent);
        }
        if(position==1)
        {
            Intent intent=new Intent(context, LeadersActivity.class);
            context.startActivity(intent);
        }

        if(position==2)
        {
            Intent intent=new Intent(context,MuseumsActivity.class);
            context.startActivity(intent);
        }

        if(position==3)
        {
            Intent intent=new Intent(context, WondersActivity.class);
            context.startActivity(intent);
        }





    }
});








    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class cardViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewSplash;
        private TextView textViewSplash;
        private CardView  cardView;



        public cardViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewSplash=itemView.findViewById(R.id.ImageViewSplash);
            textViewSplash=itemView.findViewById(R.id.textViewSpash);
            cardView=itemView.findViewById(R.id.cardView);




        }
    }


    public static class MuseumsActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_museums);
        }
    }
}
