package com.ishan.BillingApp.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    private String name;

    private String description;

    private BigDecimal price; // Price per unit

    private BigDecimal taxRate;  // Tax rate applied to the product

    private String pieces; // Optional, unit like "pieces", "kg", etc.

    // getters and setters are  done by lombok

}
