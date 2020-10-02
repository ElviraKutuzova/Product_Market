package com.geekbrains.productmarket.repositories;

import com.geekbrains.productmarket.dto.ProductDto;
import com.geekbrains.productmarket.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long > {
    Optional<ProductDto> findOneById(Long id);

    Page<Product> getProductByPriceGreaterThanEqual(int minprice, Pageable var);
    Page<Product> getProductByPriceLessThanEqual(int maxprice, Pageable var);
    Page<Product> getProductByPriceGreaterThanEqualAndPriceLessThanEqual(int minprice, int maxprice, Pageable var);

}
