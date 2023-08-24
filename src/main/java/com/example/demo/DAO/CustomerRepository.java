package com.example.demo.DAO;

import com.example.demo.Model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
public List<Customer> findByGender(String gender);
}
