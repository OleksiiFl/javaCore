package Keyboard;

public class Keyboard {
    private KeyboardType type;
    private Lighting lighting;
    private double weight;

    public Keyboard(KeyboardType type, Lighting lighting, double weight) {
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

    public Lighting getLighting() {
        return lighting;
    }

    public void setLighting(Lighting lighting) {
        this.lighting = lighting;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "type=" + type +
                ", lighting=" + lighting +
                ", weight=" + weight +
                '}';
    }
}

