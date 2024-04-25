import java.util.Map;
import java.util.TreeMap;

public class Kata17 {
    public static void main(String[] args) {
        /*The main idea is to count all the occurring characters in a string.
        If you have a string like aba, then the result should be {'a': 2, 'b': 1}.
        What if the string is empty? Then the result should be empty object literal, {}.
        * */
        System.out.println(count("arnryjwymeymtm"));
    }
    public static Map<Character, Integer> count(String str) {
        if(str == null) {
            return null;
        }
        char[] ch = str.toCharArray();
        Map<Character, Integer> result = new TreeMap<>();
        for(Character c : ch) {
            if(!result.containsKey(c)) {
                result.put(c, 1);
            } else {
                result.put(c, result.get(c)+1);
            }
        }
        return result;
    }
}
