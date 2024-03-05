package com;

import java.util.Random;

public class Dice {
    private static final int MAX_DICE_VALUE = 6;
    private Random random;

    public Dice() {
        this.random = new Random();
    }

    public int roll() {
        return random.nextInt(MAX_DICE_VALUE) + 1;
    }
}

