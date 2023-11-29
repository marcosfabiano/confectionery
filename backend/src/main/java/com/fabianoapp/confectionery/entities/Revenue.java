package com.fabianoapp.confectionery.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_revenue")
public class Revenue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String preparation;
    @OneToMany(mappedBy = "id.revenue")
    private Set<RevenueItem> items = new HashSet<>();

    public Revenue() {
    }

    public Revenue(Long id, String name, String preparation) {
        this.id = id;
        this.name = name;
        this.preparation = preparation;
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

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public Set<RevenueItem> getItems() {
        return items;
    }

    public List<Product> getProducts() {
        return items.stream().map(x -> x.getProduct()).toList();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Revenue other = (Revenue) obj;
        return Objects.equals(id, other.id);
    }
}
