package com.ecommerce.orders;

public class Order {
    private int orderId;
    private String customerName;
    private double totalPrice;

    public Order(int id, String name, double price) {
        this.orderId = id;
        this.customerName = name;
        this.totalPrice = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void display() {
        System.out.println("Order ID: " + orderId + " | Customer: " + customerName + " | Total: Rs" + totalPrice);
    }
}
