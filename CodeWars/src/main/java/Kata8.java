public class Kata8 {
    public static void main(String[] args) {
        System.out.println(replace("12367"));

    }

    public static String replace(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
    public static String fakeBin(String numberString) {
        StringBuilder string = new StringBuilder(numberString);
        for(int i = 0; i < string.length(); i++) {
            if(Integer.parseInt(string.substring(i, i+1)) < 5) {
                string.setCharAt(i, '0');
            } else {
                string.setCharAt(i, '1');
            }
        }
        return string.toString();
    }
}
