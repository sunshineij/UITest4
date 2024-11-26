package com.example.uitest4;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListItemAdapter extends ArrayAdapter<ListItem> {
    private ArrayList<ListItem> listItems;
    private Context context;

    public ListItemAdapter(Context context, ArrayList<ListItem> listItems) {
        super(context, 0, listItems);
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item_layout, parent, false);
        }
        ListItem currentItem = listItems.get(position);
        ImageView iconView = convertView.findViewById(R.id.item_icon);
        TextView textView = convertView.findViewById(R.id.item_text);
        textView.setText(currentItem.getName());
        return convertView;
    }
}