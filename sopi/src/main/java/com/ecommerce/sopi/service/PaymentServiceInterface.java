package com.ecommerce.sopi.service;

import java.util.List;

import com.ecommerce.sopi.DTO.request.CartRequest;
import com.ecommerce.sopi.DTO.response.PaymentResponse;

public interface PaymentServiceInterface {
	PaymentResponse proccessMono(CartRequest request) ;
	PaymentResponse proccessMulti(List<Long> cartId,Long total);
	PaymentResponse applyDiscount(Long preDiscount,Long discount,PaymentResponse paymentResponse);
}
