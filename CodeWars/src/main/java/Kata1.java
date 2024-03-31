public class Kata1 {
    public static final String SPACE = "\\s";
    public static final String NON_SPACE = "\\S";

    public static void main(String[] args) {
        System.out.println(solution("  wef  fqef"));
        System.out.println(digitize(123345));

    }
        public static String solution (String str){
            String result = "";
            for (int i = 1; i <= str.length(); i++) {
                result += str.charAt(str.length() - i);
            }
            return result;
        }
    public static int[] digitize(long n) {
        String l = "" + n;
        int[] res = new int[l.length()];
        for(int i = 0; i < l.length(); i++) {
            res[i] = Integer.parseInt(l.substring(l.length() - i - 1, l.length() - i));
        }
        return res;
    }

    /*public static String solutionTop(String str) {
        return new StringBuilder(str).reverse().toString();
    }*/
    }