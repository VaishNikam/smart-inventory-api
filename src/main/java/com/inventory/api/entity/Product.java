package com.inventory.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String sku;

    @Column(nullable = false)
    private String name;

    private String category;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal unitPrice;

    @Column(nullable = false)
    private int stockQuantity;

    @Column(nullable = false)
    private int reorderLevel;

    public Product() {
    }

    public Long getId() 
	{ 
	return id;
	}
    public void setId(Long id) 
	{ 
	this.id = id; 
	}

    public String getSku()
	{ 
	return sku;
	}
    public void setSku(String sku) 
	{ 
	this.sku = sku;
	}

    public String getName()
	{ 
	return name;
	}
    public void setName(String name) 
	{ 
	this.name = name;
	}

    public String getCategory() 
	{
	return category;
	}
    public void setCategory(String category)
	{ 
	this.category = category;
	}

    public BigDecimal getUnitPrice() 
	{
	return unitPrice;
	}
    public void setUnitPrice(BigDecimal unitPrice)
	{
	this.unitPrice = unitPrice;
	}

    public int getStockQuantity()
	{
	return stockQuantity; 
	}
    public void setStockQuantity(int stockQuantity)
	{
	this.stockQuantity = stockQuantity;
	}

    public int getReorderLevel()
	{
	return reorderLevel;
	}
    public void setReorderLevel(int reorderLevel)
	{
	this.reorderLevel = reorderLevel;
	}
}