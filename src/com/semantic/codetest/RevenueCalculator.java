package com.semantic.codetest;

import java.math.BigDecimal;

public interface RevenueCalculator {
    BigDecimal calculateRevenue(
            BigDecimal marginPercentage,
            BigDecimal costOfGoods
    );
}
