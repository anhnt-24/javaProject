package com.ecommerce.sopi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.ecommerce.sopi.DTO.ADMIN.response.ADMINOrderItemResponse;
import com.ecommerce.sopi.DTO.response.AddressResponse;
import com.ecommerce.sopi.entity.AddressEntity;
import com.ecommerce.sopi.entity.OrderItemEntity;

@Mapper(componentModel = "spring")
public interface OrderItemMapper {
	AddressResponse toaddAddressResponse(OrderItemEntity orderItemEntity);
	@Mapping(target = "id",ignore = true)
	void updateOrderItem(AddressEntity addressEntity, @MappingTarget OrderItemEntity orderItemEntity);
	
	ADMINOrderItemResponse toAdminOrderResponse(OrderItemEntity orderItemEntity);
}
