package com.tekcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {


    // this tests both "addToCart method and getCartItems method
    @Test
    void addToCart() {

        Product book = new Product("book", 12.49, false);

        Order order = new Order();
        order.addToCart(book);

        assertEquals("book" , order.getCartItems().get(0).getProductName());
        assertEquals(12.49 , order.getCartItems().get(0).getProductPrice());
    }

}