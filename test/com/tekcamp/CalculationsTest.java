package com.tekcamp;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculationsTest {

    @Test
    void calculate() {
        Calculations calculations = new Calculations();
        Order order = new Order();

        Product cd = new Product("music CD", 14.99, true);
        Product book = new Product("book", 12.49, false);
        Product chocolateBar = new Product("chocolate bar", 0.85, false);

        order.addToCart(book);
        order.addToCart(cd);
        order.addToCart(chocolateBar);

        List<Double> actual = calculations.calculate(order);
        List<Double> expected = new ArrayList<>();
        expected.add(29.83);
        expected.add(1.50);
        assertEquals(expected, actual);

    }
}