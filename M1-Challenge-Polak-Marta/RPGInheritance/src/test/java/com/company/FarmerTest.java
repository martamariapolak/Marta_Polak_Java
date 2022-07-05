package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {
//private Farmer Farmer1;

@Test
    public void attakingShouldDecreaseHelthLevel(){
   Farmer Farmer1;
    Farmer1 = new Farmer("",75,100,75,10,1, false,false);
    int expectedValue = 90;
    int actualValue = Farmer1.attack(Farmer1);
    assertEquals(expectedValue, actualValue);
}





}






