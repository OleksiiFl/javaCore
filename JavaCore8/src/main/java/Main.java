public class Main {

    public static void main(String[] args) {

        Phone.madeIn = "South Korea";

        Phone contact1 = new Phone(936637283, "iPhone", 173);
        contact1.contactName = "Jeff";

        Phone contact2 = new Phone();
        contact2.phoneNumber = 972263746;

        Phone contact3 = new Phone(506627381, "Samsung", 190);
        Phone contact4 = new Phone("Jack");

        contact1.receiveCall(contact1.contactName, contact1.phoneNumber);
        contact2.receiveCall("John");
        contact3.phoneInfo(contact3.phoneModel, contact3.phoneWeight, Phone.madeIn);
        contact4.receiveCall(contact4.contactName);
    }
}
