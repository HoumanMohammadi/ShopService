package de.iav.ShopService;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    //Method + should + when
    @Test

    void list_WhenProductMapIsEmpty_shouldReturnNoProduct(){

        //Given
        //Instance: a concrete object of type

        Map<String, Product> expectedProductList= new HashMap<>();

        ProductRepo productRepository= new ProductRepo(expectedProductList);
        //List<Product> expectedProductList= new ArrayList<>();

        //When
        List<Product> actualProductList = productRepository.getProductList();
        int expectedListLength=0;

        //Then
        assertEquals(actualProductList, productRepository.getProductList());
        assertEquals(expectedListLength, actualProductList.size());

    }

    @Test

    void list_WhenProductMapHasOneProduct_shouldReturnOneProduct(){
        //Given
        //Instance: a concrete object of type

        Product appleKeyboard = new Product("Apple Keyboard", "123");
        Map<String, Product> expectedProductMap= new HashMap<>();
        expectedProductMap.put("1", appleKeyboard);
        ProductRepo productRepository= new ProductRepo(expectedProductMap);

        //When
        List<Product> actualProductList = productRepository.getProductList();
        int expectedListLength=1;

        //Then
        assertEquals(actualProductList, productRepository.getProductList());
        assertEquals(expectedListLength, actualProductList.size());

    }

}