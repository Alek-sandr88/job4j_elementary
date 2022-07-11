package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        for (int change : coins) {
            while (money - price >= change) {
                rsl[size++] = change;
                money -= change;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
