public class Kata12 {
    public static void main(String[] args) {
        //to change repeated letters to ")" and unrepeated  to "("
        System.out.println(encode("Prespecialized"));
    }
    static String encode(String word){
        String result = "";
        for(int i = 0; i < word.length(); i++) {
            String a = word.substring(i, i+1).toLowerCase();
            if(word.substring(i+1).contains(a)) {
                result += ")";
            } else if(i !=0 && word.substring(0, i).toLowerCase().contains(a)) {
                result += ")";
            } else {
                result += "(";
            }
        }
        return result;
    }
}
