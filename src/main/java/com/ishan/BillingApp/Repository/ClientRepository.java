package com.ishan.BillingApp.Repository;

import com.ishan.BillingApp.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client ,Long> {
    // You can add custom queries here if needed, for example:
    // Client findByEmail(String email);

}
