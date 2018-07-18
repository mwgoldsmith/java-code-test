package com.semantic.codetest.revenue;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {
    // M = 0.2
    // R = 500
    // C = 400

    private static BigDecimal margin = new BigDecimal(0.2);
    private static BigDecimal cost = new BigDecimal(400);

    @Test
    public void calculateRevenueTest() {
        BigDecimal revenue = new Calculator().calculateRevenue(margin, cost);
        assertEquals(0, revenue.compareTo(new BigDecimal(500)));
    }

}
