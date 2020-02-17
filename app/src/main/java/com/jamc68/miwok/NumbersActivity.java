package com.jamc68.miwok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.SolverVariable;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Add words
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("lutti","one"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo’e"));
        words.add(new Word("ten", "na’aacha"));
        // The ArrayAdapter requires a declaration of the type of the item to be converted
        // to a View (a String in this case) and then accepts three arguments:
        // context (activity instance), XML item layout, and the array of data.
        // The getView() method of the original ArrayAdapter must be overriden so that
        // we can use our custom object 'words'
        WordAdapter itemsAdapter = new WordAdapter( this, words);
        //Now, we just need to connect this adapter to a ListView to be populated:
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}
