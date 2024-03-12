package Enum;

public enum RAMWeight {
    LIGHT(44), MIDDLE(66), HEAVY(88);
    private double weight;
    RAMWeight(int weight) {
        this.weight = weight;
    }
    public double getRAMWeight() {
        return weight;
    }
}
