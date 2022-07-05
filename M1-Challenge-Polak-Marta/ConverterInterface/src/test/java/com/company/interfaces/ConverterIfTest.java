package com.company.interfaces;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterIfTest {
    @Test
    public void   shouldReturnJanuaryWhenMonth1(){
        // Arrange
        ConverterIf cnv= new ConverterIf();
        String expectedValue ="January";
        //Act
        String actualValue = cnv.convertMonth(1);
        // Assert
        assertEquals(expectedValue, actualValue);
    }


}