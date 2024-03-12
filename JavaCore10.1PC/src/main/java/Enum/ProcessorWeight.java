package Enum;

public enum ProcessorWeight {
    LIGHT(31.2),
    MIDDLE(67.9),
    HEAVY(111);
    private double procWeight;

    ProcessorWeight(double procWeight) {
        this.procWeight = procWeight;
    }
    public double getProcWeight(){
        return procWeight;
    }
}
