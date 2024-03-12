package Enum;

public enum MemoryDriveType {
    HDD("HDD"), SSD("SSD");
    private String type;
    MemoryDriveType(String type) {
        this.type = type;
    }
    public String getMDType() {
        return type;
    }
}
