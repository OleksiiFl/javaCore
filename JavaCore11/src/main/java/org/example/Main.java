package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number:");
        int input = new Scanner(System.in).nextInt();
        System.out.println("Average of all digits is " + avg(input));

    }
    public static double avg(int number) {
        String inputString = String.valueOf(number);
        double sum = 0;
        for(int i = 0; i < inputString.length(); i++) {
            sum += Integer.parseInt(String.valueOf(inputString.charAt(i)));
        }
        return sum / inputString.length();
    }
}