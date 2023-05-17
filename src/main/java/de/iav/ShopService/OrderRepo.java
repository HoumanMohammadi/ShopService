package de.iav.ShopService;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepo {

    private Map<String, Order> orderMap;

    public OrderRepo() {
        orderMap= new HashMap<>();
    }

    public OrderRepo(Map<String,Order> orderMap) {
        this.orderMap = orderMap;
    }

    public List<Order> getOrderList() {
        Collection<Order> value= orderMap.values();
        return (List<Order>) value;
    }

    public void setOrderMap(Map<String, Order> orderMap) {
        this.orderMap = orderMap;
    }

    public void add(String orderID, Order order){
        orderMap.put(orderID, order);
    }


    public Order get(String orderID) {
        orderMap.get(orderID);
    }


}
