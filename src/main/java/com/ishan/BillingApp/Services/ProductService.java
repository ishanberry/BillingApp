package com.ishan.BillingApp.Services;

import com.ishan.BillingApp.Models.Product;
import com.ishan.BillingApp.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // this logic returning the all product from the db
    public List<Product> findAllProduct(){
       return productRepository.findAll();
    }
    //  save the product
    public void SaveProduct(Product product)
    {
        productRepository.save(product);
    }

    // update the product
//    public Product UpdateProduct(Product product){
//
//    }


    // delete the product in db in inventory  or in the client

    public void DeleteProduct(Product product)
    {
        productRepository.delete(product);
    }

}
