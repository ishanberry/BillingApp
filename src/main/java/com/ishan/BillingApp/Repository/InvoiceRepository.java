package com.ishan.BillingApp.Repository;

import com.ishan.BillingApp.Models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice,Long> {
// Custom queries can be added, for example:
    // List<Invoice> findByClientId(Long clientId);
}
