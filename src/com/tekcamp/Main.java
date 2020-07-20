package com.tekcamp;

public class Main {

    public static void main(String[] args) {

        Product cd = new Product("music CD", 14.99, true);
        Product book = new Product("book", 12.49, false);
        Product chocolateBar = new Product("chocolate bar", 0.85, false);
        Product importedChocolate = new Product("imported chocolate", 10.00, false);
        Product importedChocolate2 = new Product("imported chocolate", 11.25, false);
        Product importedPerfume = new Product("imported perfume", 47.50, true);
        Product importedPerfume2 = new Product("imported perfume", 27.99, true);
        Product perfume = new Product("perfume", 18.99, true);
        Product headachePills = new Product("headache pills", 9.75, false);

        importedChocolate.setImported(true);
        importedPerfume.setImported(true);
        importedPerfume2.setImported(true);
        importedChocolate2.setImported(true);

        Order order = new Order();
        order.addToCart(book);
        order.addToCart(cd);
        order.addToCart(chocolateBar);

        Order order2 = new Order();
        order2.addToCart(importedChocolate);
        order2.addToCart(importedPerfume);

        Order order3 = new Order();
        order3.addToCart(importedPerfume2);
        order3.addToCart(perfume);
        order3.addToCart(headachePills);
        order3.addToCart(importedChocolate2);

        Calculations calculations = new Calculations();
        calculations.calculate(order);
        calculations.calculate(order2);
        calculations.calculate(order3);

        Receipt receipt = new Receipt();
        System.out.println(receipt.printReceipt(order));
        System.out.println(receipt.printReceipt(order2));
        System.out.println(receipt.printReceipt(order3));
    }
}
