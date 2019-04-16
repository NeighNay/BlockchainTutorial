package com.nathan.blockchaintutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class quizActivity extends AppCompatActivity {
    private TextView scoreDisplay;
    private TextView question;
    private String answer;
    private Button button1, button2, button3, button4;
    private int score = 0;
    private int currentQuestion = 0;
    private Firebase thisQuestion, choice1,choice2,choice3,choice4, selectedAnswer;
    private ColourWheel colourWheel = new ColourWheel();
    private RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        scoreDisplay = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        button1 = (Button) findViewById(R.id.choice1);
        button2 = (Button) findViewById(R.id.choice2);
        button3 = (Button) findViewById(R.id.choice3);
        button4 = (Button) findViewById(R.id.choice4);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        nextQuestion();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button1.getText().equals(answer)){
                    score+=1;
                    currentQuestion+=1;
                    scoreDisplay.setText(""+score);
                    int color = colourWheel.getColor();
                    relativeLayout.setBackgroundColor(color);
                    nextQuestion();
                }
                else{
                    currentQuestion+=1;
                    int color = colourWheel.getColor();
                    relativeLayout.setBackgroundColor(color);
                    nextQuestion();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button2.getText().equals(answer)){
                    score+=1;
                    currentQuestion+=1;
                    scoreDisplay.setText(""+score);
                    int color = colourWheel.getColor();
                    relativeLayout.setBackgroundColor(color);
                    nextQuestion();

                }
                else{
                    currentQuestion+=1;
                    int color = colourWheel.getColor();
                    relativeLayout.setBackgroundColor(color);
                    nextQuestion();
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button3.getText().equals(answer)){
                    score+=1;
                    currentQuestion+=1;
                    scoreDisplay.setText(""+score);
                    int color = colourWheel.getColor();
                    relativeLayout.setBackgroundColor(color);
                    nextQuestion();
                }
                else{
                    currentQuestion+=1;
                    int color = colourWheel.getColor();
                    relativeLayout.setBackgroundColor(color);
                    nextQuestion();
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button4.getText().equals(answer)){
                    score+=1;
                    currentQuestion+=1;
                    scoreDisplay.setText(""+score);
                    int color = colourWheel.getColor();
                    relativeLayout.setBackgroundColor(color);
                    nextQuestion();
                }
                else{
                    currentQuestion+=1;
                    int color = colourWheel.getColor();
                    relativeLayout.setBackgroundColor(color);
                    nextQuestion();
                }
            }
        });
    }

    public void nextQuestion(){
        thisQuestion = new Firebase("https://blockchain-quiz.firebaseio.com/quiz/"+currentQuestion+"/question");
        thisQuestion.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String getQuestion = dataSnapshot.getValue(String.class);
                if(dataSnapshot.exists()){
                    question.setText(getQuestion);
                }
                else{
                    Toast.makeText(quizActivity.this,"You scored "+score,Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        choice1 = new Firebase("https://blockchain-quiz.firebaseio.com/quiz/"+currentQuestion+"/choice1");
        choice1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice = dataSnapshot.getValue(String.class);
                button1.setText(choice);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        choice2 = new Firebase("https://blockchain-quiz.firebaseio.com/quiz/"+currentQuestion+"/choice2");
        choice2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice = dataSnapshot.getValue(String.class);
                button2.setText(choice);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        choice3 = new Firebase("https://blockchain-quiz.firebaseio.com/quiz/"+currentQuestion+"/choice3");
        choice3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice = dataSnapshot.getValue(String.class);
                button3.setText("A type of cryptocurrency");
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });


        choice4 = new Firebase("https://blockchain-quiz.firebaseio.com/quiz/"+currentQuestion+"/choice4");
        choice4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice = dataSnapshot.getValue(String.class);
                button4.setText(choice);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        selectedAnswer = new Firebase("https://blockchain-quiz.firebaseio.com/quiz/"+currentQuestion+"/answer");
        selectedAnswer.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                answer = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
        }






