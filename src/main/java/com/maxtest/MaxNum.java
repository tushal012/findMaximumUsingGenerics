package com.maxtest;

public class MaxNum {
    // Method to find max number using compareTo method and Integer object.
    
    public  static <T extends Comparable<T>> T testMax(T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0)
            max = y;
        if(z.compareTo(max) > 0)
            max = z;
        return max;
    }
}
