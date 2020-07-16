package pl.camp.it.dao;

import pl.camp.it.model.Customer;

import java.util.List;

public interface ICustomerDAO {
    void saveCustomerToDatabase(Customer customer);
    void deleteCustomer(Customer customer);
    Customer getCustomerById(int id);
    List<Customer> getAllCustomers();
}
