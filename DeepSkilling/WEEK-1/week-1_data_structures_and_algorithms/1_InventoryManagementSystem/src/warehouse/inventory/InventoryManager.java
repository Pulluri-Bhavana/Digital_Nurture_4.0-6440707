package warehouse.inventory;

import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product p) {
        if (inventory.containsKey(p.getProductId())) {
            System.out.println("Product ID already exists.");
            return;
        }
        inventory.put(p.getProductId(), p);
        System.out.println("Product added.");
    }

    public void updateProduct(int id, String name, int quantity, double price) {
        Product p = inventory.get(id);
        if (p != null) {
            p.updateDetails(name, quantity, price);
            System.out.println("Product updated.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int id) {
        if (inventory.remove(id) != null) {
            System.out.println("Product deleted.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void listAll() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        for (Product p : inventory.values()) {
            p.display();
        }
    }
}
