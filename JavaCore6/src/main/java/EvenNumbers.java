import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {
        evenOdd();
    }
    public static void evenOdd() {
        System.out.println(input() % 2 == 0);
    }
    public static int input() {
        System.out.println("Enter your number:");
        return new Scanner(System.in).nextInt();
    }
}
