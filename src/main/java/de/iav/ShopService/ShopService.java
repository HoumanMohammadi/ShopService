package de.iav.ShopService;

import java.util.List;

public class ShopService {

    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public ShopService() {
        productRepo = new ProductRepo();
        orderRepo= new OrderRepo();
    }

    public List<Product> listProducts(){
        return productRepo.getProductList();
    }

    public Product getProduct(String productID){
        return productRepo.get(productID);
    }

    public void addOrder(String orderID, Order order){
        orderRepo.add(orderID, order);
    }

    public Order getOrder(String orderID){
        return orderRepo.get(orderID);
    }

    public List<Order> listOrders(){
        return orderRepo.getOrderList();
    }


}
