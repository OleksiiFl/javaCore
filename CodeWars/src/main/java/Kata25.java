import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kata25 {
    public static void main(String[] args) {
        //square every digit of a number and concatenate them.
        System.out.println(squareDigits(122));
    }
    public static int squareDigits(int n) {
        String s = String.valueOf(n);
        String res = "";
        for(int i = 0; i< s.length(); i++) {
            res += Integer.parseInt(s.substring(i, i+1))*Integer.parseInt(s.substring(i, i+1));
        }
        return Integer.parseInt(res);
    }

}
