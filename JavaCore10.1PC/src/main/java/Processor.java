import Enum.ProcessorMark;
import Enum.ProcessorCores;
public class Processor {
    private ProcessorMark mark;
    private String frequency;
    private ProcessorCores cores;
    private double weight;

    public Processor() {
    }

    public Processor(ProcessorMark mark, String frequency, ProcessorCores cores, double weight) {
        this.mark = mark;
        this.frequency = frequency;
        this.cores = cores;
        this.weight = weight;
    }

    public ProcessorMark getMark() {
        return mark;
    }

    public void setMark(ProcessorMark mark) {
        this.mark = mark;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public ProcessorCores getCores() {
        return cores;
    }

    public void setCores(ProcessorCores cores) {
        this.cores = cores;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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
