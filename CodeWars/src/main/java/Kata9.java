public class Kata9 {
    public static void main(String[] args) {
        String[] ss = new String[]{"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"};
        System.out.println(points(ss));
    }
    public static int points(String[] games) {
        int sum = 0;
        for(String s : games) {
            if(Integer.valueOf(s.substring(0, 1)) > Integer.valueOf(s.substring(2))) {
                sum += 3;
            } else if(Integer.valueOf(s.substring(0, 1)) == Integer.valueOf(s.substring(2))) {
                sum += 1;
            } else {
            }
        }
        return sum;
    }
}
