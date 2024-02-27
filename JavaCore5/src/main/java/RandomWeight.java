public class RandomWeight {
    public static void main(String[] args) {
        int[] array = new int[10];
        int max = 100;
        int min = 40;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Person " + (i + 1) + " is " + array[i] + "kG. ");
        }
        System.out.println("The average weight oh 10 people is:");
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average = average + array[i];
        }
        System.out.println(average / 10);
        int chosen = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 60 && array[i] <= 80) {
                chosen++;
            }
        }
        System.out.println("Amount of people between 60 and 80 kg is " + chosen + ".");

    }
}