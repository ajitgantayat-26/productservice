package com.logixal.ProductService.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private int id;
    private String name;
    private int quantity;
    private String type;
}
