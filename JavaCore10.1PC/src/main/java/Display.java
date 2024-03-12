import Enum.DisplayType;
import Enum.DisplayDiagonal;
import Enum.DisplayWeight;
public class Display {
    private String type;
    private int diagonal;
    private double weight;

    public Display(String type, int diagonal, double weight) {
        this.type = type;
        this.diagonal = diagonal;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Display{" +
                "type=" + type +
                ", diagonal=" + diagonal +
                ", weight=" + weight +
                '}';
    }
}
