package com.ishan.BillingApp.Repository;

import com.ishan.BillingApp.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product ,Long> {

// custom query method

    // You can add custom queries here if needed, for example:
     List<Product> findByCategory(String category);


}
