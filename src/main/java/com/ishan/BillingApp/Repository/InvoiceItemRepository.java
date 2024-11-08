package com.ishan.BillingApp.Repository;

import com.ishan.BillingApp.Models.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemRepository  extends JpaRepository<InvoiceItem ,Long> {

    // You can add custom queries if required
}
