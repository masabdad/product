package com.prouct.product.service;

import com.prouct.product.model.Product;

import java.util.List;

public interface ProductService {

    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Long id);
    List<Product> getAllProducts();
    Product getProductById(Long id);
}
