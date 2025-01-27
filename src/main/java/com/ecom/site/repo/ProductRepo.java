package com.ecom.site.repo;

import com.ecom.site.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class ProductRepo implements JpaRepository<Product, Integer> {
}
