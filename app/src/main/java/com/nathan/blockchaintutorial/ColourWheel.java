package com.nathan.blockchaintutorial;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by nathc on 15/04/2018.
 */

public class ColourWheel {
    //Fields or Member Variables - Properties about the object
    private final String[] colours ={
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };


    // Methods - Actions the object can take
    int getColor(){
        //Randomly select a colour
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colours.length);
  
        return Color.parseColor(colours[randomNumber]);

    }
}
