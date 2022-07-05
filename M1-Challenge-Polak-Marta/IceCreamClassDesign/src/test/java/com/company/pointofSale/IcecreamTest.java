package com.company.pointofSale;

import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IcecreamTest {
    private Icecream ice;


    @Test
    public void showOrderSmall() {
        ice = new Icecream("orange", 3, 5.2);
        int expectedValue = 300;
        int actualValue = ice.order();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void schouldorderSmall() {
        ice = new Icecream("orange", 3, 1.2);
        int expectedValue = 500;
        int actualValue = ice.order();
        assertEquals(expectedValue, actualValue);
    }

    private static final double DELTA = 1e-15;

    @Test
    public void DoesCountPrice() {
        ice = new Icecream("orange", 3, 1.2);
        double expectedValue = 1.44;
        double actualValue = ice.setPrice();
        double round = (double) Math.round(actualValue * 100) / 100;
        assertEquals(expectedValue, actualValue, DELTA);
    }

}