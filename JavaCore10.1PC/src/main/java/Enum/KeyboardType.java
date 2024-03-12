package Enum;

public enum KeyboardType {
    DUAL("ukr/eng languages"), SINGLE("only eng language");
    private String type;
    KeyboardType(String type) {
        this.type = type;
    }
    public String getKeyboardType() {
        return type;
    }
}
