package com.ishan.BillingApp.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date paymentDate;

    private BigDecimal paymentAmount;

    private String paymentMethod; // CASH, CREDIT, DEBIT, ONLINE

    private String status; // PAID, PENDING

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

    // Getters and setters
}

