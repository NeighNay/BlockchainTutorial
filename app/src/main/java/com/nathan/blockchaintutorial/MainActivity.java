package com.nathan.blockchaintutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button knowledgeActivity = (Button) findViewById(R.id.testButton);
        knowledgeActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,knowledge_activity.class);
                startActivity(intent);
            }
        });

        Button blockchainActivity = (Button) findViewById(R.id.blockchainButton);
        blockchainActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, blockchain_activity.class);
                startActivity(intent);
            }
        });
    }
    }

