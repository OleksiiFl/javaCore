import Enum.MemoryDriveType;
public class MemoryDrive {
    private MemoryDriveType type;
    private int capacity;
    private double weight;

    public MemoryDrive() {
    }

    public MemoryDrive(MemoryDriveType type, int capacity, double weight) {
        this.type = type;
        this.capacity = capacity;
        this.weight = weight;
    }

    public MemoryDriveType getType() {
        return type;
    }

    public void setType(MemoryDriveType type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "MemoryDrive{" +
                "type=" + type +
                ", capacity=" + capacity +
                ", weight=" + weight +
                '}';
    }
}
