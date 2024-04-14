public class Kata13 {
    public static void main(String[] args) {
        //Given a string of words, you need to find the highest scoring word.
        // Each letter of a word scores points according to its position in the alphabet:
        // a = 1, b = 2, c = 3 etc.
        System.out.println(high("b aa cx"));
    }
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
}
