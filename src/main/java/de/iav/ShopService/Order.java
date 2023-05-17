package de.iav.ShopService;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String orderID;

    private List<Product> productList= new ArrayList<>();

    public Order(String orderID, List<Product> productList) {
        this.orderID = orderID;
        this.productList = productList;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", productList=" + productList +
                '}';
    }
}
