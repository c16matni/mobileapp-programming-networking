package com.example.networking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.networking.Mountain;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<Mountain> mountain;
    private LayoutInflater layoutInflater;
    private OnClickListener onClickListener;

    public RecyclerViewAdapter(Context context, List<Mountain> mountain, OnClickListener onClickListener) {
        this.layoutInflater = LayoutInflater.from(context);
        this.mountain = mountain;
        this.onClickListener = onClickListener;
    }

    @Override
    @NonNull
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(layoutInflater.inflate(R.layout.mountain, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
        holder.title.setText(mountain.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mountain.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;

        ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            title = itemView.findViewById(R.id.title);
        }

        @Override
        public void onClick(View view) {
            onClickListener.onClick(mountain.get(getBindingAdapterPosition()));
        }
    }

    public interface OnClickListener {
        void onClick(Mountain item);
    }


}