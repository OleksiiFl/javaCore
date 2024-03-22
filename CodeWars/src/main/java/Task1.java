public class Task1 {
    public static void main(String[] args) {
        System.out.println(solution("treasure"));
    }
    public static String solution(String str) {
        String result = "";
        for(int i = 1; i <= str.length(); i++) {
            result += str.charAt(str.length()-i);
        }
        return result;
    }
    /*public static String solutionTop(String str) {
        return new StringBuilder(str).reverse().toString();
    }*/
}
