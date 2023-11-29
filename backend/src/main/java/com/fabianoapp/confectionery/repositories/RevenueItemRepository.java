package com.fabianoapp.confectionery.repositories;

import com.fabianoapp.confectionery.entities.RevenueItem;
import com.fabianoapp.confectionery.entities.RevenueItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RevenueItemRepository extends JpaRepository<RevenueItem, RevenueItemPK> {

}
