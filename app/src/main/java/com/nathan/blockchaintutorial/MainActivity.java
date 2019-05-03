package com.nathan.blockchaintutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set listeners for each button
        Button knowledgeActivity = (Button) findViewById(R.id.quickFactButton);
        knowledgeActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, knowledge.class);
                startActivity(intent);
            }
        });

        Button blockchainActivity = (Button) findViewById(R.id.blockchainButton);
        blockchainActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Intent intent = new Intent(MainActivity.this, blockchain.class);
                //startActivity(intent);
                Toast.makeText(MainActivity.this,"Coming Soon",Toast.LENGTH_LONG).show();
            }
        });

        Button backgroundActivity = (Button) findViewById(R.id.backgroundButton);
        backgroundActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, background.class);
                startActivity(intent);
            }
        });
        Button quizActivity = (Button) findViewById(R.id.quizButton);
        quizActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, quizActivity.class);
                startActivity(intent);
            }
        });
    }
    }

