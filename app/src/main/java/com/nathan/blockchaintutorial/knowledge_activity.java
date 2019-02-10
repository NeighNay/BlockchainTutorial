package com.nathan.blockchaintutorial;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class knowledge_activity extends AppCompatActivity {
    public static final String TAG = knowledge_activity.class.getSimpleName();
    private FactBook factBook = new FactBook();
    private ColorWheel colourWheel = new ColorWheel();
    // Declare our view variables
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowledge_activity);



        //Assign the views from the layout file to the corresponding variables
        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = factBook.getFact();


                //update the screen with our new fact
                factTextView.setText(fact);

                int color = colourWheel.getColor();
                relativeLayout.setBackgroundColor(color);

                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);
        //Toast.makeText(this, "Yay! Our Activity was created", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"We're logging from the onCreate() method!");
    }
    }


