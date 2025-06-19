package com.finance;

public class Forecaster {

    public double predictValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return predictValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public double predictValueMemo(double currentValue, double growthRate, int years, double[] cache) {
        if (years == 0) {
            return currentValue;
        }
        if (cache[years] != 0.0) {
            return cache[years];
        }
        cache[years] = predictValueMemo(currentValue * (1 + growthRate), growthRate, years - 1, cache);
        return cache[years];
    }
}
