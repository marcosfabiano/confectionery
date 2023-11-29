package com.fabianoapp.confectionery.dto;

import com.fabianoapp.confectionery.entities.Product;
import com.fabianoapp.confectionery.entities.enums.MeasurementUnit;
import com.fabianoapp.confectionery.entities.enums.ProductType;

public class ProductMinDTO {

    private Long id;
    private String name;
    private String imgUrl;
    private Double stockQuantity;
    private Double packageQuantity;
    private MeasurementUnit measurementUnit;
    private Double price;
    private ProductType productType;

    public ProductMinDTO(Long id, String name, String imgUrl, Double stockQuantity, Double packageQuantity, MeasurementUnit measurementUnit, Double price, ProductType productType) {
        this.id = id;
        this.name = name;
        this.imgUrl = imgUrl;
        this.stockQuantity = stockQuantity;
        this.packageQuantity = packageQuantity;
        this.measurementUnit = measurementUnit;
        this.price = price;
        this.productType = productType;
    }

    public ProductMinDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        stockQuantity = entity.getStockQuantity();
        packageQuantity = entity.getPackageQuantity();
        measurementUnit = entity.getMeasurementUnit();
        imgUrl = entity.getImgUrl();
        price = entity.getPrice();
        productType = entity.getProductType();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Double getStockQuantity() {
        return stockQuantity;
    }

    public Double getPackageQuantity() {
        return packageQuantity;
    }

    public MeasurementUnit getMeasurementUnit() {
        return measurementUnit;
    }

    public Double getPrice() {
        return price;
    }

    public ProductType getProductType() {
        return productType;
    }
}