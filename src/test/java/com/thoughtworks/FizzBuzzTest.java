package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_return_normal_number_given_normal_number() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(1);

        //then
        assertThat(result, is("1"));
    }

    @Test
    public void should_return_fizz_given_number_can_be_divided_by_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(3);

        //then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_buzz_given_number_can_be_divided_by_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(5);

        //then
        assertThat(result, is("Buzz"));
    }

    @Test
    public void should_return_whizz_given_number_can_be_divided_by_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(7);

        //then
        assertThat(result, is("Whizz"));
    }

    @Test
    public void should_return_fizzbuzz_given_number_can_be_divided_by_3_and_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(60);

        //then
        assertThat(result, is("FizzBuzz"));
    }

    @Test
    public void should_return_fizzwhizz_given_number_can_be_divided_by_3_and_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(21);

        //then
        assertThat(result, is("FizzWhizz"));
    }

    @Test
    public void should_return_buzzwhizz_given_number_can_be_divided_by_5_and_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(70);

        //then
        assertThat(result, is("BuzzWhizz"));
    }

    @Test
    public void should_return_fizzbuzzwhizz_given_number_can_be_divided_by_3_and_5_and_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(210);

        //then
        assertThat(result, is("FizzBuzzWhizz"));
    }

    @Test
    public void should_return_fizz_given_number_contains_3_and_can_not_be_divided_by_3_and_5_and_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(13);

        //then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_fizz_given_number_contains_3_and_can_be_divided_by_3_and_5_and_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(630);

        //then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_fizz_given_number_contains_3_and_can_be_divided_by_3_and_5_and_not_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(30);

        //then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_fizz_given_number_contains_3_and_can_be_divided_by_3_and_7_and_not_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(63);

        //then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_fizz_given_number_contains_3_and_can_be_divided_by_5_and_7_and_not_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(1330);

        //then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_fizz_given_number_contains_3_and_can_be_divided_by_3_and_not_5_and_not_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(9);

        //then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_fizz_given_number_contains_3_and_can_be_divided_by_5_and_not_3_and_not_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(310);

        //then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_fizz_given_number_contains_3_and_can_be_divided_by_7_and_not_3_and_not_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(364);

        //then
        assertThat(result, is("Fizz"));
    }


    @Test
    public void should_return_the_number_given_number_contains_5_and_can_not_be_divided_by_5_and_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(51);

        //then
        assertThat(result, is("51"));
    }
}
