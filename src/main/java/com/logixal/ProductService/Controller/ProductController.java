package com.logixal.ProductService.Controller;

import com.logixal.ProductService.Dto.Product;
import com.logixal.ProductService.Service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService service;
    public ProductController(ProductService service){
        this.service=service;
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProductList(){
       List<Product> listOfProduct =  service.getProduct();
       return new ResponseEntity<>(listOfProduct, HttpStatus.OK);
    }
}
