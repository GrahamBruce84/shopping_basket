package com.example.grahambruce.shoppingbasket;

/**
 * Created by grahambruce on 22/07/2017.
 */

class Item {
    private String name;
    private double cost;

    public Item(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
