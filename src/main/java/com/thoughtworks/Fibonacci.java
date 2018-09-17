package com.thoughtworks;

public class Fibonacci {
    public long calculate(int index) {
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        return calculate(index - 1) + calculate(index - 2);
    }
}
//1 1 2 3 5
