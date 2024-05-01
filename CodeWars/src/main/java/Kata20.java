import java.sql.PreparedStatement;

public class Kata20 {

    public static void main(String[] args) {
        //break camel case

    }
    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}
