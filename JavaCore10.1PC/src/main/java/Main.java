import Enum.ProcessorCores;
import Enum.ProcessorFrequency;
import Enum.ProcessorMark;
import Enum.ProcessorWeight;
import Enum.RAMType;
import Enum.RAMCapacity;
import Enum.RAMWeight;
import Enum.MemoryDriveType;
import Enum.MemoryDriveCapacity;
import Enum.MemoryDriveWeight;
import Enum.DisplayType;
import Enum.DisplayDiagonal;
import Enum.DisplayWeight;
import Enum.KeyboardType;
import Enum.KeyboardLighting;
import Enum.KeyboardWeight;

public class Main {

    public static void main(String[] args) {
        Processor processor1 = new Processor(ProcessorMark.INTEL7.getProcMark(), ProcessorFrequency.TOP.getProcessorFrequency(),
                ProcessorCores.FOUR.getCoresNumber(), ProcessorWeight.MIDDLE.getProcWeight());
        RandomAccessMemory ram1 = new RandomAccessMemory(RAMType.DDR4.getRAMType(), RAMCapacity.RAM16.getRAMValue(),
                RAMWeight.HEAVY.getRAMWeight());
        MemoryDrive memoryDrive1 = new MemoryDrive(MemoryDriveType.SSD.getMDType(), MemoryDriveCapacity.MD512.getMDCapacity(),
                MemoryDriveWeight.MIDDLE.getMDWeight());
        Display display1 = new Display(DisplayType.IPS.getDisplayType(), DisplayDiagonal.DIAG15.getDisplayDiagonal(),
                DisplayWeight.MIDDLE.getDisplayWeight());
        Keyboard keyboard1 = new Keyboard(KeyboardType.DUAL.getKeyboardType(), KeyboardLighting.ON.getKeyboardLighting(),
                KeyboardWeight.LIGHT.getKeyboardWeight());
        Computer computer1 = new Computer(processor1, ram1, memoryDrive1, display1, keyboard1);
        System.out.println(computer1);
        System.out.println("Total weight of all parts is " + computer1.computerWeight(processor1.getWeight(), ram1.getRamWeight(), memoryDrive1.getMDWeight(),
                display1.getWeight(), keyboard1.getWeight()));
    }
}
