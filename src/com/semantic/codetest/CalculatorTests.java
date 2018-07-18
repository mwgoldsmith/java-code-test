package com.semantic.codetest;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {
  // m = 0.2
  // r = 500
  // c = 400

  @Test
  public void calculateRevenueTest() {
    BigDecimal revenue = new Calculator().calculateRevenue(new BigDecimal(0.2), new BigDecimal(400));
    assertEquals(500, revenue.intValue());
  }

}
