package com.ecommerce.sopi.service;

import java.util.List;

import com.ecommerce.sopi.DTO.response.ColorResponse;

public interface ColorServiceInterface {
	List<?> getAllColor();
	ColorResponse getColorById(Long id);
	List<?> getAllColorByProductId(Long id);
	
}
