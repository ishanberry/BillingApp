package com.ishan.BillingApp.Repository;

import com.ishan.BillingApp.Models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment ,Long> {
    // Custom queries can be added, for example:
    // List<Payment> findByInvoiceId(Long invoiceId);
}
