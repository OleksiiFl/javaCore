package RAM;

public class RandomAccessMemory {
    private MemoryType type;
    private int capacity;
    private double weight;

    public RandomAccessMemory(MemoryType type, int capacity, double weight) {
        this.type = type;
        this.capacity = capacity;
        this.weight = weight;
    }

    public MemoryType getType() {
        return type;
    }

    public void setType(MemoryType type) {
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

    @Override
    public String toString() {
        return "RandomAccessMemory{" +
                "type=" + type +
                ", capacity=" + capacity +
                ", weight=" + weight +
                '}';
    }
}
