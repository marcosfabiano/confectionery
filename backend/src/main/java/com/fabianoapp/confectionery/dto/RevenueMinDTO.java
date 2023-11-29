package com.fabianoapp.confectionery.dto;

import com.fabianoapp.confectionery.entities.Revenue;

public class RevenueMinDTO {

    private Long id;
    private String name;
    private String preparation;

    public RevenueMinDTO(Long id, String name, String preparation) {
        this.id = id;
        this.name = name;
        this.preparation = preparation;
    }

    public RevenueMinDTO(Revenue entity) {
        id = entity.getId();
        name = entity.getName();
        preparation = entity.getPreparation();
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
}
