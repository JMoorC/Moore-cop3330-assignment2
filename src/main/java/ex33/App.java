/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Moore
 */

package ex33;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        System.out.print("What's your question?\n>");
        inScan.next();
        System.out.printf("\n%s\n", retrieveFortune( (int) (Math.random() * 100) + 1) );
    }

    public static String retrieveFortune(int val){
        int interpVal = val % 4;
        String[] fortunes = new String[4];
        fortunes[1] = "Yes.";
        fortunes[2] = "No.";
        fortunes[3] = "Maybe.";
        fortunes[0] = "Try Again Later.";
        return fortunes[interpVal];
    }

}