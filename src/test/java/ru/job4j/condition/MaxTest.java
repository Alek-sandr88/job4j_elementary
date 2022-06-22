package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Math.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2Then4() {
        int left = 4;
        int right = 3;
        int result = Math.max(left, right);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2Then33() {
        int left = 3;
        int right = 3;
        int result = Math.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }
}