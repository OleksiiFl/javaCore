public class Kata22 {
    public static void main(String[] args) {
        String ss = "sss afjkj, fjwengewjn davjdmnv a fqefqe";
        System.out.println(findShort(ss));
    }
    public static int findShort(String s) {
        String[] split = s.split(" ");
        int len = Integer.MAX_VALUE;
        for(String st : split) {
            if(st.length() < len) {
                len = st.length();
            }
        }
        return len;
    }
}
