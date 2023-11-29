package com.fabianoapp.confectionery.entities;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RevenueItemPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
    @JoinColumn(name = "revenue_id")
    private Revenue revenue;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public RevenueItemPK() {
    }

    public Revenue getRevenue() {
        return revenue;
    }

    public void setRevenue(Revenue revenue) {
        this.revenue = revenue;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

	@Override
	public int hashCode() {
		return Objects.hash(revenue, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RevenueItemPK other = (RevenueItemPK) obj;
		return Objects.equals(revenue, other.revenue) && Objects.equals(product, other.product);
	}
}
