package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number:");
        int input = new Scanner(System.in).nextInt();
        System.out.println("Average of all digits is " + avg(input));
        System.out.println("Sum of all digits is " + digital_root(input));

    }
    public static double avg(int number) {
        String inputString = String.valueOf(number);
        double sum = 0;
        for(int i = 0; i < inputString.length(); i++) {
            sum += Integer.parseInt(String.valueOf(inputString.charAt(i)));
        }
        return sum / inputString.length();
    }
    public static int digital_root(int n) {
        String input = String.valueOf(n);
        int sum = 0;
        for(int i = 0; i < input.length(); i++) {
            sum += Integer.parseInt(String.valueOf(input.charAt(i)));
        }
        while(sum > 9) {
            String sumStr = String.valueOf(sum);
            sum = 0;
            for(int i = 0; i < sumStr.length(); i++) {
                sum += Integer.parseInt(String.valueOf(sumStr.charAt(i)));
            }
        }
        return sum;
    }
}