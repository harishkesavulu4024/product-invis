package com.invis.product.service;

import java.util.List;

import com.invis.product.dto.ProductDTO;

public interface IProductService {

	ProductDTO addProduct(ProductDTO productDTO);

	List<ProductDTO> getProductList();

}
