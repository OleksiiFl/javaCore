public class Kata5Fuckata {
    public static void main(String[] args) {
        System.out.println(reverseWords("    "));
    }
    public static String reverseWords ( final String original){
        if (original.trim().isEmpty()) {
            return original;
        } else {
            String[] split = original.split("\\s");
            String res = "";
            for (String s : split) {
                StringBuilder sb = new StringBuilder(s);
                sb.reverse();
                res += sb.toString() + " ";
            }
            if(original.indexOf(' ') == 0 && original.lastIndexOf(' ') == original.length()-1) {
                return res + " ";
            } else if(original.indexOf(' ') == 0 && original.lastIndexOf(' ') != original.length()-1) {
                return " " + res.trim();
            } else if(original.indexOf(' ') != 0 && original.lastIndexOf(' ') == original.length()-1) {
                return res;
            } else {
                return res.trim();
            }

        }
    }
}
