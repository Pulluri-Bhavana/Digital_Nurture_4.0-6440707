package warehouse.inventory;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Wireless Mouse", 25, 499.0);
        Product p2 = new Product(102, "USB Keyboard", 10, 699.0);
        Product p3 = new Product(103, "HDMI Cable", 50, 199.0);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        manager.listAll();

        manager.updateProduct(102, "Mechanical Keyboard", 8, 999.0);
        manager.deleteProduct(103);

        System.out.println("\nAfter Update/Delete:");
        manager.listAll();
    }
}
