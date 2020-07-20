package com.tekcamp;

import java.util.HashMap;

public class Product {

    private boolean isTaxable;
    private boolean isImported = false;

    private HashMap<String, Double> product = new HashMap<>();

    public Product(String key, double value, boolean isTaxable) {
        this.product.put(key, value);
        this.isTaxable = isTaxable;
    }

    public double getProductPrice() {
        return (double) product.values().toArray()[0];
    }

    public String getProductName() {
        return (String) product.keySet().toArray()[0];
    }

    public boolean isTaxable() {
        return isTaxable;
    }

    public boolean isImported() {
        return isImported;
    }

    public void setImported(boolean imported) {
        isImported = imported;
    }
}
