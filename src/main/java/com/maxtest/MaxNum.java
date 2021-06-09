package com.maxtest;


    public class MaxNum<T extends Comparable<T>> {

        T[] values;
        private Object maximum;

        @SafeVarargs
        public MaxNum(T... values) {
            this.values = values;
        }

        public T testMax() {
            printMax(maximum);
            return MaxNum(values);
        }

        public static <T> void printMax(T maximum) {
            System.out.println("Maximum number is: " + maximum);
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


