package shop;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ShopService shop = new ShopService();
        System.out.println(shop.getProduct("Virtual Reality Headset"));
        System.out.println(shop.listProducts());
        System.out.println(shop.listOrders());

        Product p1=shop.getProduct("Smartphone");
        Product p2=shop.getProduct("Laptop");
        Map<String, Product> productsToBuy = new HashMap<>();
        productsToBuy.put(p1.getName(), p1);
        productsToBuy.put(p2.getName(), p2);
        Order order = new Order("501", productsToBuy);
        shop.addOrder(order);
        System.out.println(shop.listOrders());

    }
}
