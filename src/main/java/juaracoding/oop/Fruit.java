package com.juaracoding.oop;

public class Fruit {

    // state
    int grams;
    int calsPerGram;

    //behaviour

    int totalCalories() {
        return grams*calsPerGram;
    }

}
