package com.example.networking;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>  {
    private List<Mountain> mountains;
    private OnClickListener onClickListener;
    private LayoutInflater layoutInflater;

    public RecyclerViewAdapter(MainActivity mainActivity, ArrayList<Mountain> mList, OnClickListener onClickListener) {

        this.onClickListener = onClickListener;
        this.layoutInflater = layoutInflater;
        this.mountains = mountains;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public static abstract class OnClickListener {
        public abstract void onClick(Mountain item);
    }
}
