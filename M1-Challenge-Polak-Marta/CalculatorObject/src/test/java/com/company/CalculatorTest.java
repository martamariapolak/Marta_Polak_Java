package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void shouldAddTwoIntegers() {
        Calculator calc = new Calculator();
        int expectedOutput = 2;
        int actualOutput = calc.add(1, 1);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldSubtractTwoIntegers() {
        Calculator calc = new Calculator();
        int expectedOutput = -29;
        int actualOutput = calc.subtract(23, 52);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void shouldMultiplyTwoIntegers() {
        Calculator calc = new Calculator();
        int expectedOutput = 68;
        int actualOutput = calc.multiply(34, 2);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void shouldDivideTwoIntegers() {
        Calculator calc = new Calculator();
        int expectedOutput = 4;
        int actualOutput = calc.divide(12, 3);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test(expected = ArithmeticException.class)
    public void shouldFailDivideby0() {
        Calculator calc = new Calculator();
        int actualOutput = calc.divide(34, 0);
    }
    private static final double DELTA = 1e-15;
    @Test
    public void shouldDivideTwoIntDouble() {
        Calculator calc = new Calculator();
        double expectedOutput = 1.71;
        double actualOutput = calc.divide(12.00, 7.00);
        double round = (double) Math.round(actualOutput * 100) / 100;
        assertEquals(expectedOutput,round,DELTA);
    }

    private static final double DELTA1 = 1e-15;
    @Test
    public void shouldAddTwoDoubles() {
        Calculator calc = new Calculator();
        double expectedOutput = 5.70;
        double actualOutput = calc.add(3.4, 2.3);
        double round = (double) Math.round(actualOutput * 100) / 100;
        assertEquals(expectedOutput,round,DELTA1);
    }
    private static final double DELTA2 = 1e-15;
    @Test
    public void shouldMultiplyTwoDoubles() {
        Calculator calc = new Calculator();
        double expectedOutput = 29.48;
        double actualOutput = calc.multiply(6.7, 4.4);
        double round = (double) Math.round(actualOutput * 100) / 100;
        assertEquals(expectedOutput,round,DELTA2);
    }
    private static final double DELTA3 = 1e-15;
    @Test
    public void shouldSubtracTwoDoubles() {
        Calculator calc = new Calculator();
        double expectedOutput = 5.00;
        double actualOutput = calc.subtract(5.5, 0.5);
        double round = (double) Math.round(actualOutput * 100) / 100;
        assertEquals(expectedOutput,round,DELTA3);
    }
    private static final double DELTA4 = 1e-15;
    @Test
    public void shouldDivideTwoDoubles() {
        Calculator calc = new Calculator();
        double expectedOutput = 4.91;
        double actualOutput = calc.divide(10.8, 2.2);
        double round = (double) Math.round(actualOutput * 100) / 100;
        assertEquals(expectedOutput,round,DELTA4);
    }


}