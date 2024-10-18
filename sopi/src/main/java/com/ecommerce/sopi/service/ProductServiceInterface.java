package com.ecommerce.sopi.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.ecommerce.sopi.DTO.response.ProductResponse;

public interface ProductServiceInterface {
	Page<?> getAllProduct(int offset,String field,String order);
	ProductResponse getProductByIdDetail(Long id);
	ProductResponse getProductById(Long id);
	List<?> getAllProductByCategoryId(Long id);
}
