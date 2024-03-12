package Enum;

public enum RAMType {
    DDR2("DDR2"), DDR3("DDR3"), DDR4("DDR4");
    private String type;
    RAMType(String type) {
        this.type = type;
    }
    public String getRAMType() {
        return type;
    }
}
