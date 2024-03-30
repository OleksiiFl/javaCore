package Task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        System.out.println(result(input));
        //
    }
    public static String result(String input) {
        input = input.replaceAll("\\s+", "\n");
        return input.replaceAll("[/=')(–.,;:!?-]", "");
    }
}
