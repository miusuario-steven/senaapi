package com.sena.senaapi.service;
import com.sena.senaapi.entity.Product;
import com.sena.senaapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository repository;

    @Override
    public List<Product> findAll(){
        return repository.findAll();
    } 
}
