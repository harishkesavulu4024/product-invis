package com.invis.product.service.mapper;


import java.util.List;

import org.mapstruct.Mapper;

import com.invis.product.dto.ProductDTO;
import com.invis.product.entity.Product;


@Mapper(componentModel = "spring", uses = {})
public interface ProductMapper {

	Product productDTOTOProduct(ProductDTO productDTO);

	ProductDTO productToProductDTO(Product product);
	
	List<ProductDTO> productToProductDTOList(List<Product> productList);

}
