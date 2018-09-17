package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    void should_return_1() {
        Fibonacci fibonacci = new Fibonacci();
        long actual = fibonacci.calculate(1);
        assertEquals(1, actual);
    }

    @Test
    void should_return_3() {
        Fibonacci fibonacci = new Fibonacci();
        long actual = fibonacci.calculate(3);
        assertEquals(2, actual);
    }

    @Test
    void should_return_correct_numbers_when_input_50() {
        Fibonacci fibonacci = new Fibonacci();
        long actual = fibonacci.calculate(50);
        assertEquals(12586269025L, actual);
    }
}
