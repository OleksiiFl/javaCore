import Enum.DisplayType;
public class Display {
    private DisplayType type;
    private int diagonal;
    private double weight;

    public Display() {
    }

    public Display(DisplayType type, int diagonal, double weight) {
        this.type = type;
        this.diagonal = diagonal;
        this.weight = weight;
    }

    public DisplayType getType() {
        return type;
    }

    public void setType(DisplayType type) {
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
