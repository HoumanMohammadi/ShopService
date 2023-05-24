package de.iav.ShopService;

import java.util.*;

public class ProductRepo {

    private Map<String, Product> productMap;

    public ProductRepo(Map<String, Product> productMap) {
        this.productMap = productMap;
    }

    public ProductRepo() {
        productMap= new HashMap<>();
    }

    public List<Product> getProductList() {
        Collection<Product> values= productMap.values();
        return new ArrayList<>(values);
    }


    public Product get(String productID) {
        return productMap.get(productID);
    }
}
