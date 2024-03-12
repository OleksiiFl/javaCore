package Enum;

public enum RAMCapacity {
    RAM8("8 Gb"), RAM16("16 Gb"), RAM32("32 Gb");
    private String value;
    RAMCapacity(String value) {
        this.value = value;
    }
    public String getRAMValue() {
        return value;
    }
}
