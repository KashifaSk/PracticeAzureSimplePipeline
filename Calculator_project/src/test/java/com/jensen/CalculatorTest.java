package com.jensen;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
  {
    Calculator calculator = new Calculator();
    double firstValue = 2.2;
    double secondValue = 1.1;

    @BeforeAll
    static void setUp()
    {
        System.out.println("Testing the calculator class");
    }
    @Test
    void testSetResult()
    {
        calculator.setResult(5);
        assertEquals(5, calculator.getResult());
    }
//--------------Test cases with motivation------------------------------------------------------------------------------
    @Test
    void testSwitchAdder()
    {
        calculator.setFirstValue(firstValue);
        calculator.setSecondValue(secondValue);
        assertEquals(3.3, calculator.execute('a'), 0.001);
    }
    @Test
    void testSwitchSubtract()
    {
        calculator.setFirstValue(firstValue);
        calculator.setSecondValue(secondValue);
        assertEquals(1.1, calculator.execute('s'), 0.001);
    }
    @Test
    void testSwitchMultiply()
    {
          calculator.setFirstValue(firstValue);
          calculator.setSecondValue(secondValue);
          assertEquals(2.42, calculator.execute('m'), 0.001);
    }
    @Test
    void testSwitchDivision()
    {
        calculator.setFirstValue(firstValue);
        calculator.setSecondValue(secondValue);
        assertEquals(2, calculator.execute('d'));
    }
    @Test
    void testCheckIfSecondValueIsZeroForDivision()
    {
        calculator.setFirstValue(firstValue);
        calculator.setSecondValue(0);
        assertEquals(0.0, calculator.execute('d'));
    }
    @Test
    void testSwitchDefault()
    {
        calculator.setFirstValue(firstValue);
        calculator.setSecondValue(secondValue);
        assertEquals(0.0d, calculator.execute('b'));
    }
//----------------------------------------------------------------------------------------------------------------------
 }