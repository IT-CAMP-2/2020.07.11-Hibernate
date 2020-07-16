package pl.camp.it;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import pl.camp.it.dao.CustomerDAO;
import pl.camp.it.dao.ProductDAO;
import pl.camp.it.model.Address;
import pl.camp.it.model.Customer;
import pl.camp.it.model.Invoice;
import pl.camp.it.model.Product;

import java.util.Date;
import java.util.List;

public class App {

    public static SessionFactory sessionFactory =
            new Configuration().configure().buildSessionFactory();

    public static void main(String[] args) {
        /*System.out.println("Hibernate !!");



        Customer customer = new Customer();
        //customer.setId(10);
        customer.setName("Mateusz");
        customer.setSurname("Bereda");
        customer.setPesel(543543543543L);

        Address address = new Address();
        address.setCity("Krakow");
        address.setStreet("Ogrodowa");

        customer.setAddress(address);

        Invoice invoice = new Invoice();
        invoice.setDate(new Date());
        invoice.setSignature("FV/1/7/2020");

        customer.getInvoices().add(invoice);

        CustomerDAO.saveCustomerToDatabase(customer);

        Invoice invoice2 = new Invoice();
        invoice2.setDate(new Date());
        invoice2.setSignature("FV/2/7/2020");

        customer.getInvoices().add(invoice2);

        Product product = new Product();
        product.setPrice(100.0);
        product.setName("Mikser");
        product.getCustomers().add(customer);
        customer.getProducts().add(product);

        CustomerDAO.saveCustomerToDatabase(customer);

        Customer customer2 = new Customer();
        customer2.setName("Jan");
        customer2.setSurname("Kowalski");
        customer2.setPesel(67458746584L);

        CustomerDAO.saveCustomerToDatabase(customer2);

        System.out.println(customer2);

        Customer customer3 = new Customer();
        customer3.setId(2);
        customer3.setPesel(235464356L);
        customer3.setSurname("jhasgdf");
        customer3.setName("jsadf");

        CustomerDAO.saveCustomerToDatabase(customer3);
        System.out.println(customer2);

        System.out.println("CUSTOMER 1");
        System.out.println(CustomerDAO.getCustomerById(1));

        System.out.println(CustomerDAO.getAllCustomers());

        Product p = ProductDAO.getProductById(1);
        System.out.println(p.toString2());*/
    }
}
