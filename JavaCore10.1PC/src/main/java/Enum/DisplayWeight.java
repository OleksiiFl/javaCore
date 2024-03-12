package Enum;

public enum DisplayWeight {
    LIGHT(351), MIDDLE(399.2), HEAVY(423.5);
    private double weight;
    DisplayWeight(double weight) {
        this.weight = weight;
    }
    public double getDisplayWeight() {
        return weight;
    }
}
