import java.util.Scanner;
public class Method {
    static int[] array = new int[10];
    public static void main(String[] args) {
        arrayOrder();
        for(int i = 0; i < array.length; i++) {
            array[i] = numInput();
        }
        System.out.println("Full array list is:");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void arrayOrder() {
        for(int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }
    public static int numInput() {
        System.out.println("Enter your number:");
        return new Scanner(System.in).nextInt();
    }
}
