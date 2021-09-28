/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Moore
 */

package ex28;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int answer = getSum();
        System.out.printf("The total is: %d.\n", answer);
    }

    public static int getSum(){
        Scanner inScan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++){
            System.out.print("Enter a Number: ");
            sum += inScan.nextInt();
        }
        return sum;
    }
}