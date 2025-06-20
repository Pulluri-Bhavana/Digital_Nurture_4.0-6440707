package com.ecommerce.search;

public class SearchEngine {

    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] sortedProducts, String targetName) {
        int left = 0;
        int right = sortedProducts.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int comparison = sortedProducts[mid].getProductName().compareToIgnoreCase(targetName);

            if (comparison == 0) {
                return sortedProducts[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
