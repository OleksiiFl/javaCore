import java.util.Random;

public class ArraysTask {
    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10);
            System.out.println(array[i]);
        }
        System.out.println("From back to beginning:");
        for (int i = array.length - 1; i > -1; i = i - 1) {
            System.out.println(array[i]);
        }

    }

}
