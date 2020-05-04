package service;

import model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findOne(long id);

    Customer save(Customer customer);

    void remove(long id );
}
