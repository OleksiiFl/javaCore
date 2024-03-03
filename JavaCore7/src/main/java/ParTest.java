import java.util.Scanner;

public class ParTest {

    static java.lang.String myInfo = "";

    public static void main(String[] args) {
        while (true){
            String name = nameInput();
            int age = ageInput();
            program(name, age);
            print();
        }

    }
    public static String nameInput() {
        System.out.println("Hello! What is your name?");
        return new Scanner(System.in).nextLine();
    }
    public static int ageInput() {
        System.out.println("What is your age?");
        return new Scanner(System.in).nextInt();
    }
    public static void program(String nameInp, int ageInp) {
        myInfo = myInfo + "I am " + nameInp + " " + ageInp + "\n";
    }
    public static void print() {
        System.out.println(myInfo );
    }
}
