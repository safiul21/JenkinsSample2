package org.example;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator= new Calculator();
    @Test
    public  void testCal(){
        Assert.assertEquals(30, calculator.add(10, 20));
    }
}
