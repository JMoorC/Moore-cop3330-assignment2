/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Moore
 */

package ex24;

import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner inScan = new Scanner(System.in);

        System.out.print("Enter two strings and I'll tell you if they're anagrams:\nEnter the first string:");
        String first = inScan.next();
        System.out.print("Enter the Second String:");
        String second = inScan.next();
        System.out.printf("\"%s\" and \"%s\" are ",first, second);
        if (!isAnagram(first, second) ){
            System.out.print("not ");
        }
        System.out.println("anagrams.");
    }

    static boolean isAnagram(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length() ){
            return false;
        }
        boolean isMatching = true;
        for (int i = 0; i < str1.length(); i++) {
            isMatching = str2.indexOf(str1.charAt(i)) != -1;
            if (!isMatching) {
                break;
            }
        }
        return isMatching;
    }

}
