package Package1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Bob", "Driver", "Meest-delivery", 44, 900);

        Person person2 = new Person();
        person2.setName("John");
        person2.setAge(22);

        System.out.println(person1.getName() + " - " + person1.getOccupation());
        System.out.println(person2.getName());

        Person person3 = new Person();
        person3.setName("Sarah");
        person3.setOccupation("Nurse");

        System.out.println(person3.getName() + " - " + person3.getOccupation());
    }
}

