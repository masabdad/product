package com.prouct.product.dao;

import com.prouct.product.model.Product;

import java.util.List;

public interface ProductDao {

        void addProduct(Product product);
        void updateProduct(Product product);
        void deleteProduct(Long id);
        List<Product> getAllProducts();
        Product getProductById(Long id);
        Product getProductByName(String name);
    }


