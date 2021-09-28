/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Moore
 */

package ex34;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String[] roster = new String[5];
        roster[0] = "Taylor Voreson";
        roster[1] = "Mike Harding";
        roster[2] = "La-a Edwards";
        roster[3] = "Carmen Rosa";
        roster[4] = "Bufford McKinley";
        System.out.print(printRoster(roster) );

        Scanner inScan = new Scanner(System.in);
        System.out.print("Who needs to go? ");
        String remove = inScan.nextLine();

        roster = unPerson(roster, remove );
        System.out.print(printRoster(roster) );
    }

    public static String printRoster (String[] roster){
        String answer = "";
        int count = 0;
        for (int i = 0; i < roster.length; i++){
            if(roster[i].equals("") ){
                continue;
            }
            answer += roster[i] + "\n";
            count++;
        }
        answer = String.format("There are %d employees:\n", count ) + answer +"\n";
        return answer;
    }

    public static String[] unPerson(String[] roster, String name){
        for (int i = 0; i < roster.length; i++){
            if (roster[i].equals(name) ){
                roster[i] = "";
            }
        }
        System.out.println();
        return roster;
    }


}