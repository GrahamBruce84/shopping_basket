package com.example.grahambruce.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by grahambruce on 22/07/2017.
 */

public class BasketTest {

    Basket basket;
    Customer customer;
    Item item;
    Item item2;
    Item item3;
    Item item4;

    @Before
    public void setUp() throws Exception {
        this.basket = new Basket();
        this.customer = new Customer(true);
        this.item = new Item("Cheese", 5);
        this.item2 = new Item("Bread", 2);
        this.item3 = new Item("pizza", 5);
        this.item4 = new Item("Gin", 15);

    }

    @Test
    public void checkCartSize(){
        assertEquals(0, basket.getCartSize());
    }

    @Test
    public void canAddToCart() throws Exception {
        basket.addToCart(item);
        assertEquals(1, basket.getCartSize());
    }

    @Test
    public void canRemoveFromCart() throws Exception {
        basket.addToCart(item);
        basket.removeFromCart(item);
        assertEquals(0, basket.getCartSize());
    }

    @Test
    public void canEmptyCart() throws Exception {
        basket.addToCart(item);
        basket.addToCart(item2);
        basket.emptyCart();
        assertEquals(0, basket.getCartSize());
    }

    @Test
    public void getTotalCost() throws Exception {
        basket.addToCart(item);
        basket.addToCart(item2);
        assertEquals(7, basket.totalCost());
    }

    @Test
    public void checkCanGet10PercentDiscount() throws Exception {
        basket.addToCart(item);
        basket.addToCart(item2);
        basket.addToCart(item4);
        assertEquals(true, basket.canGet10PercentDiscount());
    }

    @Test
    public void canGive10PercentDiscount() throws Exception {
        basket.addToCart(item4);
        basket.addToCart(item);
        basket.addToCart(item2);
        assertEquals(17.60, 17.60, basket.give10PercentDiscount());
    }

    @Test
    public void canGiveLoyaltyDiscount() throws Exception {
        basket.addToCart(item4);
        basket.addToCart(item);
        basket.addToCart(item2);
        assertEquals(17.25, 17.25, basket.giveLoyaltyDiscount(customer));
    }
}
