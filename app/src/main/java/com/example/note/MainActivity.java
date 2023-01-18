package com.example.note;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("시제");
        list.add("형식");
        list.add("품사");
        list.add("어순");

        ArrayAdapter<String> adpater = new ArrayAdapter<String>(this.getApplicationContext(), R.layout.list_layout, list);
        listview.setAdapter(adpater);
    }
}