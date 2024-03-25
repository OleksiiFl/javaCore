public class Kata1 {
    public static final String SPACE = "\\s";
    public static final String NON_SPACE = "\\S";

    public static void main(String[] args) {
        System.out.println(solution("  wef  fqef"));
    }
        public static String solution (String str){
            String result = "";
            for (int i = 1; i <= str.length(); i++) {
                result += str.charAt(str.length() - i);
            }
            return result;
        }


    /*public static String solutionTop(String str) {
        return new StringBuilder(str).reverse().toString();
    }*/
    }