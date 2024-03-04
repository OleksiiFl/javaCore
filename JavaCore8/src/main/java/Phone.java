public class Phone {
    static String madeIn;
    long phoneNumber;
    String phoneModel;
    int phoneWeight;
    String contactName;

    public Phone() {
    }

    public Phone(String contactName) {
        this.contactName = contactName;
    }

    public Phone(long  phoneNumber, String phoneModel, int phoneWeight) {
        this.phoneNumber = phoneNumber;
        this.phoneModel = phoneModel;
        this.phoneWeight = phoneWeight;
    }

    public void receiveCall(String nameCall) {
        receiveCall(nameCall, 0);
    }

    public void receiveCall(String nameCall, long numberCall) {
        System.out.println(nameCall + (numberCall > 0 ? " " + numberCall + " " : " ") + "calls you.");
    }

    public void phoneInfo(String phoneModel, int phoneWeight, String madeIn) {
        System.out.println("It is " + phoneModel + " with weight " + phoneWeight + "g. Made in " + madeIn);
    }

}
