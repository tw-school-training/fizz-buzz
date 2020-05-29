package com.thoughtworks;

public class FizzBuzz {
    public String say(int number) {
        String result = "";
        FizzBuzzNumber fizzBuzzNumber = new FizzBuzzNumber(number);
        if (fizzBuzzNumber.contains(3) && !fizzBuzzNumber.contains(5)) {
            return "Fizz";
        }

        if (fizzBuzzNumber.isDividedBy(3) && (!fizzBuzzNumber.contains(5) || fizzBuzzNumber.contains(7))) {
            result += "Fizz";
        }

        if (fizzBuzzNumber.isDividedBy(5) && !fizzBuzzNumber.contains(7)) {
            result += "Buzz";
        }

        if (fizzBuzzNumber.isDividedBy(7)) {
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
