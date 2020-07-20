package com.tekcamp;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Product> cart = new ArrayList<>();


    public void addToCart(Product product) {
        cart.add(product);
    }

    public List<Product> getCartItems() {
        return cart;
    }
}
