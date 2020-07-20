package com.tekcamp;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Calculations {

    public static Calculations getInstance() {
        return new Calculations();
    }

    public List<Double> calculate(Order order) {

        double salesTaxRate = 0.10;
        double importedTaxRate = 0.05;
        double salesTax = 0;
        double totalPrice = 0;
        List<Double> prices = new ArrayList<>();


        for (int i = 0; i < order.cart.size(); i++) {
            double productPrice = order.getCartItems().get(i).getProductPrice();
            Product currentProduct = order.cart.get(i);

            if(currentProduct.isImported()) {
                totalPrice += formatValue(productPrice * importedTaxRate);
                salesTax += formatValue(productPrice * importedTaxRate);
            }

            if(currentProduct.isTaxable()) {
                totalPrice += formatValue(productPrice * salesTaxRate);
                salesTax += formatValue(productPrice * salesTaxRate);
            }

                totalPrice += productPrice;


        }

        DecimalFormat decimalFormat = new DecimalFormat();
        prices.add(Double.parseDouble(decimalFormat.format(totalPrice)));
        prices.add(Double.parseDouble(decimalFormat.format(salesTax)));

        return prices;
    }


    private double formatValue(double value) {
        if(Double.toString(value).split("\\.")[1].length() > 2) {


            DecimalFormat decimalFormat = new DecimalFormat("0.##");
            return Double.parseDouble(decimalFormat.format(Math.ceil(value * 10) / 10));
        }
        return value;
    }

}















