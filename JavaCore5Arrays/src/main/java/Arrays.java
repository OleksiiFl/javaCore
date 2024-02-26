import java.util.Random;

public class Arrays {

    public static void main(String[] args) {
        int[] bankAge = new int[10];

        for (int i = 0; i < bankAge.length; i++) {
            bankAge[i] = new Random().nextInt(100);
            System.out.println(bankAge[i]);
        }
        double summ = 0;
        for (int i = 0; i < bankAge.length; i++) {
            summ += bankAge[i];
        }
        System.out.println(summ / bankAge.length);

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < array.length; i++) {
            int a = array.length - i;
            array[i] = a;
            System.out.println(array[i]);
        }
        System.out.println("sss " + array[2]);
    }
}
