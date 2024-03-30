import java.util.Scanner;

public class Task2 {
    public static final String VALID_REGEX = "(([А-яіІєЄ'-]+\\s){2}([А-яіІєЄ'-]+))" ;
    public static void main(String[] args) {
        System.out.println("Введіть Ваше ім'я:");
        String input = new Scanner(System.in).nextLine().trim();
        if(input.matches(VALID_REGEX)) {
            String[] split = input.split("\\s+");
            System.out.println("Ім'я - " + split[0]);
            System.out.println("По-батькові - " + split[1]);
            System.out.println("Прізвище - " + split[2]);
        } else {
            System.out.println("Формат невірний!");
        }
    }
}
