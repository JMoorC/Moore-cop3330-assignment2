/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Moore
 */

package ex36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class App {

    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        ArrayList<Integer> numArray = new ArrayList<Integer>();
        String intake = "";
        while (!intake.equals("done") ){
            System.out.print("Enter a number: ");
            intake = inScan.next();
            if (intake.equals("done") ){
                break;
            }
            numArray.add(parseInt(intake) );
        }
        System.out.printf("Numbers: %d", numArray.get(0) );
        for (int i = 1; i < numArray.size(); i++){
            System.out.printf(", %s", numArray.get(i) );
        }
        System.out.print(".\n");
        System.out.printf("The average is %.1f.\n",average(numArray) );
        System.out.printf("The minimum is %d.\n", minimum(numArray) );
        System.out.printf("The maximum is %d.\n", maximum(numArray) );
        System.out.printf("The standard deviation is: %.2f.\n", stdDev(numArray) );

    }

    public static double average(ArrayList<Integer> inList){
        int sum = 0;
        for (int i = 0; i < inList.size(); i++ ){
            sum += inList.get(i);
        }
        return ( (double) sum) / inList.size() ;
    }

    public static int minimum(ArrayList<Integer> inList){
        Collections.sort(inList);
        return inList.get(0);
    }

    public static int maximum(ArrayList<Integer> inList){
        Collections.sort(inList);
        return inList.get(inList.size() - 1);
    }

    public static double stdDev(ArrayList<Integer> inList){
        double average = average(inList);
        double currentVal = 0.0;
        int size = inList.size();
        for (int i = 0; i < size; i++){
            currentVal += Math.pow(inList.get(i) - average, 2);
        }
        currentVal /= size;
        return Math.sqrt(currentVal);
    }

}