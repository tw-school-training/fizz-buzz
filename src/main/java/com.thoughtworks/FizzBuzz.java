package com.thoughtworks;

public class FizzBuzz {
    public String say(int number) {
        String result = "";
        if (contains(number, 3) && !contains(number, 5)) {
            return "Fizz";
        }

        if (isDividedBy(number, 3) && (!contains(number, 5) || contains(number, 7))) {
            result += "Fizz";
        }

        if (isDividedBy(number, 5) && !contains(number, 7)) {
            result += "Buzz";
        }

        if (isDividedBy(number, 7)) {
            result += "Whizz";
        }

        return result.length() > 0 ? result : String.valueOf(number);
    }

    private boolean contains(int number, int containedNumber) {
        return String.valueOf(number).contains(String.valueOf(containedNumber));
    }

    private boolean isDividedBy(int number, int divisor) {
        return number % divisor == 0;
    }
}
