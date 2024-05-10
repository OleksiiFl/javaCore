import java.util.stream.Stream;

public class Kata23 {
    public static void main(String[] args) {
        //equal count of 'x' and 'o' - true
        System.out.println(getXO("xoXdefqeoxxxjtmo"));
    }
    public static boolean getXO (String str) {
        int score = 0;
        for(char x : str.toCharArray()) {
            if(Character.toLowerCase(x) == 'x') score++;
            if(Character.toLowerCase(x) == 'o') score--;
        }
        return score == 0;
    }
}
