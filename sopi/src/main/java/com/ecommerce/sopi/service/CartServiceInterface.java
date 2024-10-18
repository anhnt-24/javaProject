package com.ecommerce.sopi.service;

import java.util.List;

import com.ecommerce.sopi.DTO.request.CartRequest;
import com.ecommerce.sopi.DTO.response.CartResponse;


public interface CartServiceInterface {
	List<?> getAllCartItem();
	List<?> getALLCartItemByUser();
	CartResponse getCartItemById(Long id);
	List<?> getAllCartItemByListId(List<Long> list);
	void createCartItem(CartRequest request);
	void deleteCartItemById(Long id);
	void addCartItemQuantity(Long id, Long quantity);
	void deleteCartItemByListId(List<Long> list);
}
