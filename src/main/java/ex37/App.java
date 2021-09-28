/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Moore
 */

package ex37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class App {

    public static void main(String[] args){

        Scanner inScan = new Scanner(System.in);

        System.out.print("What is the minimum legnth? ");
        int minLen = inScan.nextInt();
        System.out.print("How many special characters? ");
        int numSpecs = inScan.nextInt();
        System.out.print("How many Numbers? ");
        int numNums = inScan.nextInt();

        String password = generatePass(minLen, numSpecs, numNums);
        System.out.printf("Your password is: %s\n", password);
    }

    public static String generatePass(int minLen, int numSpecs, int numNums){
        String answer = "";
        int letterCount = numNums + numSpecs;
        while (answer.length() < minLen || (numSpecs > 0 && numNums > 0) || letterCount > 0){
            boolean mark = coinFlip();
            if (mark){
                answer += getAlpha();
                letterCount--;
                continue;
            }
            mark = coinFlip();
            if (mark || (numNums == 0 && numSpecs > 0) ) {
                answer += getSpecial();
                numSpecs--;
                continue;
            }
            else if (numNums > 0) {
                answer += getNum();
                numNums--;
                continue;
            }
            answer += getAlpha();
            letterCount--;
        }
        return answer;
    }

    public static int seed(){
        return  (int) (Math.random() * 1000) + 1;
    }

    public static char getSpecial(){
        char[] array = {'!', '"', '"', '#', '$', '%', '&', '\'', '(', ')', '+', '+', ',', '-', '.', '/', ':',
                '<', '=', '>', '?', '@', '[', '^', '_', '|','~'};
        int size = array.length;
        return array[seed() % size];
    }

    public static char getNum(){
        char selection = (char) ( seed() % 10 + 48);
        return selection;
    }

    public static char getAlpha(){
        if (seed() %2 == 0) {
            return (char) (seed() % 26 + 97);
        }
        return (char) (seed() % 26 + 65);
    }

    public static boolean coinFlip(){
        if ( seed() % 2 == 0){
            return true;
        }
        return false;
    }
}