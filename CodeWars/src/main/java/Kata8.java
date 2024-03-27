public class Kata8 {
    public static void main(String[] args) {
        System.out.println(fakeBin("12367"));

    }
    public static String fakeBin(String numberString) {
        StringBuilder string = new StringBuilder(numberString);
        for(int i = 0; i < numberString.length(); i++) {
            if(Integer.parseInt(numberString.substring(i, i+1)) < 5) {
                string.setCharAt(i, '0');
            } else if(Integer.parseInt(numberString.substring(i, i+1)) > 5) {
                string.setCharAt(i, '1');
            } else {
            }
        }
        return numberString;
    }
}
