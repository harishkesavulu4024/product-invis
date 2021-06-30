package com.invis.product.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique=true,nullable = false)
	private long sku;

	@Column(name="product_name",nullable = false)
	private String name;

	@Column(name="product_brand",nullable = false)
	private String brand;

	@Column(name="product_size",nullable = false)
	private int size;

	@Column(name="product_price")
	private long price;
    
	@Column(name="principal_image",nullable = false)
	private String principalImage;

	@OneToMany(mappedBy="product", cascade = CascadeType.ALL)
	private List<Images> images;
}
