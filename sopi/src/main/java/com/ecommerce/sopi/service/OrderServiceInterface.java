package com.ecommerce.sopi.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.ecommerce.sopi.DTO.response.PaymentResponse;
import com.ecommerce.sopi.entity.UserEntity;

public interface OrderServiceInterface {
	Page<?> getAllOrder(int offset,String field,String order);
	List<?> getAllOrderByUser();
	void getOrderResponseById(Long id);
	void createOrder(PaymentResponse paymentResponse,Long addressId,Long discount);
	
}
