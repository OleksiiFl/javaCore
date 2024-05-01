import java.util.ArrayList;
import java.util.List;

public class Kata19 {
    public static void main(String[] args) {
        System.out.println(wave(" hello "));
    }

    public static String[] wave(String str) {
        if(str == null) return null;
        str.toLowerCase();
        List<String> res = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ') {
                if(i == 0) {
                    res.add(str.substring(i, i+1).toUpperCase() + str.substring(i+1).toLowerCase());
                    continue;
                }
                res.add(str.substring(0, i) + str.substring(i, i+1).toUpperCase()
                        + str.substring(i+1).toLowerCase());
            }
        }
        return res.toArray(new String[0]);
    }
}
