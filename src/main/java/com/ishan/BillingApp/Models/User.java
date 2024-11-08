package com.ishan.BillingApp.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password; // Store securely with hashing

    private String role; // 'ROLE_ADMIN' or 'ROLE_USER'

    private String email; // Add email field

    private boolean active; // To check if the user is active or not


}
