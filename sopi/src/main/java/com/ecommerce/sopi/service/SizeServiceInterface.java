package com.ecommerce.sopi.service;

import java.util.List;

import com.ecommerce.sopi.DTO.response.SizeResponse;

public interface SizeServiceInterface {
	List<?> getAllSize();
	SizeResponse getSizeById(Long id);
	List<?> getAllSizeByProductId(Long id);
	
}
