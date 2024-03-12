import Enum.ProcessorCores;
import Enum.ProcessorFrequency;
import Enum.ProcessorMark;
import Enum.ProcessorWeight;
public class Processor {
    private String mark;
    private String frequency;
    private int cores;
    private double weight;

        public Processor(String mark, String frequency, int cores, double weight) {
        this.mark = mark;
        this.frequency = frequency;
        this.cores = cores;
        this.weight = weight;
    }
    public int getCores() {
        return cores;
    }
    public double getWeight() {
        return weight;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Processor{" +
                "mark=" + mark +
                ", frequency=" + frequency +
                ", cores=" + cores +
                ", weight=" + weight +
                '}';
    }
}
