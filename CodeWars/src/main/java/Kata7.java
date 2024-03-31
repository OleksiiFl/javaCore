public class Kata7 {
    public static final String REGEX = "(\\w+\\s)(\\w+)";


    public static void main(String[] args) {
       // System.out.println(abbrevName("www sss"));
        long l = 11111;
        System.out.println(l);
    }
    public static String abbrevName(String name) {
        String[] split = name.split(" ");
        if(name.matches(REGEX)) {
            return (split[0].charAt(0) +"." + split[1].charAt(1)).toUpperCase();
        } else {
            return "Invalid input";
        }
        }
    }
