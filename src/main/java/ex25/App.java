/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Moore
 */

package ex25;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        prompt("What is your password?");
        String password = inTake();
        String answer = strengthRating(checkStrength(password) );
        String output = String.format("'%s' is a %s password.\n", password, answer);
        prompt(output);
    }

    public static int checkStrength(String str){

        boolean letterFlag = false;
        boolean specialFlag = false;
        boolean numberFlag = false;
        boolean lengthFlag = str.length() >= 8;
        for (int i = 0; i < str.length(); i++){

            if (Character.isAlphabetic(str.charAt(i) ) ){
                letterFlag = true;
            }
            else if (Character.isDigit(str.charAt(i) ) ){
                numberFlag = true;
            }
            else {
                specialFlag = true;
            }
        }

        if (letterFlag && numberFlag && specialFlag && lengthFlag){
            return 4;
        }
        if (letterFlag && numberFlag && lengthFlag){
            return 3;
        }
        if (letterFlag && !lengthFlag && !numberFlag && !specialFlag){
            return 1;
        }
        if (numberFlag && !lengthFlag && !letterFlag && !specialFlag){
            return 0;
        }
        return 2;
    }

    public static String strengthRating(int strength) {
        return switch (strength) {
            case 0 -> "very weak";
            case 1 -> "weak";
            case 2 -> "moderate";
            case 3 -> "strong";
            case 4 -> "very strong";
            default -> "very weak";
        };
    }

    public static void prompt(String str){
        System.out.print(str);
    }

    public static String inTake(){
        Scanner inScan = new Scanner(System.in);
        return inScan.next();
    }
}