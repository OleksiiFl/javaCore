public class Kata10 {
    public static void main(String[] args) {
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
    }
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return phrase;
        }
        String[] split = phrase.split("\\s");
        StringBuilder result = new StringBuilder();
        //for(String s : split)
        for(String s : split){
            result.append(Character.toUpperCase(s.charAt(0)))
                    .append(s.substring(1).toLowerCase())
                    .append(" ");
        }
        return result.toString().trim();
    }
}
