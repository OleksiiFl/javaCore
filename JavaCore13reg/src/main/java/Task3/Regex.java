package Task3;

import java.util.Scanner;

public class Regex {
    public static final String FULL_VALID_PHONE_NUMBER_UA = "(\\d+){12}";
    public static final String SHORT_VALID_PHONE_NUMBER_UA = "(\\d+){10}";
    public static void main(String[] args) {
        System.out.println("Enter your phone number (Ukraine):");
        String inputNumber = new Scanner(System.in).nextLine();
        if(inputNumber.replaceAll("\\D", "").matches(FULL_VALID_PHONE_NUMBER_UA)) {
            System.out.println(numberWithChars(inputNumber));
        } else if(inputNumber.replaceAll("\\D", "").matches(SHORT_VALID_PHONE_NUMBER_UA)) {
            inputNumber = "38" + inputNumber;
            System.out.println(numberWithChars(inputNumber));
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
