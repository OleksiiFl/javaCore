import java.util.Random;

public class ArraysTask {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("From back to beginning:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        System.out.println("---------------------");
        for (int i = 0; i < array.length; i++) {
            int a = array.length - i;
            array[i] = a;
            System.out.println(array[i]);
        }
        System.out.println("sss " + array[2]);

    }
}
