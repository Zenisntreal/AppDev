package com.example.androidstudiocollections;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {

    private Context context;
    private int[][] grid;

    public GridAdapter(Context context, int[][] grid) {
        this.context = context;
        this.grid = grid;
    }

    @Override
    public int getCount() {
        return grid.length * grid[0].length;
    }

    @Override
    public Object getItem(int position) {
        int row = position / grid.length;
        int col = position % grid[0].length;
        return grid[row][col];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(context);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(100, 100)); // Adjust according to your need
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        int row = position / grid.length;
        int col = position % grid[0].length;
        int tile = grid[row][col];

        // Set different images for different tile values
        if (tile == 0) {
            imageView.setImageResource(R.drawable.affliction); // Assuming you have a drawable resource named "tile_0"
        } else {
            imageView.setImageResource(R.drawable.affliction2); // Assuming you have a drawable resource named "tile_1"
        }

        return imageView;
    }
}
