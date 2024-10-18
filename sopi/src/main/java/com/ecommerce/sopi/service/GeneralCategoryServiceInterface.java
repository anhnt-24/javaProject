package com.ecommerce.sopi.service;

import java.util.List;

import com.ecommerce.sopi.DTO.response.GeneralCategoryResponse;

public interface GeneralCategoryServiceInterface {
	List<?> getAllGeneralCategory();
	GeneralCategoryResponse getGeneralCategoryById(Long Id);
	List<?> getAllGeneralCategoryDetail();
}
