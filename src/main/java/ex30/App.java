/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Moore
 */

package ex30;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String answer = loopTable();
        System.out.println(answer);

    }

    public static String loopTable(){{
        String answer = "";
        for (int i = 1; i <= 12; i++){
            for (int j = 1; j <= 12; j++ ){
                answer += String.format("%3d ", i * j);
            }
            answer += "\n";
        }
        return answer;
    }

    }
}