package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    SaleRepository saleRepository;

    @Override
    public void run(String... strings) throws Exception {
        Customer customer = new Customer();
        customer.setName("Elmo");

        Customer customer2=new Customer();
        customer2.setName("nora");

        Sale sale1 = new Sale();
        sale1.setName("tablet");
        sale1.setPrice(299.00);
        sale1.addcust(customer);
        sale1.addcust(customer2);

        Sale sale2 = new Sale();
        sale2.setName("web cam");
        sale2.setPrice(19.00);
        sale2.addcust(customer);
        customerRepository.save(customer2);
        customerRepository.save(customer);
        saleRepository.save(sale1);
        saleRepository.save(sale2);

    }
}
