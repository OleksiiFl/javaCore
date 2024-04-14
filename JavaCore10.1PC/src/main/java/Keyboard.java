import Enum.KeyboardType;
import Enum.KeyboardLighting;
public class Keyboard {
    private KeyboardType type;
    private KeyboardLighting lighting;
    private double weight;

    public Keyboard() {
    }

    public Keyboard(KeyboardType type, KeyboardLighting lighting, double weight) {
        this.type = type;
        this.lighting = lighting;
        this.weight = weight;
    }

    public KeyboardType getType() {
        return type;
    }

    public void setType(KeyboardType type) {
        this.type = type;
    }

    public KeyboardLighting getLighting() {
        return lighting;
    }

    public void setLighting(KeyboardLighting lighting) {
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
