package shop;

import java.util.HashMap;
import java.util.Map;

public class ProductRepo {

    private Map<String, Product> products;

    public ProductRepo(Product... productArray) {
        this.products = new HashMap<>();
        for (Product product: productArray
             ) {
             products.put(product.getName(),product);
        }
    }

    public ProductRepo() {
        Product[] productsArr = {
            new Product("001", "Smartphone"),
            new Product("002", "Laptop"),
            new Product("003", "Headphones"),
            new Product("004", "Smartwatch"),
            new Product("005", "Camera"),
            new Product("006", "Television"),
            new Product("007", "Gaming Console"),
            new Product("008", "Wireless Speaker"),
            new Product("009", "Tablet"),
            new Product("010", "Fitness Tracker"),
            new Product("011", "Bluetooth Earbuds"),
            new Product("012", "Digital Camera"),
            new Product("013", "External Hard Drive"),
            new Product("014", "Smart Home Assistant"),
            new Product("015", "Wireless Keyboard"),
            new Product("016", "Coffee Maker"),
            new Product("017", "Portable Charger"),
            new Product("018", "Virtual Reality Headset"),
            new Product("019", "Smart Thermostat"),
            new Product("020", "Robot Vacuum Cleaner")
        };
        this.products = new HashMap<String, Product>();
        for (Product p : productsArr) {
            products.put(p.getName(), p);
        }
    }

     public Map<String, Product> list(){
        return products;
    }

    public Product getProductByName(String key){
        return products.get(key);
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }
}
