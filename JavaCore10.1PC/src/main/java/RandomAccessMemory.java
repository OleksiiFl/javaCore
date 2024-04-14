import Enum.RAMType;
import Enum.RAMCapacity;
public class RandomAccessMemory {
    private RAMType ramType;
    private RAMCapacity ramCapacity;
    private double ramWeight;

    public RandomAccessMemory() {
    }

    public RandomAccessMemory(RAMType ramType, RAMCapacity ramCapacity, double ramWeight) {
        this.ramType = ramType;
        this.ramCapacity = ramCapacity;
        this.ramWeight = ramWeight;
    }

    public RAMType getRamType() {
        return ramType;
    }

    public void setRamType(RAMType ramType) {
        this.ramType = ramType;
    }

    public RAMCapacity getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(RAMCapacity ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public double getRamWeight() {
        return ramWeight;
    }

    public void setRamWeight(double ramWeight) {
        this.ramWeight = ramWeight;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "RandomAccessMemory{" +
                "ramType=" + ramType +
                ", ramCapacity=" + ramCapacity +
                ", ramWeight=" + ramWeight +
                '}';
    }
}
