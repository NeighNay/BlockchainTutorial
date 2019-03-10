package com.nathan.blockchaintutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import org.w3c.dom.Text;

public class quizActivity extends AppCompatActivity {



    private TextView scoreDisplay;
    private TextView question;
    private String answer;
    private Button button1, button2, button3, button4;
    private int score = 0;
    private int currentQuestion = 0;
    private Firebase thisQuestion, choice1,choice2,choice3,choice4, selectedAnswer;

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

        nextQuestion();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button1.getText().equals(answer)){
                    score+=1;
                    currentQuestion+=1;
                    scoreDisplay.setText(""+score);
                    nextQuestion();
                }
                else{
                    currentQuestion+=1;
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
                    nextQuestion();
                }
                else{
                    currentQuestion+=1;
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
                    nextQuestion();
                }
                else{
                    currentQuestion+=1;
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
                    nextQuestion();
                }
                else{
                    currentQuestion+=1;
                    nextQuestion();
                }
            }
        });
    }

    public void nextQuestion(){
        thisQuestion = new Firebase("https://blockchain-quiz.firebaseio.com/"+currentQuestion+"/question");
        thisQuestion.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String getQuestion = dataSnapshot.getValue(String.class);
                question.setText(getQuestion);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        choice1 = new Firebase("https://blockchain-quiz.firebaseio.com/"+currentQuestion+"/choice1");
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

        choice2 = new Firebase("https://blockchain-quiz.firebaseio.com/"+currentQuestion+"/choice2");
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

        choice3 = new Firebase("https://blockchain-quiz.firebaseio.com/"+currentQuestion+"/choice3");
        choice3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice = dataSnapshot.getValue(String.class);
                button3.setText(choice);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });


        choice4 = new Firebase("https://blockchain-quiz.firebaseio.com/"+currentQuestion+"/choice4");
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

        selectedAnswer = new Firebase("https://blockchain-quiz.firebaseio.com/"+currentQuestion+"/answer");
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






