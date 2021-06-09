package com.maxtest;

public class MaxNum {
    public String testMax(String x, String y, String z) {
        int max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }

    // Method to find max number using compareTo method and Integer object.

    public class MaxNum<T extends Comparable<T>> {

        T x, y, z;
        T max;

        public MaxNum(T x, T y, T z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }


    }
}

