package com.example.grahambruce.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by grahambruce on 22/07/2017.
 */

public class ItemTest {

    Item item;

    @Before
    public void setUp() throws Exception {
        this.item = new Item("milk", 3);
    }

    @Test
    public void checkGetName() throws Exception {
        assertEquals("milk", item.getName());
    }

    @Test
    public void checkGetCost() throws Exception {
        assertEquals(3, 3, item.getCost());
    }
}
