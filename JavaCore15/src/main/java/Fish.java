public class Fish extends Animal{
    public Fish() {
    }
    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }
    public void move() {
        System.out.println("The " + super.getName() + "-fish swims in depths of a river.");
    }
    public void fishGotCaught() {
        System.out.println(super.getName() + " is trying to break free.");
    }
    public void fishBreaksFree() {
        System.out.println("but " + super.getName() + " is too big.");
    }
    public void fishHunts() {
        System.out.print(super.getName() + " strikes it's prey. ");
    }
}
