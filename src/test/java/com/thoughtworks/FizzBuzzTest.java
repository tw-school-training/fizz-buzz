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
}
