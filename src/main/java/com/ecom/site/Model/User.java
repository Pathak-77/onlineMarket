package com.ecom.site.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "userTable")
public class User {


    @Id
   private String username;
   private String Name;
   private String Password;
   private String role;

   public String getUsername() {
       return username;
   }

   public String getPassword() {
       return Password;
   }

}
