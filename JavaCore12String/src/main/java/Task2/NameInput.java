package Task2;

import java.util.Scanner;

public class NameInput {
    public static final String VALID_SYMBOLS = " -abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        System.out.println("Enter your full name:");
        String input = new Scanner(System.in).nextLine().trim();
        boolean isValid = true;
        int spaceCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ' ') {
                spaceCount++;
            }
            if(!VALID_SYMBOLS.contains(String.valueOf(input.charAt(i)))) {
                isValid = false;
                break;
            }
        }
        if(isValid && spaceCount <= 2) {
            System.out.println("First name: " + input.substring(0, input.indexOf(' ')).trim());
            System.out.println("Mid name: " + input.substring(input.indexOf(' '), input.lastIndexOf(' ')).trim());
            System.out.println("Second name: " + input.substring(input.lastIndexOf(' ')).trim());
        } else {
            System.out.println("Invalid text");
        }
    }
}
