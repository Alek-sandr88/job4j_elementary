package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    double delta = 0.01;

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 160;
        double expected = 69;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, delta);
    }
}


