package com.ecommerce.sopi.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.ecommerce.sopi.DTO.request.RegisterRequest;
import com.ecommerce.sopi.DTO.request.UserRequest;
import com.ecommerce.sopi.DTO.response.UserResponse;
import com.ecommerce.sopi.entity.Roles;
import com.ecommerce.sopi.entity.UserEntity;

public interface UserServiceInterface {
	public UserEntity getAthenticatedUser();
	Page<?> getAllUser(int offset,String field,String order);
	UserEntity getUserById(Long id);
	void createUser(RegisterRequest request,Roles rolse);
	UserResponse getMyInfo();
	void updateUser(UserResponse response);
}
