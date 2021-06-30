package com.invis.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invis.product.dto.ProductDTO;
import com.invis.product.service.IProductService;

@RestController
@RequestMapping(name="/product")
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	@PostMapping(value="/add")
	public ProductDTO addProduct(@RequestBody ProductDTO productDTO) {
		return productService.addProduct(productDTO);
	}
	
	@PostMapping(value="/list")
	public List<ProductDTO> listOfProducts() {
		return productService.getProductList();
	}

}
