public class Kata18 {
    public static void main(String[] args) {
        /*You are going to be given an array of integers. Your job is to take that array and
        find an index N where the sum of the integers to the left of N is equal to the sum of the integers
        to the right of N. If there is no index that would make this happen, return -1.
        * */
        int[] arr = {20,10,-80,10,10,15,35};
        System.out.println(findEvenIndex(arr));
    }
    public static int findEvenIndex(int[] arr) {
        int left;
        int right;
        int index = 0;
        int changesCount = 0;
        for(int i = 0; i < arr.length; i++) {
            left = 0;
            right = 0;
            for (int j = 0; j < arr.length; j++) {
                if(j < i) {
                    left += arr[j];
                } else if(j > i) {
                    right += arr[j];
                }
            }
            if(left == right && i >= index && changesCount == 0) {
                index = i;
                changesCount++;
            }
            if(left != right && i == arr.length - 1 && changesCount == 0) index = -1;
        }
        return index;
    }
}
