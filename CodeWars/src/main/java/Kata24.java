import java.util.stream.IntStream;

public class Kata24 {
    public static void main(String[] args) {
        //Count the number of divisors of a positive integer n.
        System.out.println(numberOfDivisors(1));
    }
    public static long numberOfDivisors(int n) {
        return IntStream
                .range(1, n+1)
                .filter(i -> n % i ==0)
                .count();
    }
}
