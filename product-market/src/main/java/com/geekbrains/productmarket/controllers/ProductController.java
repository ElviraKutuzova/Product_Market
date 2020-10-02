package com.geekbrains.productmarket.controllers;

import com.geekbrains.productmarket.dto.ProductDto;
import com.geekbrains.productmarket.exceprion.ResourceNotFoundException;
import com.geekbrains.productmarket.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {
    private ProductService productService;

    @GetMapping
    public String showAllProducts(Model model,
                                  @RequestParam(required = false, defaultValue = "0") Integer max,
                                  @RequestParam(required = false, defaultValue = "0") Integer min,
                                  @RequestParam(defaultValue = "1", name = "p")Integer page){
        model.addAttribute("products", productService.findAll(page-1, 10, min, max));
        return "products";
    }

    @GetMapping("{id}")
    @ResponseBody
    public ProductDto showOneProducts(Model model, @PathVariable Long id){
        return productService.findDtoById(id).orElseThrow(() -> new ResourceNotFoundException("Product with id: " + id + " doesn't exists"));
    }



}
