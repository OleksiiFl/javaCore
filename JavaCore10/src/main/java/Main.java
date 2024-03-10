public class Main {

    public static void main(String[] args) {

        Calculator test1 = new Calculator(544, 213);
        test1.hellMachine(Operation.ADD);

        Calculator test2 = new Calculator(6373.1, 32.77);
        test2.hellMachine(Operation.MULTIPLY);

        Calculator test3 = new Calculator(16, 17);
        test3.hellMachine(Operation.SUBTRACT);
    }
}
