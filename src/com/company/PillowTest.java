package com.company;

import org.junit.Assert;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PillowTest {
    private Pillow pillow;
    private Pillow pillow1;
    private Pillow pillow2;

    @Before
    public void setUp() throws Exception {
        pillow = new Pillow(001, 1, 1.25, true);
        pillow1 = new Pillow(002, 2, 1.5, false);
        pillow2 = new Pillow(003, 2, 1.75, true);
    }

    @org.junit.jupiter.api.Test
    void getAllPillows() {
        List<Pillow> expected = Pillow.getAllPillows();

        List<Pillow> actual = new ArrayList<>();
        actual.add(pillow);
        actual.add(pillow1);
        actual.add(pillow2);

        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void getHowManyPillows() {
        int expected = Pillow.getHowManyPillows();
        int actual = 3;
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void getAllAgePillows() {
        int expected = Pillow.getAllAgePillows();
        int actual = 35 + 34 + 7;
        Assert.assertEquals(expected, actual);
    }

}