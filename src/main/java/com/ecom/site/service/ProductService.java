package com.ecom.site.service;

import com.ecom.site.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private Product product;


    private void setProduct(@Autowired Product product) {
        product = new Product();
    }

    private void addProduct() {

    }

    private void deleteProduct() {
    }

    private void updateProduct() {}

    private String getProduct(){
        return "null";
    }
}
