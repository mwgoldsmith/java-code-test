package com.semantic.codetest.revenue;

import java.math.BigDecimal;

public interface RevenueCalculator {
    BigDecimal calculateRevenue(
            BigDecimal marginPercentage,
            BigDecimal costOfGoods
    );
}
