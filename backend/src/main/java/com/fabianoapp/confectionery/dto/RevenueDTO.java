package com.fabianoapp.confectionery.dto;

import com.fabianoapp.confectionery.entities.*;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

public class RevenueDTO {

	private Long id;
	private String name;
	private String preparation;

	@NotEmpty(message = "Deve ter pelo menos um item")
	private List<RevenueItemDTO> items = new ArrayList<>();

	public RevenueDTO(Long id, String name, String preparation) {
		this.id = id;
		this.name = name;
		this.preparation = preparation;
	}

	public RevenueDTO(Revenue entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.preparation = entity.getPreparation();
		for (RevenueItem item : entity.getItems()) {
			RevenueItemDTO itemDto = new RevenueItemDTO(item);
			items.add(itemDto);
		}
 	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPreparation() {
		return preparation;
	}

	public List<RevenueItemDTO> getItems() {
		return items;
	}
}
