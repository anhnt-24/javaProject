package com.ecommerce.sopi.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.ecommerce.sopi.DTO.response.Size_ColorResponse;
import com.ecommerce.sopi.entity.Size_ColorEntity;

public interface Size_ColorServiceInterface {
	Page<?> getAllSize_Color(int offset,String field,String order);
	Size_ColorResponse getSize_ColorById(Long id);
	Size_ColorResponse getSize_ColorResponseByMTM(Long sizeId,Long colorId);
	public Size_ColorEntity getSize_ColorEntityById(Long id);
	
}
