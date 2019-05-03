package com.nathan.blockchaintutorial;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
/**
 * Created by nathc on 15/04/2018.
 */
public class background_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background_1);
    Button btnvideo = (Button) findViewById(R.id.videoButton);
        final TextView textView1 = (TextView) findViewById(R.id.textView1);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        final TextView textView3 = (TextView) findViewById(R.id.textView3);
        final TextView textView4 = (TextView) findViewById(R.id.textView4);
        btnvideo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=ZbHLNinXy9E")));
            }

        });
        Firebase text1 = new Firebase("https://blockchain-quiz.firebaseio.com/background"+1+"/textview/1");
        text1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice = dataSnapshot.getValue(String.class);
                textView1.setText(choice);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }

        });
        Firebase text2 = new Firebase("https://blockchain-quiz.firebaseio.com/background"+1+"/textview/2");
        text2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice = dataSnapshot.getValue(String.class);
                textView2.setText(choice);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        Firebase text3 = new Firebase("https://blockchain-quiz.firebaseio.com/background"+1+"/textview/3");
        text3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice = dataSnapshot.getValue(String.class);
                textView3.setText(choice);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        Firebase text4 = new Firebase("https://blockchain-quiz.firebaseio.com/background"+1+"/textview/4");
        text4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice = dataSnapshot.getValue(String.class);
                textView4.setText(choice);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
    }





