package shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void yieldsToothbrush_createProduct(){
        Product p = new Product("1232384","toothbrush");
        assertEquals("toothbrush",p.getName());
    }

}