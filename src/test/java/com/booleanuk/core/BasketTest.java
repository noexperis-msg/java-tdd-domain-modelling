package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class BasketTest {
    private HashMap<String, Integer> getFilledBasket() {
        HashMap<String, Integer> filledBasket = new HashMap<>();
        filledBasket.put("Nugatti", 40);
        filledBasket.put("Kreatin", 249);
        return filledBasket;
    }

    @Test
    public void getEmptyBasketObject() {
        Basket testBasket = new Basket();
        Assertions.assertEquals(new HashMap<String, Integer>(), testBasket.getItems());
    }

    @Test
    public void getBasketObject() {
        Basket testBasket = new Basket(getFilledBasket());
        Assertions.assertEquals(getFilledBasket(), testBasket.getItems());
    }

    @Test
    public void returnFalseIfProductExists() {
        Basket testBasket = new Basket(getFilledBasket());
        Assertions.assertFalse(testBasket.add("Nugatti", 40));
    }

    @Test
    public void returnTrueIfProductDoesNotExist() {
        Basket testBasket = new Basket(getFilledBasket());
        Assertions.assertTrue(testBasket.add("Makrell i tomat", 13));
    }

    @Test
    public void getTotalPrice() {
        Basket testBasket = new Basket(getFilledBasket());
        Assertions.assertEquals(289, testBasket.total());
    }

    @Test
    public void clearBasket() {
        Basket testBasket = new Basket(getFilledBasket());
        testBasket.clearBasket();
        Assertions.assertTrue(testBasket.getItems().isEmpty());
    }
}
