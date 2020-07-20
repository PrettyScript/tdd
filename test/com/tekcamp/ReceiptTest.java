package com.tekcamp;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class ReceiptTest {

    @Test
    void printReceipt() {
        Receipt receipt = new Receipt();
        Order order = new Order();
        DecimalFormat decimalFormat = new DecimalFormat();
        Calculations calculations = new Calculations();

        Product cd = new Product("music CD", 14.99, true);
        Product book = new Product("book", 12.49, false);
        Product chocolateBar = new Product("chocolate bar", 0.85, false);

        order.addToCart(book);
        order.addToCart(cd);
        order.addToCart(chocolateBar);

        String productName = order.getCartItems().get(0).getProductName();
        double productPrice = order.getCartItems().get(0).getProductPrice();

        String productTwoName = order.getCartItems().get(1).getProductName();
        double productTwoPrice = order.getCartItems().get(1).getProductPrice();

        String productThreeName = order.getCartItems().get(2).getProductName();
        double productThreePrice = order.getCartItems().get(2).getProductPrice();

        String expected = "";
        expected += "\n====== RECEIPT ======";

        expected += "\n1. " + productName + ": $" + productPrice;
        expected += "\n2. " + productTwoName + ": $" + productTwoPrice;
        expected += "\n3. " + productThreeName + ": $" + productThreePrice;

        expected += "\n===== SALES TAX =====";
        expected += "\n$1.50";

        expected += "\n======= TOTAL =======";
        expected += "\n$29.83";
        String actual = receipt.printReceipt(order);

        assertEquals(expected, actual);
    }
}