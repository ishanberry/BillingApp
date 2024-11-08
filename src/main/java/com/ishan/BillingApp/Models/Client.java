package com.ishan.BillingApp.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String contactNumber;

    private String address;

    private String subscriptionStatus; // ACTIVE, EXPIRED, TRIAL

    private Date createdAt;

    // Relationships
    @OneToMany(mappedBy = "client")
    private List<Invoice> invoices;

    // Getters and setters by Lombok
}
