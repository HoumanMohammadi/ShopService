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
        return (List<Product>) values;
    }

    public String


    @Override
    public String toString() {
        return "ProductRepo{" +
                "productList=" + productMap +
                '}';
    }

    public Product get(String productID) {
        productMap.get(productID);
    }
}
