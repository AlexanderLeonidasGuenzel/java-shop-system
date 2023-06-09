package shop;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void getId() {
        Product p1 = new Product("101", "apple");
        Product p2 = new Product("102", "banana");
        Map<String, Product> products = new HashMap<>();
        products.put(p1.getName(), p1);
        products.put(p2.getName(), p2);
        Order o1 = new Order("001", products);
        assertEquals("001", o1.getId());
    }

    @Test
    void setId() {
        Order o1 = new Order("001");
        o1.setId("002");
        assertEquals("002", o1.getId());
    }

    @Test
    void getProducts() {
        Product p1 = new Product("101", "apple");
        Product p2 = new Product("102", "banana");
        Map<String, Product> products = new HashMap<>();
        products.put(p1.getName(), p1);
        products.put(p2.getName(), p2);
        Order o1 = new Order("001", products);
        assertEquals(products, o1.getProducts());
    }

    @Test
    void setProducts() {
        Product p1 = new Product("101", "apple");
        Product p2 = new Product("102", "banana");
        Product p3 = new Product("103", "ananas");
        Map<String, Product> products = new HashMap<>();
        Map<String, Product> products2 = new HashMap<>();
        products.put(p1.getName(), p1);
        products.put(p2.getName(), p2);
        products2.put(p3.getName(), p3);
        Order o1 = new Order("001", products);
        o1.setProducts(products2);
        assertEquals(products2, o1.getProducts());
    }
}