import java.util.*;

public class Main {
    public static Map<String, Integer> competitorsList = new LinkedHashMap<>();
    public static void main(String[] args) {
        competitorsList.put("Софія Пірожик", 0);
        competitorsList.put("Анастасія Гаврилюк", 0);
        competitorsList.put("Марина Зажигай", 0);
        competitorsList.put("Софія Мартова", 0);
        competitorsList.put("Еміль Кривовязюк", 0);
        competitorsList.put("Христина Скуратовець", 0);
        competitorsList.put("Софія Зейдліц", 0);
        competitorsList.put("Валерія Романченко", 0);
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
        sortedArray();
    }
    public static void putValueToMap(String key,  int score) {
        competitorsList.put(key, competitorsList.get(key) + score);
    }
    public static void printResult() {
        for (Map.Entry<String, Integer> resultsEntry : competitorsList.entrySet()) {
            double score = resultsEntry.getValue();
            System.out.println(resultsEntry.getKey() + " - " + score / 6);
        }
    }
    public static void sortedArray() {
        Set<Integer> finalScores = new TreeSet<>(competitorsList.values());
        for(Integer i : finalScores) {
            System.out.println(i);
        }
    }
}
