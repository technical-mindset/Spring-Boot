package com.example.demo.Service;

import com.example.demo.Model.Customer;
import com.example.demo.Model.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public List<Customer> getCustomers(){
        Iterable<Customer> it = this.customerRepository.findAll();
        List<Customer> list = new ArrayList<>();
        it.forEach(list::add);
        return list;
    }
    public String addCustomer(Customer customer){
        this.customerRepository.save(customer);
        return "Added Successfully !!";
    }
    public Customer getCustomer(long id){
        return this.customerRepository.findById(id).get();
    }


    public String updateCustomer(Customer customer, long id) {
        String msg = "Updated Successful !!";
        if (this.customerRepository.findById(id).isPresent()) {
            Customer existCustomer = this.customerRepository.findById(id).get();
            existCustomer.setName(customer.getName());
            existCustomer.setGender(customer.getGender());
            this.customerRepository.save(existCustomer);
        }
        else {
            msg = "This customer doesn't exists !!";
        }

        return msg;
    }

    public String deleteCustomer(long id) {
        if (this.customerRepository.findById(id).isPresent()) {
            this.customerRepository.deleteById(id);
            return "Deleted !!";
        }
        return "Doesn't exists";
    }
}
