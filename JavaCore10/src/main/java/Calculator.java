public class Calculator {
    private double a;
    private double b;
    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public void hellMachine(Operation result) {
        if(result == Operation.ADD) {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if(result == Operation.SUBTRACT) {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if(result == Operation.MULTIPLY) {
            System.out.println(a + " * " + b + " = " + a * b);
        } else {
            System.out.println("Invalid command!");
        }
    }
}
