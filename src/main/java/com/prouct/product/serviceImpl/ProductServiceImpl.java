package com.prouct.product.serviceImpl;

import com.prouct.product.dao.ProductDao;
import com.prouct.product.exceptionHandling.ProductAlreadyExistsException;
import com.prouct.product.exceptionHandling.ProductNotFoundException;
import com.prouct.product.model.Product;
import com.prouct.product.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;

    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void addProduct(Product product) {
        Product existing = productDao.getProductByName(product.getName());
        if (existing != null) {
            throw new ProductAlreadyExistsException("Product with name '" + product.getName() + "' already exists.");
        }
        productDao.addProduct(product);
    }

    @Override
    public void updateProduct(Product product) {
        productDao.updateProduct(product);
    }

    @Override
    public void deleteProduct(Long id) {
        getProductById(id);
        productDao.deleteProduct(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }

    @Override
    public Product getProductById(Long id) {
        Product product = productDao.getProductById(id);
        if (product == null) {
            throw new ProductNotFoundException("Product not found with ID: " + id);
        }
        return product;
    }
}
