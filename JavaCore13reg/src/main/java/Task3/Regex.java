package Task3;

import java.util.Scanner;

public class Regex {
    public static final String VALID_NUMBER_FOR_UKRAINE = "(\\d+){12}";
    public static void main(String[] args) {
        System.out.println("Enter your phone number (Ukraine):");
        String inputNumber = new Scanner(System.in).nextLine();
        if(inputNumber.replaceAll("\\D", "").matches(VALID_NUMBER_FOR_UKRAINE)) {
            System.out.println("Press 1 - to print a simple phone number, press any other - to print a number with \"make-up\"");
            int a = new Scanner(System.in).nextInt();
            if(a == 1) {
                System.out.println(numberWithoutChars(inputNumber));
            } else {
                System.out.println(numberWithChars(inputNumber));
            }
        } else {
            System.out.println("Invalid number.");
        }

    }
    public static String numberWithChars(String input) {
        return input.replaceAll("\\D", "").replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "+$1-($2)-$3-$4-$5");
    }
    public static String numberWithoutChars(String input) {
        return input.replaceAll("\\D", "");
    }
}
