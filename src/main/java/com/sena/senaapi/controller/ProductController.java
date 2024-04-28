package com.sena.senaapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.sena.senaapi.entity.Product;

import com.sena.senaapi.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("api/Product")
public class ProductController {
    
    @Autowired
    ProductService productService;

    @GetMapping("/findAll")
    public List<Product> findAll(){
        return productService.findAll();
    }
}
