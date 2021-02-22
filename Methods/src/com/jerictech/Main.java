package com.jerictech;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("You final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;


        highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("You final score was " + highScore);

        displayHighScorePosition("James", calculateHighScorePosition(50));
        displayHighScorePosition("Hulk", calculateHighScorePosition(400));
        displayHighScorePosition("Tim", calculateHighScorePosition(900));
        displayHighScorePosition("Joe", calculateHighScorePosition(1500));






    }


    public static void displayHighScorePosition(String playerName,int playerPosition) {

            System.out.println(playerName + " managed to get into position " + playerPosition
                    + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else return 4;
    }

    // new method
    public static int calculateScore(boolean gameOver,int score,int levelCompleted, int bonus) {


        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }
}
