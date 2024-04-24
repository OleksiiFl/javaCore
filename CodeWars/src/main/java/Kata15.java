import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Kata15 {
    /*  Given an array of integers, find the one that appears an odd number of times.
        There will always be only one integer that appears an odd number of times.
        [0] should return 0, because it occurs 1 time (which is odd).
        [1,1,2] should return 2, because it occurs 1 time (which is odd).
        [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
        [ 1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
    * */
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1,5,4,3,2,10,10};
        System.out.println(findIt(array));
    }
        public static int findIt(int[] a) {
            if(a.length == 1) {
                return a[0];
            } else if (a.length == 3) {
                return a[1] == a[2] ? a[0] : a[0] == a[2] ? a[1] : a[2];
            }
            Map<Integer, Integer> count = new HashMap<>();
            for(int i : a) {
                if(!count.containsKey(i)) {
                    count.put(i, 1);
                } else {
                    count.replace(i, count.get(i)+1);
                }
            }
            Set<Integer> set = count.keySet();
            System.out.println(count);
            for (Integer i : set) {
                System.out.println(count.get(i));
            }


            return 1;
        }
    }
