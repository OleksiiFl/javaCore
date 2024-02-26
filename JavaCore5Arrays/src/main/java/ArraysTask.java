import java.util.Random;

public class ArraysTask {
    public static void main(String[] args) {

//        int[] array = {1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//        System.out.println("From back to beginning:");
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.println(array[i]);
//        }
//        System.out.println("---------------------");
//        int[] array = new int[10];
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < array.length / 2; i++) {
//            array[i] = new Random().nextInt(20);
            int a = array[i];
            array[i] = array[array.length - (1 + i)];
            array[array.length - (1 + i)] = a;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
