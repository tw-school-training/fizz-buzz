package com.thoughtworks;

public class FizzBuzz {
    public String say(int number) {
        if (isDividedBy(number, 3) && isDividedBy(number, 5)) {
            return "FizzBuzz";
        }

        if (isDividedBy(number, 3)) {
            return "Fizz";
        }

        if (isDividedBy(number, 5)) {
            return "Buzz";
        }

        if (isDividedBy(number, 7)) {
            return "Whizz";
        }

        return String.valueOf(number);
    }

    private boolean isDividedBy(int number, int divisor) {
        return number % divisor == 0;
    }
}
