public class Kata4 {
    public static void main(String[] args) {
        int[] input = {};
        System.out.println(countPositivesSumNegatives(input));
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        int[] result = new int[2];
        if(input != null && input.length != 0) {
            for(int i = 0; i < input.length; i++) {
                if(input[i] > 0) {
                    result[0]++;
                }
                if(input[i] < 0) {
                    result[1] += input[i];
                }
            }
            return result;
        } else {
            return new int[]{};
        }
    }
}