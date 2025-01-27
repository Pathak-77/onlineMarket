package com.ecom.site.service;

import com.ecom.site.Model.Product;
import com.ecom.site.repo.ProductRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    public ProductRepo productRepository;

    @Autowired
    public void setProduct(ProductRepo productRepo) {
        this.productRepository =  productRepo;
    }

    public void addProduct(Product addedProduct) {
        productRepository.save(addedProduct);
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }

    @Transactional
    public void updateProduct(Product product) {
        try {
            productRepository.save(product);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Product getProduct(int id){
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
