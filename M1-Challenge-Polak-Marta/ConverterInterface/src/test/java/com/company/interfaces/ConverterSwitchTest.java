package com.company.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {
    @Test
    public void shouldReturnJanuaryWhenMonth1(){
        // Arrange
        ConverterSwitch cnv1= new ConverterSwitch();
        String expectedValue ="January";
        //Act
        String actualValue = cnv1.convertMonth(1);
        // Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void shouldReturnFebryWhenMonth2(){
        // Arrange
        ConverterSwitch cnv1= new ConverterSwitch();
        String expectedValue ="February";
        //Act
        String actualValue = cnv1.convertMonth(2);
        // Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void shouldReturnAnyWhenMonth13(){
        // Arrange
        ConverterSwitch cnv1= new ConverterSwitch();
        String expectedValue ="no month";
        //Act
        String actualValue = cnv1.convertMonth(13);
        // Assert
         assertEquals(expectedValue, actualValue);
    }
    @Test
    public void  shouldReturnSundayWhenDay1(){
        // Arrange
        ConverterSwitch cnv1= new ConverterSwitch();
        String expectedValue ="Sunday";
        //Act
        String actualValue = cnv1.convertDay(1);
        // Assert
        assertEquals(expectedValue, actualValue);
}
    @Test
    public void shouldReturnMondayWhenDay2(){
        // Arrange
        ConverterSwitch cnv1= new ConverterSwitch();
        String expectedValue ="Monday";
        //Act
        String returnValue = cnv1.convertDay(2);
        // Assert
        assertEquals(expectedValue, returnValue);
    }
}