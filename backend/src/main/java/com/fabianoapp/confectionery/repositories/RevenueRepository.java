package com.fabianoapp.confectionery.repositories;

import com.fabianoapp.confectionery.entities.Revenue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RevenueRepository extends JpaRepository<Revenue, Long> {

    @Query("SELECT obj FROM Revenue obj " +
            "WHERE UPPER(obj.name) LIKE UPPER(CONCAT('%', :name, '%'))")
    Page<Revenue> searchByName(String name, Pageable pageable);

}
