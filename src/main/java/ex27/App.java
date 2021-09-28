/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Moore
 */

package ex27;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner inScan = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String fName = inScan.next();
        System.out.print("Enter the last name: ");
        String lName = inScan.next();
        System.out.print("Enter the ZIP code: ");
        String zip = inScan.next();;
        System.out.print("Enter the employee id: ");
        String id = inScan.next();

        String answer = validateInput(fName, lName, id, zip);
        System.out.print(answer);
    }

    public static String validateFName(String fName) {
        String answer = "";
        if (fName.length() < 2) {
            answer += "The first name must be at least 2 characters long\n";
        }
        if (fName.equals("")) {
            answer += "the first name must be filled in.\n";
        }
        return answer;
    }

    public static String validateLName(String lName) {
        String answer = "";
        if (lName.length() < 2) {
            answer += "The last name must be at least 2 characters long\n";
        }
        if (lName.equals("")) {
            answer += "the last name must be filled in.\n";
        }
        return answer;
    }

    public static String validateID(String id){
        String warning = "The employee ID must be in the format AA-1234\n";
        if (id.length() != 7){
            return warning;
        }
        for (int i = 0; i < id.length(); i++ ) {
            if (i < 2) {
                if (!Character.isAlphabetic(id.charAt(i))) {
                    return warning;
                }
            }else if (i == 2) {
                if (id.charAt(i) != '-') {
                    return warning;
                }
            } else {
                if (!Character.isDigit(id.charAt(i))) {
                    return warning;
                }
            }
        }
        return "";
    }

    public static String validateZIP(String zip){
        String warning = "The zipcode must be a 5 digit number.\n";
        if (zip.length() != 5){
            return warning;
        }
        for (int i = 0; i < zip.length(); i++){
            if (!Character.isDigit(zip.charAt(i) ) ) {
                return warning;
            }
        }
        return "";
    }

    public static String validateInput(String fName, String lName, String id, String zip){
        String answer = "";
        answer += validateFName(fName);
        answer += validateLName(lName);
        answer += validateID(id);
        answer += validateZIP(zip);
        if (answer.equals("") ){
            answer = "There were no errors found.\n";
        }
        return(answer);
    }
}

