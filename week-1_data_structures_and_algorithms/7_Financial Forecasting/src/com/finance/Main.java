package com.finance;

public class Main {
    public static void main(String[] args) {
        Forecaster forecaster = new Forecaster();

        double startingValue = 10000.0; // Rs. 10,000
        double annualGrowthRate = 0.07; // 7%
        int forecastYears = 5;

        System.out.println("Predicting value recursively (basic):");
        double result1 = forecaster.predictValue(startingValue, annualGrowthRate, forecastYears);
        System.out.printf("Estimated value after %d years: Rs. %.2f\n", forecastYears, result1);

        System.out.println("\nPredicting value recursively (with memoization):");
        double[] cache = new double[forecastYears + 1];
        double result2 = forecaster.predictValueMemo(startingValue, annualGrowthRate, forecastYears, cache);
        System.out.printf("Estimated value after %d years: Rs. %.2f\n", forecastYears, result2);
    }
}
