package com.ecommerce.sopi.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.ecommerce.sopi.DTO.response.CartResponse;
import com.ecommerce.sopi.DTO.response.OrderItemResponse;
import com.ecommerce.sopi.entity.AddressEntity;
import com.ecommerce.sopi.entity.OrderEntity;

public interface OrderItemServiceInterface {
	Page<?> getAllOrderItem(int offset,String field,String order);
	List<?> getAllOderItemByOrder(OrderEntity orderEntity);
	List<?> getAllOrderByStatus(List<OrderEntity> orderEntities);
	OrderItemResponse getOrderItemResponseById(Long id);
	void createOrderItem(OrderEntity orderEntity, CartResponse cartResponse,AddressEntity addressEntity);
	void updateOrderItemStatus(Long id,String status);
	void changeAddressOrderItem(Long orderItemId,Long addressId);
 }
