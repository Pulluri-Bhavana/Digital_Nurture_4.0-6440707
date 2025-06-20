package com.ecommerce.search;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(201, "Smartphone", "Electronics"),
            new Product(202, "Running Shoes", "Footwear"),
            new Product(203, "Wrist Watch", "Accessories"),
            new Product(204, "Backpack", "Bags")
        };

        System.out.println("Linear Search:");
        Product result1 = SearchEngine.linearSearch(products, "Wrist Watch");
        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product not found.");
        }

        Arrays.sort(products, Comparator.comparing(Product::getProductName));

        System.out.println("\nBinary Search:");
        Product result2 = SearchEngine.binarySearch(products, "Backpack");
        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product not found.");
        }
    }
}
