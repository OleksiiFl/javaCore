import Enum.RAMType;
import Enum.RAMCapacity;
import Enum.RAMWeight;
public class RandomAccessMemory {
    private String ramType;
    private String ramCapacity;
    private double ramWeight;

    public RandomAccessMemory(String ramType, String ramCapacity, double ramWeight) {
        this.ramType = ramType;
        this.ramCapacity = ramCapacity;
        this.ramWeight = ramWeight;
    }

    public String getRamType() {
        return ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    public String getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(String ramCapacity) {
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
