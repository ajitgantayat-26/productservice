package com.logixal.ProductService.Service;

import com.logixal.ProductService.Dto.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getProduct(){
        List<Product> list = new ArrayList<>();
        Product product = new Product();
        product.setId(10);
        product.setName("KeyBoard");
        product.setQuantity(10);
        product.setType("Electronics");
        list.add(product);
        return list;
    }
}
