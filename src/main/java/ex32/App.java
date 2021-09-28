/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Moore
 */

package ex32;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int difficulty = getDifficulty();
        gameOn(difficulty);

    }

    public static void gameOn(int difficulty) {
        int target = (int) (Math.random() * Math.pow(10, difficulty) ) + 1;
        System.out.print("I have my number, what's your guess? ");
        int guess = getGuess();
        int accuracy = judgeGuess(guess, target);
        int guesses = 1;
        while (accuracy != 1){
            guess = getGuess();
            accuracy = judgeGuess(guess, target);
            guesses ++;
        }
        System.out.printf("You got it in %d guesses!\n\n", guesses);
        System.out.print("Do you want to play again (y/n)? ");
        Scanner inScan = new Scanner(System.in);
        String answer = inScan.next().toLowerCase();
        if (answer.equals("y") ){
            gameOn(getDifficulty() );
        }
    }

    public static int getDifficulty() {
        Scanner inScan = new Scanner(System.in);
        int answer = -1;
        while (answer == -1) {
            System.out.print("Enter difficulty level 1, 2, or 3: ");
            if (!inScan.hasNextInt()) {
                inScan.next();
                System.out.print("Input a proper value.\n");
                continue;
            }
            answer = inScan.nextInt();
            if (answer < 1 || answer > 3) {
                answer = -1;
                continue;
            }
        }
        return answer;
    }

    public static int judgeGuess(int guess, int target) {
        if (guess == -1){
            System.out.print("Not sure what that was, Guess Again: ");
            return 0;
        }
        if (guess < target) {
            System.out.print("Too low. Guess Again: ");
            return 0;
        }
        if (guess > target) {
            System.out.print("Too high. Guess Again: ");
            return 0;
        }
        return 1;
    }

    public static int getGuess(){
        Scanner inScan = new Scanner(System.in);

        if (!inScan.hasNextInt()) {
            inScan.next();
            System.out.print("\n");
            return -1;
        }
        int answer = inScan.nextInt();
        return answer;
    }

}