import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = new Scanner(System.in).nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println("time of " + i);
            if (i == a) {
                break;
            }
        }

        boolean isGo = true;
        while(isGo) {
            System.out.println("Do you want to try again? 1/0");
            int go = new Scanner(System.in).nextInt();
            if(go != 1) {
                isGo = false;
                System.out.println("Ok.");
            }
        }
    }
}