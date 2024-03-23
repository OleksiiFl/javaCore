public class Regex {
    public static void main(String[] args) {
        System.out.println(phone("0991234567"));
    }
    public static String phone(String number) {
        return number.replaceAll("(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "($1)-$2-$3-$4");
    }
}
