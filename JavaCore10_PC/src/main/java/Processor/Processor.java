package Processor;

public class Processor {
    private Mark mark;
    private Frequency frequency;
    private Cores cores;
    private double weight;

    public Processor(Mark mark, Frequency frequency, Cores cores, double weight) {
        this.mark = mark;
        this.frequency = frequency;
        this.cores = cores;
        this.weight = weight;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public Cores getCores() {
        return cores;
    }

    public void setCores(Cores cores) {
        this.cores = cores;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "mark=" + mark +
                ", frequency=" + frequency +
                ", cores=" + cores +
                ", weight=" + weight +
                '}';
    }
}
