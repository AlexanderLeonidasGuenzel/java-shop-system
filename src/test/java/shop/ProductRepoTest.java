package shop;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test
    void yields_ListOfAllProductsInProductRepo(){

         Product p1 = new Product("378","apple");
         Product p2 = new Product("375","banana");
         Product p3 = new Product("379","shoe");
         Product p4 = new Product("370","t-shirt");

         ProductRepo pr1 = new ProductRepo(p1, p2, p3, p4);

         Map<String, Product> products = new HashMap<>();
        products.put(p1.getName(),p1);
        products.put(p2.getName(),p2);
        products.put(p3.getName(),p3);
        products.put(p4.getName(),p4);

        assertEquals(products,pr1.list());
    }

    @Test
    void yields_ProductFromInsertedKey(){
        Product p1 = new Product("378","apple");
        ProductRepo pr1 = new ProductRepo(p1);
        assertEquals(p1, pr1.getProductByName("apple"));
    }

}