package com.ecommerce.sopi.service;

import java.util.List;

import com.ecommerce.sopi.DTO.response.CategoryResponse;

public interface CategoryServiceInterface {
	List<?> getAllCategory();
	CategoryResponse getCategoryById(Long id);
	List<?> getAllCategoryByGeneralId(Long id);
}
