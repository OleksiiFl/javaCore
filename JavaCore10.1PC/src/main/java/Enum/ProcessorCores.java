package Enum;

public enum ProcessorCores {
    ONE(1), TWO(2), FOUR(4);
    private int coresNumber;
    ProcessorCores(int value) {
        this.coresNumber = value;
    }
    public int getCoresNumber() {
        return coresNumber;
    }
}
