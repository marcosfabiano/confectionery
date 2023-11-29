package com.fabianoapp.confectionery.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fabianoapp.confectionery.entities.Category;
import com.fabianoapp.confectionery.entities.Product;
import com.fabianoapp.confectionery.entities.enums.MeasurementUnit;
import com.fabianoapp.confectionery.entities.enums.ProductType;

public class ProductDTO {
    private Long id;
    @Size(min = 3, max = 80, message = "Nome precisar ter de 3 a 80 caracteres")
    @NotBlank(message = "Campo requerido")
    private String name;
    private String imgUrl;
    private Double stockQuantity;
    @NotNull(message = "Campo requerido")
    private Double packageQuantity;
    @NotNull(message = "Campo requerido")
    private MeasurementUnit measurementUnit;
    @NotNull(message = "Campo requerido")
    @Positive(message = "O preço deve ser positivo")
    private Double price;
    @NotNull(message = "Campo requerido")
    private ProductType productType;
    @NotEmpty(message = "Deve ter pelo menos uma categoria")
    private List<CategoryDTO> categories = new ArrayList<>();

    public ProductDTO(Long id, String name, String imgUrl, Double stockQuantity, Double packageQuantity, MeasurementUnit measurementUnit, Double price, ProductType productType) {
        this.id = id;
        this.name = name;
        this.imgUrl = imgUrl;
        this.stockQuantity = stockQuantity;
        this.packageQuantity = packageQuantity;
        this.measurementUnit = measurementUnit;
        this.price = price;
        this.productType = productType;
    }

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        imgUrl = entity.getImgUrl();
        stockQuantity = entity.getStockQuantity();
        packageQuantity = entity.getPackageQuantity();
        measurementUnit = entity.getMeasurementUnit();
        price = entity.getPrice();
        productType = entity.getProductType();
        for (Category cat : entity.getCategories()) {
        	categories.add(new CategoryDTO(cat));
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Double getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Double stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Double getPackageQuantity() {
        return packageQuantity;
    }

    public void setPackageQuantity(Double packageQuantity) {
        this.packageQuantity = packageQuantity;
    }

    public MeasurementUnit getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(MeasurementUnit measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public List<CategoryDTO> getCategories() {
		return categories;
	}
}
