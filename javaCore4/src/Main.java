import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            int toadEyesCount = 0;
            int ravenBonesCount = 0;
            int ghoulTearsCount = 0;
            int dumplingsCount = 0;

            System.out.println("\t\tRecipe book of Tamriel.");
            System.out.println("Eaglesight elixir: 3 toad eyes + 1 raven bone.");
            System.out.println("Stamina elixir: 2 raven bones + 4 dumplings");
            System.out.println("Invisibility elixir: 7 ghoul tears + 1 dumpling");
            System.out.println("Forbidden elixir: 5 ghoul tears + 10 dumplings + 4 toad eyes + 3 raven bones");
            System.out.println("You can make your elixir. Use 1 for toad eyes, 2 for ghoul tears," +
                    "3 for raven bones and 4 for dumplings. To mix reagents press other key.");

            for(; true; ) {
                int aInput = new Scanner(System.in).nextInt();
                if(aInput == 1) {
                    toadEyesCount++;
                    System.out.println("You added " + toadEyesCount + " toad eyes.");
                } else if(aInput == 2) {
                    ghoulTearsCount++;
                    System.out.println("You added " + ghoulTearsCount + " ghoul tears.");
                } else if(aInput == 3) {
                    ravenBonesCount++;
                    System.out.println("You added " + ravenBonesCount + " raven bones.");
                } else if(aInput == 4) {
                    dumplingsCount++;
                    System.out.println("You added " + dumplingsCount + " dumplings.");
                } else {
                    break;
                }
            }

            if(toadEyesCount == 3 && ravenBonesCount == 1) {
                System.out.println("You've created the Eaglesight elixir!");
            } else if(ravenBonesCount == 2 && dumplingsCount ==4) {
                System.out.println("You've created the Stamina elixir!");
            } else if(ghoulTearsCount == 7 && dumplingsCount == 1 && toadEyesCount == 2) {
                System.out.println("You've created the Invisibility elixir!");
            } else if(ghoulTearsCount == 10 && dumplingsCount == 4 && toadEyesCount == 4 && ravenBonesCount == 3) {
                System.out.println("You've created the Forbidden elixir!");
            } else {
                System.out.println("Urgh! It smells so nasty!");
            }

        }

}
