import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kata13Test {
    public static String high(String s) {
        if(s.length() == 1) {
            return s;
        }
        String abc = "1abcdefghijklmnopqrstuvwxyz";
        String[] word = s.split(" ");
        int[] sum = new int[s.length()];
        for(int a = 0; a < word.length; a++) {
            for (int i = 0; i < word[a].length(); i++) {
                sum[a] += abc.indexOf(word[a].charAt(i));
            }
        }
        int max = sum[0];
        for (int i = 0; i < sum.length; i++) {
            if(max == sum[i]) {
                continue;
            } else if(max < sum[i]) {
                max = sum[i];
            }
        }
        int index = -1;
        for (int i = 0; i < sum.length; i++) {
            if(sum[i] == max) {
                index = i;
                break;
            }
        }
        return word[index];
    }
    @Test
    public void sampleTests() {
        assertEquals("taxi", Kata13.high("man i need a taxi up to ubud"));
        assertEquals("volcano", Kata13.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", Kata13.high("take me to semynak"));
    }

    @Test
    public void edgeCaseTests() {
        assertEquals("aa", Kata13.high("aa b"));
        assertEquals("b", Kata13.high("b aa"));
        assertEquals("bb", Kata13.high("bb d"));
        assertEquals("d", Kata13.high("d bb"));
        assertEquals("aaa", Kata13.high("aaa b"));
    }
}