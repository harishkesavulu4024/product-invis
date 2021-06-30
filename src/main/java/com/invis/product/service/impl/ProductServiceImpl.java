package com.invis.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.invis.product.dto.ProductDTO;
import com.invis.product.entity.Product;
import com.invis.product.repository.ProductRepository;
import com.invis.product.service.IProductService;
import com.invis.product.service.mapper.ProductMapper;

@Service
public class ProductServiceImpl implements IProductService{
	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ProductMapper productMapper;

	@Override
	@Transactional
	public ProductDTO addProduct(ProductDTO productDTO) {
		Product product = productRepository.save(productMapper.productDTOTOProduct(productDTO));
		return productMapper.productToProductDTO(product);
	}

	@Override
	@Transactional(readOnly=true)
	public List<ProductDTO> getProductList() {
		List<Product> productList=productRepository.findAll();
		return productMapper.productToProductDTOList(productList);
	}

}
