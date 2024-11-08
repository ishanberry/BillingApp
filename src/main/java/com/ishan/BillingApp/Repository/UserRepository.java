package com.ishan.BillingApp.Repository;

import com.ishan.BillingApp.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {

    User findByUsername(String username);
    // To find user by username (common for authentication)

}
