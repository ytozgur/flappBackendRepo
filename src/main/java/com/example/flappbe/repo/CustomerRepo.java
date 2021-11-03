package com.example.flappbe.repo;

import com.example.flappbe.model.customer.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<CustomerModel, Long> {
}
