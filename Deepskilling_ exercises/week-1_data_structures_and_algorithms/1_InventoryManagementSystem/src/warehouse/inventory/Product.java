package warehouse.inventory;

public class Product {
    private int productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void updateDetails(String name, int quantity, double price) {
        this.productName = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void display() {
        System.out.println("ID: " + productId + " | Name: " + productName + " | Qty: " + quantity + " | Price: " + price);
    }
}
