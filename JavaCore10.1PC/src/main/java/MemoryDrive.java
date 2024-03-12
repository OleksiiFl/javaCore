import Enum.MemoryDriveType;
import Enum.MemoryDriveCapacity;
import Enum.MemoryDriveWeight;
public class MemoryDrive {
    private String type;
    private int capacity;
    private double weight;
    public MemoryDrive(String type, int capacity, double weight) {
        this.type = type;
        this.capacity = capacity;
        this.weight = weight;
    }

    public String getMDType() {
        return type;
    }

    public void setMDType(String type) {
        this.type = type;
    }

    public int getMDCapacity() {
        return capacity;
    }

    public void setMDCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getMDWeight() {
        return weight;
    }

    public void setMDWeight(double weight) {
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
