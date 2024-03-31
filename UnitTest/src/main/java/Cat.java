public class Cat {
    private String name;
    private String gender;
    private String color;
    private int age;

    public Cat(String name, String gender, String color, int age) {
        this.name = name;
        this.gender = gender;
        this.color = color;
        this.age = age;
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

    public String getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

}
