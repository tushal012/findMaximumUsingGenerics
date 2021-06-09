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
}
