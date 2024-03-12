import Display.Display;
import HardDisc.HardDisc;
import Keyboard.Keyboard;
import Processor.Processor;
import RAM.RandomAccessMemory;

public class Computer {
    public static final String VENDOR = "Acer";

    private Processor processor;
    private RandomAccessMemory ram;
    private HardDisc hardDisc;
    private Display display;
    private Keyboard keyboard;

    public Computer(Processor processor,
                    RandomAccessMemory ram,
                    HardDisc hardDisc,
                    Display display,
                    Keyboard keyboard) {
        this.processor = processor;
        this.ram = ram;
        this.hardDisc = hardDisc;
        this.display = display;
        this.keyboard = keyboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public RandomAccessMemory getRam() {
        return ram;
    }

    public void setRam(RandomAccessMemory ram) {
        this.ram = ram;
    }

    public HardDisc getHardDisc() {
        return hardDisc;
    }

    public void setHardDisc(HardDisc hardDisc) {
        this.hardDisc = hardDisc;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public double getSumWeight() {
        return (processor.getWeight() + ram.getWeight() + hardDisc.getWeight() + display.getWeight() + keyboard.getWeight());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", \nram=" + ram +
                ", \nhardDisc=" + hardDisc +
                ", \ndisplay=" + display +
                ", \nkeyboard=" + keyboard +
                '}';
    }
}
