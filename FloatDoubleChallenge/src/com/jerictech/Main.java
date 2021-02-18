package com.jerictech;

/* Challenge - convert a given number of pounds to kg
    1 - Create a variable for pounds and assign appropriate number to it
    2 - Create a calculation for conversation from pounds to kg
    3 - Print result

 */


public class Main {

    public static void main(String[] args) {

        double pounds = 165;
        float kilograms;
        kilograms = (float) (pounds * 0.45359237);

        System.out.println("My wight in kilograms = " + kilograms);

    }
}
