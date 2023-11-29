package com.fabianoapp.confectionery.dto;

import com.fabianoapp.confectionery.entities.RevenueItem;

public class RevenueItemDTO {

	private Long productId;
	private Double quantity;

	public RevenueItemDTO(Long productId, Double quantity) {
		this.productId = productId;
		this.quantity = quantity;
	}

	public RevenueItemDTO(RevenueItem entity) {
		productId = entity.getProduct().getId();
		quantity = entity.getQuantity();
	}

	public Long getProductId() {
		return productId;
	}

	public Double getQuantity() {
		return quantity;
	}
}
