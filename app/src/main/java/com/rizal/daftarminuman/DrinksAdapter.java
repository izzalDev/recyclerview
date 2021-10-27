package com.rizal.daftarminuman;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DrinksAdapter extends RecyclerView.Adapter<DrinksAdapter.DrinksViewHolder> {
    private ArrayList<DrinksItem> listDrinks;

    public DrinksAdapter(ArrayList<DrinksItem> listDrinks) {
        this.listDrinks = listDrinks;
    }

    @NonNull
    @Override
    public DrinksAdapter.DrinksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_row_drink,parent,false);
        return new DrinksViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DrinksAdapter.DrinksViewHolder holder, int position) {
        holder.name.setText(listDrinks.get(position).getName());
        holder.rating.setText(listDrinks.get(position).getRating());
    }

    @Override
    public int getItemCount() {
        return (listDrinks != null) ? listDrinks.size():0;
    }

    public class DrinksViewHolder extends RecyclerView.ViewHolder{
        private TextView name, rating, image;

        public DrinksViewHolder (View view){
            super(view);

            name = view.findViewById(R.id.name);
            rating = view.findViewById(R.id.rating);
        }
    }
}
