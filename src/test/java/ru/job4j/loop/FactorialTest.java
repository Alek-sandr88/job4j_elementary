package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in = 1;
        int rsl = 120;
        int a = Factorial.calc(in);
        Assert.assertEquals(rsl, a);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int rsl = 1;
        int a = Factorial.calc(in);
        Assert.assertEquals(rsl, a);
    }
}
