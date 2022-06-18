package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K2Square5() {
        int expected = 1;
        int p = 5;
        double k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K2Square11() {
        int expected = 5;
        int p = 12;
        double k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
