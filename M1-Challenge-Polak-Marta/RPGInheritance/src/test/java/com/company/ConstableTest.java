package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {
    @Test
    public void attakingShouldDecreaseHelthLevel(){
        Constable Constablel1;
        Constablel1 = new Constable("",60,100,60,20,5, false,false);
        int expectedValue = 90;
        int actualValue = Constablel1.attack(Constablel1);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void arresting(){
        Constable Constablel1;
        Constablel1 = new Constable("",60,100,60,20,5, false,false);
        String expectedValue = "";
        String actualValue = Constablel1.arrest(Constablel1);
    }

   
}