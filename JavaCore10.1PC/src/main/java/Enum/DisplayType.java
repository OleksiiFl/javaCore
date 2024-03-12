package Enum;

public enum DisplayType {
    IPS("IPS"), TN("TN"), VA("VA");
    private String type;
    DisplayType(String type) {
        this.type = type;
    }
    public String getDisplayType() {
        return type;
    }
}
