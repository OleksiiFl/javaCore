import java.util.Scanner;
public class CoordinatesMethod {
    static int x = 0;
    static int y = 0;
    public static void main(String[] args) {
        greetings();
        while(true){
            int command = commandInput();
            if(command == 1) {
                y++;
            } else if(command == 2) {
                y--;
            } else if(command == 3) {
                x--;
            } else if(command == 4) {
                x++;
            } else if(command == 5) {
                positionInfo();
            } else {
                invCom();
            }
        }
    }
    public static void greetings() {
        System.out.println("Hello! This is the coordinates system moving program. " +
                "\nIf you want to move up - press 1. If you want to move down - press 2." +
                "\nIf you want to move left - press 3. If you want to move right - press 4." +
                "\nTo show your position press 5.");
    }
    private static int commandInput() {
        System.out.println("Up - 1, down - 2, left - 3, right - 4, position - 5.");
        return new Scanner(System.in).nextInt();
    }
    private static void positionInfo() {
        System.out.println("Your position is: " + y + " by vertical and " + x + " by horizontal.");
    }
    private static void invCom() {
        System.out.println("Invalid command");
    }
}
