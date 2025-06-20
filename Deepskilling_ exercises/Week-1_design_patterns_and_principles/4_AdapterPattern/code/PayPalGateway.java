package adapterpattern;

public class PayPalGateway {
    public void makePayment(double amount) {
        System.out.println("Paid Rs." + amount + " using PayPal.");
    }
}
