package shop;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    private Product p1 = new Product("378","apple");
    private Product p2 = new Product("375","banana");
    private Product p3 = new Product("379","shoe");
    private Product p4 = new Product("370","t-shirt");

    private ProductRepo pr1 = new ProductRepo(p1, p2, p3, p4);

    @Test
    void yieldsAllListOfProducts(){
        Map<String, Product> list = new HashMap<>();

        assertEquals();

    }

}