package structural.adapter;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe(new AxisBankAdapter());
    }
}
