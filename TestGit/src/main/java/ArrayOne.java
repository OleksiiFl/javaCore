import java.util.Random;

public class ArrayOne {
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
    }
}