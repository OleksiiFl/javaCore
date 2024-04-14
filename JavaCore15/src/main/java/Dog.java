public class Dog extends Animal{
    public Dog() {
    }
    public Dog(String name, int age, double weigth) {
        super(name, age, weigth);
    }
    @Override
    public void move() {
        System.out.println("The dog " + super.getName() + " runs by the road.");
    }
}
