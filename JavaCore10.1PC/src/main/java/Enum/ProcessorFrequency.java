package Enum;

public enum ProcessorFrequency {
    WEAK("1.7 GHz"), MIDDLE("2.6 GHz"), TOP("4.2 GHz");
    private String value;

    ProcessorFrequency(String value) {
        this.value = value;
    }
    public String getProcessorFrequency() {
        return value;
    }
}
