package Task1;

public class Main {
    public static void main(String[] args) {
        /*char[] list = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " - " + (int)list[i]);
        }*/
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < alphabet.length(); i++) {
            System.out.println(alphabet.substring(i, i+1) + " - " + (int)alphabet.charAt(i));
        }

    }
}

