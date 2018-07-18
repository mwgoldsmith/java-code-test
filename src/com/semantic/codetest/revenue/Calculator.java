package com.semantic.codetest.revenue;

import java.math.BigDecimal;
import java.math.RoundingMode;

// This is an obtuse implementation which only exists to implement an interface.
public class Calculator implements RevenueCalculator {
    private static final BigDecimal _base = new BigDecimal(1.0);

    @Override
    public BigDecimal calculateRevenue(BigDecimal marginPercentage, BigDecimal costOfGoods) {
        return costOfGoods.divide(_base.subtract(marginPercentage), 2, RoundingMode.HALF_UP);
    }
}
