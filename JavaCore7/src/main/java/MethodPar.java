import java.util.Scanner;

public class MethodPar {

    static String bookName = "";

    public static void main(String[] args) {
        while (true) {
            String name = inputName();
            int page = inputPage();
            double price = inputPrice();
//            newName(name);
            newName(name, page, price);
            print();
        }
    }

    public static String inputName() {
        System.out.println("Enter a book name:");
        return new Scanner(System.in).nextLine();
    }
    public static int inputPage() {
        System.out.println("Enter amount of pages:");
        return new Scanner(System.in).nextInt();
    }
    public static double inputPrice() {
        System.out.println("Enter a price of the book:");
        return new Scanner(System.in).nextDouble();
    }
//    public static void newName(String newBook) {
//        newName(newBook, 0, 0);
//    }
    public static void newName(String newBook, int pageQuantity, double bookPrice) {
        bookName = bookName + newBook + " - " + (pageQuantity > 0 ? pageQuantity : "N/A") + "p. " +
                "It's price is " + (bookPrice > 0 ? bookPrice + "$\n" : "N/A\n");
    }
    public static void print() {
        System.out.println(bookName);
    }
}