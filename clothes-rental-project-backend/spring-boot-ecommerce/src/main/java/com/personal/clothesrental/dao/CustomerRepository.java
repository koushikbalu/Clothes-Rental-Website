package com.personal.clothesrental.dao;

import com.personal.clothesrental.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
