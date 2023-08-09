package com.talan.pipelineflowproject.service;

import com.talan.pipelineflowproject.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> getAllProducts();
    Optional<Product> getProductById(Long id);
}
