package com.thoughtworks;

public class FizzBuzz {
    public String say(int number) {
        FizzBuzzNumber fizzBuzzNumber = new FizzBuzzNumber(number);
        if (fizzBuzzNumber.contains(3) && !fizzBuzzNumber.contains(5)) {
            return "Fizz";
        }

        String result = "";
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

        private boolean contains(int number) {
            return String.valueOf(this.number).contains(String.valueOf(number));
        }

        private boolean isDividedBy(int number) {
            return this.number % number == 0;
        }

    }
}
