package com.fabianoapp.confectionery.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_revenue_item")
public class RevenueItem {

    @EmbeddedId
    private RevenueItemPK id = new RevenueItemPK();

    private Double quantity;

    public RevenueItem() {
    }

    public RevenueItem(Revenue revenue, Product product, Double quantity) {
        id.setRevenue(revenue);
        id.setProduct(product);
        this.quantity = quantity;
    }

    public Revenue getRevenue() {
        return id.getRevenue();
    }

    public void setRevenue(Revenue revenue) {
        id.setRevenue(revenue);
    }

    public Product getProduct() {
        return id.getProduct();
    }

    public void setProduct(Product product) {
        id.setProduct(product);
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

}
