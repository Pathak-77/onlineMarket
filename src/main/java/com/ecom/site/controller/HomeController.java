package com.ecom.site.controller;

import com.ecom.site.Model.Product;
import com.ecom.site.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {

   private ProductService productService;
    @Autowired
    public void setProductService(ProductService Service) {
        this.productService = Service;
    }
    @GetMapping("/home")
    public String home() {
        return "hello world";
    }

    @PostMapping("/add")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @GetMapping("/get/{id}")
    public Product getProduct(@PathVariable int id) {
       return  productService.getProduct(id);
    }

    @GetMapping("/remove/{id}")
    public void deleteProduct(@PathVariable int id) {
         productService.deleteProduct(id);
    }

    @PutMapping("update/add")
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }

    @GetMapping("/viewall")
    public List<Product> getAllItems() {
       return productService.getAllProducts() ;
    }

}
