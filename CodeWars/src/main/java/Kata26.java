public class Kata26 {
    public static void main(String[] args) {
        //An isogram is a word that has no repeating letters, consecutive or non-consecutive.
        //Implement a function that determines whether a string that contains only letters is an isogram.
        //Assume the empty string is an isogram. Ignore letter case.
        System.out.println(isIsogram("Asdfg"));
    }
    public static boolean  isIsogram(String str) {
        return str.toLowerCase().length() == str.toLowerCase().chars().distinct().count();
    }
}
