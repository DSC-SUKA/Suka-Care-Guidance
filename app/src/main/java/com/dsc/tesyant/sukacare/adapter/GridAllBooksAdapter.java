package com.dsc.tesyant.sukacare.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.dsc.tesyant.sukacare.R;

public class GridAllBooksAdapter extends RecyclerView.Adapter<GridAllBooksAdapter.GridViewHolder> {

    private Context context;
    private ArrayList<Books> listBooks;

    private ArrayList<Books> getListBooks() {
        return listBooks;
    }

    void setListBooks(ArrayList<Books> listBooks) {
        this.listBooks = listBooks;
    }

    GridAllBooksAdapter(Context context) {
        this.context = context;
    }

    @Override
    public GridViewHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_tab_all_book,
                parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        Glide.with(context)
                .load(getListBooks())
    }

    @Override
    public int getItemCount() {
        return getListBooks();
    }


    private class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgCover;
        GridViewHolder(View view) {
            super(view);
            imgCover = (ImageView)view.findViewById(R.id.img_bookCover);
        }
    }
}
