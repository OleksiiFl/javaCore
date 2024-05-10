import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static Map<String, Integer> competitorsList = new LinkedHashMap<>();
    public static int juryNumber = 0;
    public static void main(String[] args) {
        setCompetitorsList();
        System.out.println("Вітаємо в програмі підрахунку результатів оцінювання конкурсу! Введіть кількість членів жюрі:");
        juryNumber = new Scanner(System.in).nextInt();
        while(true){
            System.out.println("Щоб додати бали введіть ім'я учасника та оцінки " +
                    "(кожну оцінку окремо, для переходу до іншого учасника натисніть 1). " +
                    "Для підрахунку результатів натисніть 0.");
            String inputName = new Scanner(System.in).nextLine();
            if (inputName.equals("0")) {
                break;
            }
            System.out.println("Оцінки:");
            while(true) {
                int inputScore = new Scanner(System.in).nextInt();
                putValueToMap(inputName, inputScore);
                if(inputScore == 1) break;
            }

        }
        printResult();
        resultInTreeMap();
        //sortedArray();
    }

    public static void setCompetitorsList() {
        competitorsList.put("Софія Пірожик", 0);
        competitorsList.put("Анастасія Гаврилюк", 0);
        competitorsList.put("Марина Зажигай", 0);
        competitorsList.put("Софія Мартова", 0);
        competitorsList.put("Еміль Кривовязюк", 0);
        competitorsList.put("Христина Скуратовець", 0);
        competitorsList.put("Софія Зейдліц", 0);
        competitorsList.put("Валерія Романченко", 0);
    }
    public static void putValueToMap(String key,  int score) {
        competitorsList.put(key, competitorsList.get(key) + score);
    }
    public static void printResult() {
        System.out.println("Загальна кількість балів:");
        for (Map.Entry<String, Integer> resultsEntry : competitorsList.entrySet()) {
            System.out.println(resultsEntry.getKey() + " - " + resultsEntry.getValue());
        }
    }
    public static void resultInTreeMap() {
        System.out.println("\nРейтинг по балам (від останнього місця):");
        competitorsList.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
        /*Map<String, Integer> rating = new TreeMap<>(competitorsList);
        for(Map.Entry<String, Integer> ratingEntry : rating.entrySet()) {
            double score = ratingEntry.getValue();
            System.out.println(ratingEntry.getKey() + " - " + ratingEntry.getValue() / juryNumber);
        }*/

    }
    public static void sortedArray() {
        System.out.println("Рейтинг по балам:");
        Set<Integer> finalScores = new TreeSet<>(competitorsList.values());
        Integer[] arr = finalScores.toArray(new Integer[0]);
        Arrays.sort(arr);
        for(Integer i : arr) {
            System.out.println(i);
        }
    }
}
