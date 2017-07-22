package com.example.grahambruce.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by grahambruce on 22/07/2017.
 */

class Basket {

    private ArrayList<Item> cart;

    public Basket() {
        this.cart = new ArrayList<Item>();
    }

    public ArrayList<Item> getCart() {
        return this.cart;
    }


    public int getCartSize() {
        return this.cart.size();
    }

    public void addToCart(Item item) {
        cart.add(item);
    }
}
