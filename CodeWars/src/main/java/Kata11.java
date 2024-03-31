public class Kata11 {
    public static final String VOWELS = "[aeiou]";
    public static void main(String[] args) {
        System.out.println(sumOfVowels("wehgwiblaiebvlahrbvlWHB"));
    }
    public static int sumOfVowels(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(VOWELS.contains(str.substring(i, i+1))) {
                sum++;
            }
        }
        return sum;
    }
}
