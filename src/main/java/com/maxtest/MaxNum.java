package com.maxtest;


    public class MaxNum<T extends Comparable<T>> {

        T[] values;

        @SafeVarargs
        public MaxNum(T... values) {
            this.values = values;
        }

        public T testMax() {
            return MaxNum(values);
        }

        @SafeVarargs
        public static <T extends Comparable<T>> T MaxNum(T... values) {
            T maximum = values[0];

            for (int i = 1; i < values.length; i++) {
                if (maximum.compareTo(values[i]) < 0) {
                    maximum = values[i];
                }
            }
            return maximum;
        }
    }


