package com.maxtest;

public class MaxNum {
    // Method to find max number using compareTo method and Integer object.
    public Integer testMax(Integer x, Integer y, Integer z) {
        Integer max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
}
