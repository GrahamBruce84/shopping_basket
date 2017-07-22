package com.example.grahambruce.shoppingbasket;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by grahambruce on 22/07/2017.
 */

public class BasketTest {

    Basket basket;
    Item item;

    @Test
    public void checkCartSize(){
        assertEquals(0, basket.getCartSize());
    }

    @Test
    public void addToCart() throws Exception {
        basket.addToCart(item);
        assertEquals(1, basket.getCartSize());
    }
}
