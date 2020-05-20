package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    private void checkFizzBuzzResult(int number, String result) {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.say(number);

        //then
        assertThat(actual, is(result));
    }

    @Test
    public void should_return_normal_number_given_normal_number() {
        checkFizzBuzzResult(1, "1");
    }

    @Test
    public void should_return_fizz_given_number_can_be_divided_by_3() {
        checkFizzBuzzResult(3, "Fizz");
    }

    @Test
    public void should_return_buzz_given_number_can_be_divided_by_5() {
        checkFizzBuzzResult(5, "Buzz");
    }

    @Test
    public void should_return_whizz_given_number_can_be_divided_by_7() {
        checkFizzBuzzResult(7, "Whizz");
    }

    @Test
    public void should_return_fizzbuzz_given_number_can_be_divided_by_3_and_5() {
        checkFizzBuzzResult(60, "FizzBuzz");
    }

    @Test
    public void should_return_fizzwhizz_given_number_can_be_divided_by_3_and_7() {
        checkFizzBuzzResult(21, "FizzWhizz");

    }

    @Test
    public void should_return_buzzwhizz_given_number_can_be_divided_by_5_and_7() {
        checkFizzBuzzResult(140, "BuzzWhizz");
    }

    @Test
    public void should_return_fizzbuzzwhizz_given_number_can_be_divided_by_3_and_5_and_7() {
        checkFizzBuzzResult(210, "FizzBuzzWhizz");
    }

    @Test
    public void should_return_fizz_given_number_contains_3_and_can_not_be_divided_by_all_of_3_and_5_and_7() {
        checkFizzBuzzResult(13, "Fizz");
    }

    @Test
    public void should_return_fizz_given_number_contains_3_and_can_be_divided_by_3_and_5_and_7() {
        checkFizzBuzzResult(630, "Fizz");
    }

    @Test
    public void should_return_fizz_given_number_contains_3_and_can_be_divided_by_both_of_3_and_5_but_not_divided_by_7() {
        checkFizzBuzzResult(30, "Fizz");
    }

    @Test
    public void should_return_fizz_given_number_contains_3_and_can_be_divided_by_both_of_3_and_7_but_not_divided_by_5() {
        checkFizzBuzzResult(63, "Fizz");
    }

    @Test
    public void should_return_fizz_given_number_contains_3_and_can_be_divided_by_both_of_5_and_7_but_not_divided_by_3() {
        checkFizzBuzzResult(1330, "Fizz");
    }

    @Test
    public void should_return_fizz_given_number_contains_3_and_can_be_divided_by_3_but_not_divided_by_either_5_or_7() {
        checkFizzBuzzResult(9, "Fizz");
    }

    @Test
    public void should_return_fizz_given_number_contains_3_and_can_be_divided_by_5_but_not_divided_by_either_3_or_7() {
        checkFizzBuzzResult(310, "Fizz");
    }

    @Test
    public void should_return_fizz_given_number_contains_3_and_can_be_divided_by_7_but_not_divided_by_either_3_or_5() {
        checkFizzBuzzResult(364, "Fizz");
    }


    @Test
    public void should_return_the_number_given_number_contains_5_and_can_not_be_divided_by_either_5_or_7() {
        checkFizzBuzzResult(51, "51");
    }

    @Test
    public void should_return_buzzwhizz_given_number_contains_5_and_can_be_divided_by_both_of_5_and_7() {
        checkFizzBuzzResult(35, "BuzzWhizz");
        checkFizzBuzzResult(105, "BuzzWhizz");
        checkFizzBuzzResult(315, "BuzzWhizz");
    }

    @Test
    public void should_return_buzz_given_number_contains_5_and_can_be_divided_by_5_but_not_divided_by_7() {
        checkFizzBuzzResult(15, "Buzz");
        checkFizzBuzzResult(305, "Buzz");
    }

    @Test
    public void should_return_buzz_given_number_contains_5_and_can_be_divided_by_7_but_not_divided_by_5() {
        checkFizzBuzzResult(56, "Whizz");
    }

    @Test
    public void should_return_the_number_given_number_contains_7_but_can_not_be_divided_by_either_3_or_7() {
        checkFizzBuzzResult(17, "17");
    }

    @Test
    public void should_return_fizzwhizz_given_number_contains_7_and_can_be_divided_by_all_of_3_and_5_and_7() {
        checkFizzBuzzResult(735, "FizzWhizz");
    }

    @Test
    public void should_return_fizzwhizz_given_number_contains_7_and_can_be_divided_by_either_3_or_7() {
        checkFizzBuzzResult(147, "FizzWhizz");
    }

    @Test
    public void should_return_fizz_given_number_contains_7_and_can_be_divided_by_3_but_not_divided_by_7() {
        checkFizzBuzzResult(75, "Fizz");
    }

    @Test
    public void should_return_whizz_given_number_contains_7_and_can_be_divided_by_7_but_not_divided_by_3() {
        checkFizzBuzzResult(70, "Whizz");
    }
}
