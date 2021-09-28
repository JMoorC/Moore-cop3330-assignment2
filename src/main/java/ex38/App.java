/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Moore
 */

package ex38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class App {

    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces:");
        ArrayList<Integer> firstList = new ArrayList<Integer>();
        String intake = inScan.nextLine();
        for (int i = 0; i < intake.length(); i ++){
            if (Character.isDigit(intake.charAt(i) ))
            firstList.add(parseInt(intake.substring(i, i+ 1) ) );
        }
        firstList = filterEvenNumbers(firstList);
        String answer = "The even numbers are:";
        for(int i = 0; i < firstList.size(); i++){
            answer += String.format(" %d", firstList.get(i) );
        }
        answer = answer + ".\n";
        System.out.print(answer);
    }

    public static ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> inList){
        for (int i = 0; i < inList.size(); i++ )
        {
            if (inList.get(i) % 2 == 1){
                inList.remove(i);
                i--;
            }
        }
        return inList;
    }

}