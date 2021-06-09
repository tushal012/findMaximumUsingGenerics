package com.maxtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxNumTest {
    MaxNum maxNum = new MaxNum();

    @Test
    public void givenMaxNumAtFirstPosition_ShouldReturnSameNum() {
        Integer maximumNum = maxNum.testMax(5, 4, 3);
        Assertions.assertEquals(5, maximumNum);
    }

    @Test
    public void givenMaxNumAtSecondPosition_ShouldReturnSameNum() {
        Integer maximumNum = maxNum.testMax(5, 4, 3);
        Assertions.assertEquals(4, maximumNum);
    }

    @Test
    public void givenMaxNumAtThirdPosition_ShouldReturnSameNum() {
        Integer maximumNum = maxNum.testMax(5, 4, 3);
        Assertions.assertEquals(3, maximumNum);
    }

    // test cases for float number to check max number.
    @Test
    public void givenMaxFloatNumAtFirstPosition_ShouldReturnSameNum() {
        Float maximumNum = maxNum.testMax(13.01f, 12.6f, 10.5f);
        Assertions.assertEquals(13.01f, maximumNum);
    }

    @Test
    public void givenMaxFloatNumAtSecondPosition_ShouldReturnSameNum() {
        Float maximumNum = maxNum.testMax(13.01f, 12.6f, 10.5f);
        Assertions.assertEquals(12.6f, maximumNum);
    }
    @Test
    public void givenMaxFloatNumAtThirdPosition_ShouldReturnSameNum() {
        Float maximumNum = maxNum.testMax(13.01f, 12.6f, 10.5f);
        Assertions.assertEquals(10.05f, maximumNum);
    }

    @Test
    public void givenMaxStringAtFirstPosition_ShouldReturnSameNum() {
        String maximumNum = maxNum.testMax("Peach", "Apple", "Banana");
        Assertions.assertEquals("Peach", maximumNum);
    }
    @Test
    public void givenMaxStringAtSecondPosition_ShouldReturnSameNum() {
        String maximumNum = maxNum.testMax("Peach", "Apple", "Banana");
        Assertions.assertEquals("Apple", maximumNum);
    }
    @Test
    public void givenMaxStringAtThirdPosition_ShouldReturnSameNum() {
        String maximumNum = maxNum.testMax("Peach", "Apple", "Banana");
        Assertions.assertEquals("Banana", maximumNum);
    }

    @Test
    public void givenMultipleInt_shouldReturn_maxInt() {
        Assertions.assertEquals(4, new MaxNum(5, 4, 3).testMax());
    }

    @Test
    public void givenMultipleFloat_shouldReturn_maxFloat() {
        Assertions.assertEquals( 3.3f, new MaxNum(1.1f, 3.3f, 6.6f).testMax());
    }

    @Test
    public void givenMultipleString_shouldReturn_maxString() {
        Assertions.assertEquals("peach", new MaxNum<>("peach", "banana", "apple").testMax());
    }
}
