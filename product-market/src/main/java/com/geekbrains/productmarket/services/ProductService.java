package com.geekbrains.productmarket.services;

import com.geekbrains.productmarket.dto.ProductDto;
import com.geekbrains.productmarket.entities.Product;
import com.geekbrains.productmarket.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {
    private ProductRepository productRepository;

    public Optional<ProductDto> findDtoById(Long id){
        return productRepository.findOneById(id);
    }

    public Page<Product> findAll(int page, int size, Integer min, Integer max) {
        if (min == 0 & max == 0) {
            return productRepository.findAll(PageRequest.of(page, size));
        }else if (min == 0 & max != 0) {
            return productRepository.getProductByPriceGreaterThanEqual(max, PageRequest.of(page, size));
        } else if (min != 0 & max == 0) {
            return productRepository.getProductByPriceLessThanEqual(min, PageRequest.of(page, size));
        } else  {
            return productRepository.getProductByPriceGreaterThanEqualAndPriceLessThanEqual(min, max, PageRequest.of(page, size));
        }

    }

}
