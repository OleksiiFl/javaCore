package Package1;

public class Person {
    private String name;
    private String occupation;
    private String job;
    private int age;
    private int salary;

    public Person() {
    }
    public Person(String name, String occupation, String job, int age, int salary) {
        this.name = name;
        this.occupation = occupation;
        this.job = job;
        this.age = age;
        this.salary = salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public String getOccupation(){
        return occupation;
    }
    public String getJob(){
        return job;
    }
    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }


}
