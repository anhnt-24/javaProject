package com.ecommerce.sopi.service;

import java.util.List;

import com.ecommerce.sopi.DTO.ADMIN.response.RevenueResponse;
import com.ecommerce.sopi.entity.RevenueEntity;

public interface RevenueServiceInterface {
	RevenueEntity getToday();
	void create();
	void update(Long total,Long sales);
	List<String []> getRevenueResponse();
}
