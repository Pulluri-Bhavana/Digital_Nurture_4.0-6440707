package adapterpattern;

public class StripeGateway {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Stripe.");
    }
}
