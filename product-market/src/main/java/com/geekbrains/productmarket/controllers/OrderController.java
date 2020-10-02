package com.geekbrains.productmarket.controllers;

import com.geekbrains.productmarket.services.OrderService;
import com.geekbrains.productmarket.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/orders")
@AllArgsConstructor
public class OrderController {
    private OrderService orderService;

    @GetMapping
    public String firsRequest(Model model){
        model.addAttribute("orders", orderService.findAll());
         return "orders";
    }
}
