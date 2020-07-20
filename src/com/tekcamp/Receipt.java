package com.tekcamp;

import java.text.DecimalFormat;

public class Receipt {

    public String printReceipt(Order order) {
        Calculations calculations = new Calculations();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String receipt = "";
        receipt += "\n====== RECEIPT ======";
        for (int i = 0; i <order.cart.size() ; i++) {
            String productName = order.getCartItems().get(i).getProductName();
            double productPrice = order.getCartItems().get(i).getProductPrice();

            receipt += "\n" + (i+1) + ". " + productName + ": $" + productPrice;
        }

        receipt += "\n===== SALES TAX =====";
        receipt += "\n$" + decimalFormat.format(calculations.calculate(order).get(1));

        receipt += "\n======= TOTAL =======";
        receipt += "\n$" + decimalFormat.format(calculations.calculate(order).get(0));
        return receipt;
    }
}
