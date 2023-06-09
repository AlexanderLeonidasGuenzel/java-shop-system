package shop;

import java.util.Map;

public class ShopService {
    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public ShopService() {
        this.productRepo = new ProductRepo();
        this.orderRepo = new OrderRepo();
    }

    public Product getProduct(String name) {
        return productRepo.getProductByName(name);
    }

    public Map<String, Product> listProducts() {
        return productRepo.list();
    }

    public void addOrder(Order newOrder) {
        orderRepo.add(newOrder);
    }

    public Order getOrder(String id) {
        return orderRepo.get(id);
    }

    public Map<String, Order> listOrders() {
        return orderRepo.list();
    }
}
