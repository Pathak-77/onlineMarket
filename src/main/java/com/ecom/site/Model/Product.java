package com.ecom.site.Model;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table (name = "Product_List")
public class Product {


   @GeneratedValue (strategy = GenerationType.IDENTITY)
   @Id
   private int product_id;
   public String product_name;
   private int product_price;
   private  String product_image;
   private String product_description;
   private int product_quantity;

}
