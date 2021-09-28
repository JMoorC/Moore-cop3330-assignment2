/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Moore
 */

package ex29;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int givenRate = loopIt();
        System.out.printf("It will take %d years to double your initial investment.\n", getYears(givenRate) );
    }

    public static int loopIt(){
        Scanner inScan = new Scanner(System.in);
        int rate = -1;
        while (rate == -1.0) {
            System.out.print("What is the rate of return? ");
            // String holder = inScan.next()
            if(!inScan.hasNextInt() ){
                System.out.print("You need to give a proper input.\n");
                inScan.next();
                continue;
            }
            if ( (rate = inScan.nextInt() ) == 0) {
                rate = -1;
            }
        }
        return rate;
    }

    public static int getYears(int rate){
        return (int) Math.ceil(72.0 / rate);
    }
}