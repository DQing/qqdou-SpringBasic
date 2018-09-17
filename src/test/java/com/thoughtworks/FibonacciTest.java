package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FibonacciTest {
    @Test
    void should_return_0_when_input_less_than_1() {
        Fibonacci fibonacci = new Fibonacci();
        long actual = fibonacci.calculate(-2);
        assertEquals(0, actual);
    }
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
        assertEquals(1, actual);
    }

    @Test
    void should_return_correct_numbers_when_input_50() {
        Fibonacci fibonacci = new Fibonacci();
        long actual = fibonacci.calculate(50);

        assertEquals(12586269025L, actual);
    }
    @Test
    void should_throw_exception_when_bigger_than_50() {
        Fibonacci fibonacci = new Fibonacci();
        assertThrows(IllegalArgumentException.class, ()->fibonacci.calculate(100),"number is too big");
    }

}
