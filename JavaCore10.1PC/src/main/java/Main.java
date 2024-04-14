import Enum.ProcessorCores;
import Enum.ProcessorMark;
import Enum.RAMType;
import Enum.RAMCapacity;
import Enum.MemoryDriveType;
import Enum.DisplayType;
import Enum.KeyboardType;
import Enum.KeyboardLighting;

public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor(ProcessorMark.INTEL, "2.4HGz", ProcessorCores.FOUR, 411);
        RandomAccessMemory ram = new RandomAccessMemory(RAMType.DDR4, RAMCapacity.RAM32, 144);
        MemoryDrive ssd = new MemoryDrive(MemoryDriveType.SSD, 512, 500);
        Display display = new Display(DisplayType.IPS, 17, 367);
        Keyboard keyboard = new Keyboard(KeyboardType.WIRELESS, KeyboardLighting.ON, 222);
        Computer computer = new Computer(processor, ram, ssd, display, keyboard);
        System.out.println(computer.computerWeight());
        System.out.println(computer);
    }
}
