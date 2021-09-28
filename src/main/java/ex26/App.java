/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Moore
 */

package ex26;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class App {

    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        System.out.print("What is your balance? ");
        double balance = parseDouble(inScan.next() );
        System.out.print("What is the APR on the card (as a percent)? ");
        double APR = parseDouble(inScan.next() );
        System.out.print("What is the monthly payment you can make? ");
        double payment = parseDouble(inScan.next() );

        int months = PaymentCalculator.calculateMonthsUntilPaidOff(balance, APR, payment);
        String output = String.format("It will take you %d months to pay off this card.\n", months);
        System.out.print(output);
    }
}