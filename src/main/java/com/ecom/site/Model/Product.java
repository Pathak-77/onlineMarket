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
   public int product_id;
   public String product_name;
   public int product_price;
   public  String product_image;
   public String product_description;
   public int product_quantity;


}
