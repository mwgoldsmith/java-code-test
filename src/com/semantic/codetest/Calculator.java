package com.semantic.codetest;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator implements RevenueCalculator {
    @Override
    public BigDecimal calculateRevenue(BigDecimal marginPercentage, BigDecimal costOfGoods) {
        return costOfGoods.divide(new BigDecimal(1.0-marginPercentage.doubleValue()), 2, RoundingMode.HALF_UP);
    }
}
