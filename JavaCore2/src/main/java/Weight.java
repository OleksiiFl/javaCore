import java.util.Scanner;

public class Weight {

    public static void main(String[] args) {

        System.out.println("Enter first weight:");
        int weight1 = new Scanner(System.in).nextInt();
        System.out.println("Enter second weight:");
        int weight2 = new Scanner(System.in).nextInt();
        System.out.println("Enter third weight:");
        int weight3 = new Scanner(System.in).nextInt();

        if (weight1 > weight2 && weight1 > weight3) {
            System.out.println("The max weight is " + weight1);
        } else if (weight2 > weight1 && weight2 > weight3) {
            System.out.println("The max weight is " + weight2);
        } else {
            System.out.println("The max weight is " + weight3);
        }

        System.out.println("The average weight is " + (weight1 + weight2 + weight3) / 3);

        if (weight1 < weight2 && weight1 < weight3) {
            System.out.println("The min weight is " + weight1);
        } else if (weight2 < weight1 && weight2 < weight3) {
            System.out.println("The min weight is " + weight2);
        } else {
            System.out.println("The min weight is " + weight3);
        }
    }
}