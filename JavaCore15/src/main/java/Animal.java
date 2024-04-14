public abstract class Animal {
    private String name;
    private Integer age;
    private Double weight;

    public Animal() {
    }

    public Animal(String name, int age, double weugth) {
        this.name = name;
        this.age = age;
        this.weight = weugth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weugth) {
        this.weight = weugth;
    }
    public abstract void move();
}
