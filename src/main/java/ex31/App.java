/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Moore
 */

package ex31;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int heartRate = getHeartRate();
        int age = getAge();
        String answer = createChart(heartRate, age);
        System.out.print(answer);

    }

    public static int getHeartRate(){
        Scanner inScan = new Scanner(System.in);
        int answer = -1;
        while (answer == -1){
            System.out.print("Give your resting pulse: ");
            if (!inScan.hasNextInt() ){
                inScan.next();
                System.out.print("Input a proper value\n");
                continue;
            }
            answer = inScan.nextInt();
        }
        return answer;
    }

    public static int getAge(){
        Scanner inScan = new Scanner(System.in);
        int answer = -1;
        while (answer == -1){
            System.out.print("Give your age: ");
            if (!inScan.hasNextInt() ){
                inScan.next();
                System.out.print("Input a proper value.\n");
                continue;
            }
            answer = inScan.nextInt();
        }
        return answer;
    }

    public static int calcTarget(int age, int resting, int intensity){
        double intDecimal = intensity * .01;
        double target = ( ( (220 - age) - resting) * intDecimal ) + resting;
        return (int) Math.round(target);

    }

    public static String createChart(int resting, int age){
        String answer = String.format("Resting heart rate: %d. Age: %d.\n\n", resting, age);
        answer += "Intensity    | Rate\n_____________|________\n";
        for (int percent = 55; percent <= 95; percent += 5){
            answer += String.format("%2d%%          | %3d bpm\n",percent, calcTarget(age, resting, percent) );
        }
        return answer;

    }
}