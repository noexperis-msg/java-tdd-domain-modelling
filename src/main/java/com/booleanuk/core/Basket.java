package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    private final HashMap<String, Integer> items;

    public Basket() {
        this.items = new HashMap<>();
    }

    public Basket(HashMap<String, Integer> basket) {
        this.items = basket;
    }

    public boolean add(String product, int price) {
        if (this.items.containsKey(product)) {
            return false;
        }
        this.items.put(product, price);
        return true;
    }

    public int total() {
        int total = 0;
        for (int price : this.items.values()) {
            total += price;
        }
        return total;
    }

    public void clearBasket() {
        this.items.clear();
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }
}
