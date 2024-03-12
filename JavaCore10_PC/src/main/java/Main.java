import Display.Display;
import Display.DisplayType;
import HardDisc.HardDisc;
import HardDisc.DiscType;
import Keyboard.Keyboard;
import Keyboard.KeyboardType;
import Keyboard.Lighting;
import Processor.Cores;
import Processor.Frequency;
import Processor.Mark;
import Processor.Processor;
import RAM.RandomAccessMemory;
import RAM.MemoryType;

public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor(Mark.AMD, Frequency.TWO_EIGHT, Cores.TWO, 144.2);
        RandomAccessMemory ram = new RandomAccessMemory(MemoryType.DDR4, 16, 99);
        HardDisc hardDisc = new HardDisc(DiscType.SSD, 256, 307.6);
        Display display = new Display(15, DisplayType.IPS, 611);
        Keyboard keyboard = new Keyboard(KeyboardType.WIRELESS, Lighting.YES, 221.1);

        Computer computer = new Computer(processor, ram, hardDisc, display, keyboard);

        System.out.println(computer);
        System.out.println("The total weight of all parts is " + computer.getSumWeight());

    }
}
