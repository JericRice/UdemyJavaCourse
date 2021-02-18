package com.jerictech;

public class Main {

    public static void main(String[] args) {

        byte myByte = 5;
        short myShort = 100;
        int myInt = 3000;

        long myLong = 50_000L + (10L * (myByte + myInt + myShort));

        System.out.println("This is the final calculation needed : " + myLong);


    }
}
