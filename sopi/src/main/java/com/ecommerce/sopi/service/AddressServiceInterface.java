package com.ecommerce.sopi.service;

import java.util.List;

import com.ecommerce.sopi.DTO.request.AddressResquest;
import com.ecommerce.sopi.DTO.response.AddressResponse;

public interface AddressServiceInterface {
	List<?> getAllAddressByUser();
	AddressResponse getDefaultAddress();
	List<?> getNotDefaultAddress();
	AddressResponse getAddressById(Long id);
	void deleteAddressById(Long id);
	void updateAddress(AddressResquest resquest,Long id);
	void createAddress(AddressResquest resquest);
	void setDefaultAddressById(Long id);
	
}	
