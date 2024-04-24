public class Kata14 {
    public static void main(String[] args) {
        System.out.println(feast("great blue heron","chocolate cake"));
    }
    public static boolean feast(String beast, String dish) {
        return beast.charAt(0) == dish.charAt(0);
    }
}
