package com.tekcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product book = new Product("book", 12.49, false);
    Product importedPerfume = new Product("imported perfume", 47.50, true);


    @Test
    void getProductPrice() {
        assertEquals(12.49, book.getProductPrice());
        assertEquals(47.50, importedPerfume.getProductPrice());
    }

    @Test
    void getProductName() {
        assertEquals("book", book.getProductName());
        assertEquals("imported perfume", importedPerfume.getProductName());
    }

    @Test
    void isTaxable() {
        assertFalse(book.isTaxable());
        assertTrue(importedPerfume.isTaxable());
    }

    @Test
    void isImported() {
        assertFalse(book.isImported());

        importedPerfume.setImported(true);
        assertTrue(importedPerfume.isImported());

    }

}