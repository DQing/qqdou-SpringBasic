package com.thoughtworks;

class Fibonacci {
    long calculate(int index) {
        if (index <= 0) {
            return 0;
        }
        if (index > 50) {
            throw new IllegalArgumentException("number is too big");
        }
        if (index == 1) {
            return 1;
        }
        return calculate(index - 1) + calculate(index - 2);
    }
}
