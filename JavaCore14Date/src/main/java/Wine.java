import java.time.Period;
import java.time.LocalDate;
public class Wine {
    private String species;
    private String country;
    private String color;
    private LocalDate year;
    public Wine(){

    }
    public Wine(String species, String country, String color, LocalDate year) {
        this.species = species;
        this.country = country;
        this.color = color;
        this.year = year;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getYear() {
        return year;
    }
    public void setYear(LocalDate year) {
        this.year = year;
    }
    public void ageOfWine(LocalDate now) {
        System.out.println("Age of this perfect wine is "
                + Period.between(year, now).getYears() + " years");
    }
    @java.lang.Override
    public java.lang.String toString() {
        return "Wine{" +
                "species=" + species +
                ", country=" + country +
                ", color=" + color +
                ", year=" + year +
                '}';
    }
}
