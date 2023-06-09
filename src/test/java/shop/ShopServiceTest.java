package shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {
    @Test
    void yieldsToothbrush_getProduct(){
        assertEquals("toothbrush",new Product("23498sdf","toothbrush").getName());
    }

}