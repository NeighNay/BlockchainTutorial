package com.nathan.blockchaintutorial;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.Random;

/**
 * Created by nathc on 18/03/2018.
 */

public class FactBook {
    //Fields or Member Variables - Properties about the object
    private Firebase fact;
    private String facts;


    // Methods - Actions the object can take
    public String getFact(){
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(8);


        fact = new Firebase("https://blockchain-quiz.firebaseio.com/facts/"+randomNumber+"/Fact");
        fact.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                facts = dataSnapshot.getValue(String.class);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }

        });
        return facts;
    }

}
