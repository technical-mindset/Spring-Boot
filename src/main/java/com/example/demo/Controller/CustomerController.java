package com.example.demo.Controller;


import com.example.demo.Model.Customer;
import com.example.demo.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService cs;


    @GetMapping
    public List<Customer> getCustomers(){
         return this.cs.getCustomers();
    }
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable("id") long id){
         return this.cs.getCustomer(id);
    }
    @PostMapping
    public String addCustomer(@RequestBody Customer customer){
        return this.cs.addCustomer(customer);
    }
    @PutMapping("/{id}")
    public String updateCustomer(@RequestBody Customer customer, @PathVariable("id") long id){
        return this.cs.updateCustomer(customer, id);
    }
    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable("id") long id){
        return this.cs.deleteCustomer(id);
    }

}
