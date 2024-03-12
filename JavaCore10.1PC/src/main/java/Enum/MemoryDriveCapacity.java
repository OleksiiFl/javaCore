package Enum;

public enum MemoryDriveCapacity {
    MD256(256), MD512(512), MD1024(1024);
    private int capacity;
    MemoryDriveCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getMDCapacity() {
        return capacity;
    }
}
