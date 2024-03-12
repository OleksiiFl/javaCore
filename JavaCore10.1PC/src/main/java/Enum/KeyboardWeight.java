package Enum;

public enum KeyboardWeight {
    LIGHT(66.8), MIDDLE(87), HEAVY(101.1);
    private double weight;
    KeyboardWeight(double weight) {
        this.weight = weight;
    }
    public double getKeyboardWeight() {
        return weight;
    }
}
