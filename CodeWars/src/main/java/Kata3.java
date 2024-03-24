import java.util.Scanner;
public class Kata3 {
    public static void main(String[] args) {
        int r = new Scanner(System.in).nextInt();
        int f = 0 - r;
        System.out.println(f);
//        int[] array = {-44,2,77,934};
//        System.out.println(min(array) + "," + max(array));
    }
    public static int min(int[] list) {
        int a = Integer.MAX_VALUE;
        for (int i = 0; i < list.length; i++) {
            if(list[i] < a){
                a = list[i];
            }
        }
        return a;
    }
    public static int max(int[] list) {
        int a = Integer.MIN_VALUE;
        for (int i = 0; i < list.length; i++) {
            if(list[i] > a){
                a = list[i];
            }
        }
        return a;
    }
}
