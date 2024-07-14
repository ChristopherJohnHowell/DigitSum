package src;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfDigitsTest {

    @Test
    public void sumOfDigits_withValidData_returnsSum() {
        assertEquals(8, SumOfDigits.sumOfDigits(17));
        assertEquals(10, SumOfDigits.sumOfDigits(1234));
        assertEquals(18, SumOfDigits.sumOfDigits(99));
        assertEquals(0, SumOfDigits.sumOfDigits(0));
    }

}