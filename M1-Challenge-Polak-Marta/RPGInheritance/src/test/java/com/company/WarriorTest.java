package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {
    @Test
    public void attakingShouldDecreaseHelthLevel(){
        Warrior Warrior1;
        Warrior1 = new Warrior("",75,100,100,50,10, false,false);
        int expectedValue =90 ;
        int actualValue = Warrior1.attack(Warrior1);
        assertEquals(expectedValue, actualValue);
    }
}