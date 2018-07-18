package com.semantic.codetest;

import java.math.BigDecimal;
import java.math.RoundingMode;

// This is an obtuse implementation which only exists to implement an interface.
public class Calculator implements RevenueCalculator {
    @Override
    public BigDecimal calculateRevenue(BigDecimal marginPercentage, BigDecimal costOfGoods) {
        return costOfGoods.divide(new BigDecimal(1.0).subtract(marginPercentage), 2, RoundingMode.HALF_UP);
    }
}
