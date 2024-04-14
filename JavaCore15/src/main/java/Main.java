public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 7, 18.2);
        Duck duckElder = new Duck("Donald", 10, 6.0);
        Duck duckJunior = new Duck("Bait", 1, 1.0);
        Fish pike = new Fish("Pike", 8, 6.0);
        Fish roach = new Fish("Roach", 2, 0.4);

        huntingDuck(duckElder.getWeight(), roach.getWeight(), duckElder, roach);
        huntingFish(pike.getWeight(), duckJunior.getWeight(), pike, duckJunior);
        dog.move();
    }
    public static void huntingDuck(double duckWeight, double fishWeight, Duck duck, Fish fish) {
        if(duckWeight >= 4 && fishWeight <= 0.5){
            duck.catchFish();
            fish.fishGotCaught();
        } else {
            duck.cantCatchFish();
            fish.fishBreaksFree();
        }
    }
    public static void huntingFish(double fishWeight, double duckWeight,  Fish fish, Duck duck) {
        fish.fishHunts();
        if(fishWeight < duckWeight){
            duck.duckBreaksFree();
        } else {
            duck.duckGotCaught();
        }
    }
}
