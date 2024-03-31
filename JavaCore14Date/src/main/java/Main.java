import java.time.Period;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        Wine wine = new Wine("Cabernet", "France", "Red", LocalDate.of(2022, 3, 4));
        wine.ageOfWine(now);
    }

}
