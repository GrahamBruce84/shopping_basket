package com.example.grahambruce.shoppingbasket;

/**
 * Created by grahambruce on 23/07/2017.
 */

public class Customer {

    boolean loyaltyCard;

    public Customer(boolean loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }

    public boolean hasLoyaltyCard() {
        return loyaltyCard;
    }

    public void setLoyaltyCard(boolean loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }
}
