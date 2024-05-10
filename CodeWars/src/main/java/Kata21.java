import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Kata21 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(between(1, 4));
    }
    public static int[] between(int a, int b) {
        int count = 0;
        while(true) {
            if(a == b + 1) {
                break;
            }
            count += 1;
            b--;
        }
        int[] res = new int[count];
        for(int i = 0; i < count; i++) {
            res[i] = a;
            a++;
        }
        return res;
    }
}
