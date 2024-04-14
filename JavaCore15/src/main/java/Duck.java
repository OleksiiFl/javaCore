public class Duck extends Animal{
    public Duck(){
    }
    public Duck(String name, int age, double weigth) {
        super(name, age, weigth);
    }
    public void move(){
        System.out.println("The duck " + super.getName() + " flies in the sky.");
    }
    public void catchFish() {
        System.out.print("The duck " + super.getName() + " managed to catch a fish. ");
    }
    public void cantCatchFish() {
        System.out.print("The duck " + super.getName() + " tried to catch a fish, ");
    }
    public void duckGotCaught() {
        System.out.println(super.getName() + " squeaks and disappears under water.");
    }
    public void duckBreaksFree() {
        System.out.println("Duck " + super.getName() + " chuckles and flies away.");
    }
}
