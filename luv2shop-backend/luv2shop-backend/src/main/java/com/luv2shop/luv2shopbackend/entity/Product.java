package com.luv2shop.luv2shopbackend.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="product")
public class Product {
    @Id
    @Column(name="id")
    private long id;
    @Column(name="sku")
    private String sku;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="unit_price")
    private int unit_price;
    @Column(name="image_url")
    private String image_url;
    @Column(name="active")
    private int active;
    @Column(name="units_in_stock")
    private int units_in_stock;
    @Column(name="date_created")
    @CreationTimestamp
    private Date date_created;
    @Column(name="last_updated")
    @UpdateTimestamp
    private Date last_updated;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private ProductCategory category;
}


