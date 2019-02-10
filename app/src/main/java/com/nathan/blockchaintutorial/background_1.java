package com.nathan.blockchaintutorial;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class background_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background_1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnvideo = (Button) findViewById(R.id.videoButton);
        btnvideo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.youtube.com/watch?v=Hxy8BZGQ5Jo")));
                //Log.i("Video", "Video Playing....");
            }
        });

    }


}
