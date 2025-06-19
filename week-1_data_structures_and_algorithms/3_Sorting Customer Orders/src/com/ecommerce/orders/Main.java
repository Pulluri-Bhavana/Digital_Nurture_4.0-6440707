package com.ecommerce.orders;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Anita", 1200.50),
            new Order(2, "Ravi", 999.00),
            new Order(3, "Zoya", 2540.75),
            new Order(4, "Imran", 1800.30)
        };

        System.out.println("Before Sorting:");
        SortingAlgorithms.displayOrders(orders);

        System.out.println("\nSorted Using Bubble Sort:");
        SortingAlgorithms.bubbleSort(orders);
        SortingAlgorithms.displayOrders(orders);

        // Reinitialize to original data for fair Quick Sort
        orders = new Order[] {
            new Order(1, "Anita", 1200.50),
            new Order(2, "Ravi", 999.00),
            new Order(3, "Zoya", 2540.75),
            new Order(4, "Imran", 1800.30)
        };

        System.out.println("\nSorted Using Quick Sort:");
        SortingAlgorithms.quickSort(orders, 0, orders.length - 1);
        SortingAlgorithms.displayOrders(orders);
    }
}
