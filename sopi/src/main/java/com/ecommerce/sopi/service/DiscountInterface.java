package com.ecommerce.sopi.service;

import org.springframework.data.domain.Page;

import com.ecommerce.sopi.DTO.response.DiscountResponse;

public interface DiscountInterface {
	Page<?> getAllDiscount(int offset,String field,String order);
	DiscountResponse getDiscoutByCode(String code);
}
