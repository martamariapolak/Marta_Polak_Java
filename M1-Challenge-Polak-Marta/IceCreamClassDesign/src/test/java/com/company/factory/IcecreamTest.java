package com.company.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class IcecreamTest {


    private static final double DELTA;

    static {
        DELTA = 1e-15;
    }

    @Test
    public void HowManyKgDaily() {
        Icecream  ice1 = new Icecream(10,3.6,200.20);
        double expectedValue = 2002.0;
        double actualValue = ice1.dayProduction();
        double round = (double) Math.round(actualValue * 100) / 100;
        assertEquals(expectedValue, actualValue, DELTA);
    }
    @Test
    public void HowMachWillPayMe() {
        Icecream  ice1 = new Icecream(10,3.6,200.20);
        double expectedValue = 10090.08;
        double actualValue = ice1.dayMoney();
        double round = (double) Math.round(actualValue * 100) / 100;
        assertEquals(expectedValue, actualValue, DELTA);
    }
    @Test
    public void ItIsMine() {
        Icecream  ice1 = new Icecream(10,3.6,200.20);
        double expectedValue = 2882.88;
        double actualValue = ice1.dailyIncome();
        double round = (double) Math.round(actualValue * 100) / 100;
        assertEquals(expectedValue, actualValue, DELTA);
    }
}