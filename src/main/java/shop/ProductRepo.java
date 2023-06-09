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

     public Map<String, Product> list(){
        return products;
    }

    public Product getProductByName(String key){
        return products.get(key);
    }


}
