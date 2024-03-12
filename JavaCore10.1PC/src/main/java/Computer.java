import Enum.ProcessorWeight;
import Enum.RAMWeight;
import Enum.MemoryDriveWeight;
import Enum.DisplayWeight;
import Enum.KeyboardWeight;
public class Computer {
    public static final String VENDOR = "Acer";

    private Processor processor;
    private RandomAccessMemory ram;
    private MemoryDrive memoryDrive;
    private Display display;
    private Keyboard keyboard;

    public Computer() {
    }

    public Computer(Processor processor, RandomAccessMemory ram, MemoryDrive memoryDrive, Display display, Keyboard keyboard) {
        this.processor = processor;
        this.ram = ram;
        this.memoryDrive = memoryDrive;
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

    public MemoryDrive getMemoryDrive() {
        return memoryDrive;
    }

    public void setMemoryDrive(MemoryDrive memoryDrive) {
        this.memoryDrive = memoryDrive;
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

    public double computerWeight(double proc, double ram, double hd, double disp, double keyboard) {
        double sum = proc + ram + hd + disp + keyboard;
        return sum;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", \nram=" + ram +
                ", \nmemoryDrive=" + memoryDrive +
                ", \ndisplay=" + display +
                ", \nkeyboard=" + keyboard +
                '}';
    }
}
