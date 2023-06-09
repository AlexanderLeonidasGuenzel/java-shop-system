package shop;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ShopService shop = new ShopService();
        System.out.println(shop.listProducts());
        System.out.println(shop.getProduct("Virtual Reality Headset"));
        System.out.println(shop.listOrders());
        shop.addOrder(new Order("1", shop.getProduct("Virtual Reality Headset")));
        System.out.println(shop.listOrders());

    }
}
