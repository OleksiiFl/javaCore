import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<String> todo = new ArrayList();

    public static void main(String[] args) {
        System.out.println("Welcome to your ToDo list! ");
        while(true) {
            System.out.println("To add a case - press 1. To remove a case by index - press 2. To remove a case by meaning - press 3." +
                    "\nTo set on some case to chosen index - press 4. To show the ToDo list - press 5. Finish - press 0.");
            int command = new Scanner(System.in).nextInt();
            if (command == 1) {
                System.out.println("Print on a description:");
                String input = new Scanner(System.in).nextLine();
                addTodo(input);
            } else if (command == 2) {
                System.out.println("What case would you like to remove by index?");
                int input = new Scanner(System.in).nextInt();
                removeTodoByIndex(input);
            } else if (command == 3) {
                System.out.println("What case would you like to remove? Print a description.");
                String input = new Scanner(System.in).nextLine();
                removeTodoByObject(input);
            } else if (command == 4) {
                System.out.println("Choose a index of case you want to set on.");
                int index = new Scanner(System.in).nextInt();
                if(index >= todo.size()) {
                    System.out.println("Index " + index + " is out of bounds!");
                    continue;
                }
                System.out.println("Print on a description of case you would like to set on:");
                String input = new Scanner(System.in).nextLine();
                if(todo.contains(input)) {
                    System.out.println("The ToDo list already contains this case.");
                    continue;
                }
                setTodo(index, input);
            } else if (command == 5) {
                for (int i = 0; i < todo.size(); i++) {
                    System.out.println(todo.get(i));
                }
            } else if(command == 0){
                System.out.println("Good luck and have a good time!");
                break;
            } else {
                System.out.println("Invalid command.");
            }
        }
    }
    public static void addTodo(String input) {
        if(!todo.contains(input)) {
            todo.add(input);
            System.out.println(input + " was successfully added to ToDo list.");
        } else {
            System.out.println("The ToDo list already contains equal case.");
        }

    }
    public static void removeTodoByIndex(int index) {
        if(index >= todo.size()) {
            System.out.println("Index" + index + " is out of bounds!");
        }
        todo.remove(index);
        System.out.println("ToDo with index" + index + " was successfully removed of ToDo list.");
    }
    public static void removeTodoByObject(String object) {
        if(!todo.contains(object)) {
            System.out.println("There is no case \"" + object + "\" in ToDo list.");
        }
        todo.remove(object);
        System.out.println("ToDo \"" + object + "\" was successfully removed of ToDo list.");
    }
    public static void setTodo(int index, String object) {
            todo.set(index, object);
            System.out.println("You've changed case with index " + index + " to \"" + object +"\".");
    }
}
