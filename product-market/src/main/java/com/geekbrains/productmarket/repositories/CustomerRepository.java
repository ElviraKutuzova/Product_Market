package com.geekbrains.productmarket.repositories;

import com.geekbrains.productmarket.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long > {

//    Customer findByName(String name);
//    List<Customer> findAllByIdGreaterThan(Long minId);
//    List<Customer> findAllByIdGreaterThanOrderByIdDesc(Long mindId);

}
