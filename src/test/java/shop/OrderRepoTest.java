package shop;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepoTest {

    @Test
    void list() {
        Order o1 = new Order("201");
        Order o2 = new Order("202");
        Order o3 = new Order("203");
        OrderRepo orderRepo = new OrderRepo(o1, o2, o3);
        Map<String, Order> orders = new HashMap<>();
        orders.put(o1.getId(),o1);
        orders.put(o2.getId(),o2);
        orders.put(o3.getId(),o3);
        assertEquals(orders, orderRepo.list());
    }

    @Test
    void get() {
        Order o1 = new Order("201");
        OrderRepo orderRepo = new OrderRepo(o1);
        assertEquals(o1, orderRepo.get("201"));
    }

    @Test
    void add() {
        Order o1 = new Order("201");
        OrderRepo orderRepo = new OrderRepo();
        orderRepo.add(o1);
        assertEquals(o1, orderRepo.get("201"));
    }
}