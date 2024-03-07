import java.util.Scanner;

public class Orchestra {
    static String city;
    String name;
    String instrument;
    int age;
    public Orchestra(){
    }
    public Orchestra(String name, String instrument, int age){
        this.name = name;
        this.instrument = instrument;
        this.age = age;
    }
    public void artistName(String artName){
        System.out.println("Enter an artist's name:");
        artName = new Scanner(System.in).nextLine();
        this.name = artName;
    }
    public void artistInstrument(String artInst){
        System.out.println("Enter an artist's instrument:");
        artInst = new Scanner(System.in).nextLine();
        this.instrument = artInst;
    }
    public void artistAge(int artAge){
        System.out.println("Enter an artist's age:");
        artAge = new Scanner(System.in).nextInt();
        this.age = artAge;
    }
    public void artistInfo(String name, String instrument, int age){
        System.out.println("Enter an artist's name:");
        name = new Scanner(System.in).nextLine();
        this.name = name;
        System.out.println("Enter an artist's instrument:");
        instrument = new Scanner(System.in).nextLine();
        this.instrument = instrument;
        System.out.println("Enter an artist's age:");
        age = new Scanner(System.in).nextInt();
        this.age = age;
    }
    public void printArtist() {
        System.out.println(name + " is " + age + " and plays " + instrument);
    }
}
