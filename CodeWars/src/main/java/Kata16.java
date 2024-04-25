import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Kata16 {
    public static void main(String[] args) {
        /*Given two arrays a and b write a function comp(a, b) (orcompSame(a, b)) that checks
        whether the two arrays have the "same" elements, with the same multiplicities
         (the multiplicity of a member is the number of times it appears).
         "Same" means, here, that the elements in b are the elements in a squared,
         regardless of the order.
        * */
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(compArrays(a, b));
    }
    public static boolean compArrays(int[] a, int[] b) {
        if((a.length == 0 || b.length == 0) || (a.length != b.length)) {
            return false;
        }
        int[] aa = Arrays.stream(a).map(x -> x*x).sorted().toArray();
        int[] bb = Arrays.stream(b).sorted().toArray();
        return Arrays.equals(aa, bb);
    }
    public static boolean comp(int[] a, int[] b) {
        if((a.length == 0 || b.length == 0) || (a.length != b.length)) {
            return false;
        }
        List<Integer> aa = new ArrayList<>();
        for(int i : a) {
            aa.add(i);
        }
        List<Integer> aaSquare = new ArrayList<>();
        for(int i : a) {
            aaSquare.add(i*i);
        }
        List<Integer> bb = new ArrayList<>();
        for(int i : b) {
            bb.add(i);
        }
        List<Integer> bbCopy = new ArrayList<>(bb);
        for(int i : aa) {
            if(bb.contains(i*i)) {
                Integer rem = i*i;
                bb.remove(rem);
            }
        }
        for(int i : bbCopy) {
            if(aaSquare.contains(i)) {
                Integer rem = i;
                aaSquare.remove(rem);
            }
        }
        return aaSquare.equals(bb);
    }
}
