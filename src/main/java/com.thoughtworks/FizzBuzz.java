package com.thoughtworks;

public class FizzBuzz {
    public String say(int number) {
        String result = "";
        if (new FizzBuzzNumber(number).contains(3) && !new FizzBuzzNumber(number).contains(5)) {
            return "Fizz";
        }

        if (new FizzBuzzNumber(number).isDividedBy(3) && (!new FizzBuzzNumber(number).contains(5) || new FizzBuzzNumber(number).contains(7))) {
            result += "Fizz";
        }

        if (new FizzBuzzNumber(number).isDividedBy(5) && !new FizzBuzzNumber(number).contains(7)) {
            result += "Buzz";
        }

        if (new FizzBuzzNumber(number).isDividedBy(7)) {
            result += "Whizz";
        }

        return result.length() > 0 ? result : String.valueOf(number);
    }

    public class FizzBuzzNumber {
        private int number;

        public FizzBuzzNumber(int number) {
            this.number = number;
        }

        private boolean contains(int containedNumber) {
            return String.valueOf(number).contains(String.valueOf(containedNumber));
        }

        private boolean isDividedBy(int divisor) {
            return number % divisor == 0;
        }

    }
}
