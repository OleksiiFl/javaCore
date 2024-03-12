import Enum.KeyboardType;
import Enum.KeyboardLighting;
import Enum.KeyboardWeight;
public class Keyboard {
    private String type;
    private String lighting;
    private double weight;

    public Keyboard(String type, String lighting, double weight) {
        this.type = type;
        this.lighting = lighting;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLighting() {
        return lighting;
    }

    public void setLighting(String lighting) {
        this.lighting = lighting;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Keyboard{" +
                "type=" + type +
                ", lighting=" + lighting +
                ", weight=" + weight +
                '}';
    }
}
