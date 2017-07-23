package com.example.grahambruce.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by grahambruce on 22/07/2017.
 */

class Basket {

    private ArrayList<Item> cart;
    Customer customer;

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

    public void removeFromCart(Item item) {
        cart.remove(item);
    }

    public void emptyCart() {
        cart.clear();
    }

    public int totalCost() {
        int count = 0;
        for (Item item : cart) {
            count += item.getCost();
        }
        return count;
    }

    public boolean canGet10PercentDiscount() {
        if (totalCost() >= 20) {
            return true;
        }
        return false;
    }

    public double give10PercentDiscount() {
        if (canGet10PercentDiscount()) {
            double discount = (totalCost() - (totalCost() / 100) * 10);
            return discount;
        }
        return totalCost();
    }
    public boolean canGiveLoyaltyDiscount(Customer customer){
        if(customer.hasLoyaltyCard()){
            return true;
        }
        return false;
    }

    public double giveLoyaltyDiscount(Customer customer) {
        if(canGiveLoyaltyDiscount(customer)){
           double loyaltyDiscount = (give10PercentDiscount() - (give10PercentDiscount()/100) * 2);
            return loyaltyDiscount;
        }
        return give10PercentDiscount();
    }
}

