import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata28 {
    public static void main(String[] args) {
        //Given two integers a and b, which can be positive or negative,
        // find the sum of all the integers between and including them and return it.
        // If the two numbers are equal return a or b
    }
    public static int getSum(int a, int b) {
        if(a>b) {
            return Arrays.stream(IntStream.rangeClosed(b,a).toArray()).sum();
        }
        return Arrays.stream(IntStream.rangeClosed(a,b).toArray()).sum();
    }
}
