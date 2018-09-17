package com.thoughtworks;

class Fibonacci {
    long calculate(int index) {
        checkParameter(index);
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        return calculate(index - 1) + calculate(index - 2);
    }
   private void checkParameter(int index){
       if (index < 0) {
           throw new IllegalArgumentException("number is too small");
       }
       if (index > 50) {
           throw new IllegalArgumentException("number is too big");
       }
    }
}
