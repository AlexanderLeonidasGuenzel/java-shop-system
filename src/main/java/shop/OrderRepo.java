package shop;

import java.util.HashMap;
import java.util.Map;

public class OrderRepo {

    private Map<String, Order> orders;

    public OrderRepo(Order... orderArray) {
        this();
        for(Order order : orderArray){
            this.orders.put(order.getId(), order);
        }
    }
    public OrderRepo(Map<String, Order> orders) {
        this.orders = orders;
    }
    public OrderRepo() {
        this.orders = new HashMap<>();
    }

    public Map<String, Order> list(){
        return this.orders;
    }
    public Order get(String key){
        return orders.get(key);

    }

    public void add(Order order){
        orders.put(order.getId(), order);

    }
}
