public class Kata6 {
    public static void main(String[] args) {
        System.out.println(nbYear(1500, 2.5, 100, 2000));
    }
    public static int nbYear(int p0, double percent, int aug, int p) {
        int yearsCount = 0;
        do {
            p0 += p0 *  (percent/100) + aug;
            yearsCount++;
        } while(p0 < p);
        return yearsCount;
    }
}
