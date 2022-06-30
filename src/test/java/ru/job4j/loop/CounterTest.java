package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 3;
        int finish = 12;
        int result = Counter.sumByEven(start, finish);
        int expected = 40;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThi() {
        int start = 4;
        int finish = 18;
        int result = Counter.sumByEven(start, finish);
        int expected = 88;
        Assert.assertEquals(expected, result);
    }
}