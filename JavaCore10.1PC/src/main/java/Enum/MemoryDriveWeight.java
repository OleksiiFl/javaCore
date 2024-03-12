package Enum;

public enum MemoryDriveWeight {
    LIGHT(167.8), MIDDLE(234.1), HEAVY(300);
    private double weight;
    MemoryDriveWeight(double weight) {
        this.weight = weight;
    }
    public double getMDWeight() {
        return weight;
    }
}
