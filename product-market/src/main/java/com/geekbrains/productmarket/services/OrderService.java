package com.geekbrains.productmarket.services;

import com.geekbrains.productmarket.entities.Order;
import com.geekbrains.productmarket.entities.Product;
import com.geekbrains.productmarket.repositories.OrderRepository;
import com.geekbrains.productmarket.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

}
