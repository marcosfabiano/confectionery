package com.fabianoapp.confectionery.repositories;

import com.fabianoapp.confectionery.entities.Product;
import com.fabianoapp.confectionery.entities.enums.ProductType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT obj FROM Product obj " +
            "WHERE UPPER(obj.name) LIKE UPPER(CONCAT('%', :name, '%')) AND "
            + "(:productType IS NULL OR obj.productType = :productType)")
    Page<Product> searchByName(String name, ProductType productType, Pageable pageable);
}
