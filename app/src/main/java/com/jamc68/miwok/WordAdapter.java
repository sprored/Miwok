package com.jamc68.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter (@NonNull Context context, ArrayList<Word> resource) {
        super(context,0, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        // Get the data item for this position
        Word word= getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Lookup view for data population
        TextView miwokTV = (TextView) convertView.findViewById(R.id.miwok_text_view);
        TextView defaultTV = (TextView) convertView.findViewById(R.id.default_text_view);

        // Populate the data into the template view using the data object
        miwokTV.setText(word.getMiwokTranslation());
        defaultTV.setText(word.getDefaultTranslation());


        // Return the completed view to render on screen
        return convertView;
    }
}
