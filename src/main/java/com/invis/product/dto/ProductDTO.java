package com.invis.product.dto;

import java.util.List;

import com.invis.product.entity.Images;

import lombok.Data;

@Data
public class ProductDTO {

	private long sku;

	private String name;

	private String brand;

	private int size;

	private long price;

	private String principalImage;

	private List<Images> images;
}
