package com.nathan.blockchaintutorial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class background extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


//create object of listview
        ListView listView=(ListView)findViewById(R.id.listview);

//create ArrayList of String
        final ArrayList<String> arrayList=new ArrayList<>();

//Add elements to arraylist
        arrayList.add("History");
        arrayList.add("Technical Details");
        arrayList.add("The Future");
        arrayList.add("Use Cases");
//Create Adapter
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

//assign adapter to listview
        listView.setAdapter(arrayAdapter);

//add listener to listview
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i + 1) {
                    case 1:
                        Intent intent = new Intent(background.this, background_1.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(background.this, background_2.class);
                        startActivity(intent);
                        break;
                    case 3:
                        Toast.makeText(background.this,"Coming Soon",Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(background.this,"Coming Soon",Toast.LENGTH_SHORT).show();


                }
            }
        });


    }

}
