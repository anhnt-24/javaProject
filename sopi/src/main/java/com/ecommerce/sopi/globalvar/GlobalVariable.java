package com.ecommerce.sopi.globalvar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.ecommerce.sopi.DTO.response.GeneralCategoryResponse;
import com.ecommerce.sopi.DTO.response.UserResponse;
import com.ecommerce.sopi.service.impl.CartService;
import com.ecommerce.sopi.service.impl.GeneralCategoryService;
import com.ecommerce.sopi.service.impl.UserService;

@ControllerAdvice
public class GlobalVariable {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private GeneralCategoryService generalCategoryService;
	
	@ModelAttribute("UserAuth")
	public UserResponse getUserAuth() {
		 Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		  if (authentication != null && authentication.isAuthenticated() && authentication.getName()!="anonymousUser") {
			  UserResponse userResponse=userService.getMyInfo();
			  return userResponse;
		  }
		return null;
	}
	@ModelAttribute("CartSize")
	public long getCartSize() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication != null && authentication.isAuthenticated() && authentication.getName()!="anonymousUser") {
			return cartService.getCartItemCount();
		}
		return (long) 0;
	}
	
	@ModelAttribute("HeaderProductCategory")
	public List<GeneralCategoryResponse> getAllGeneralCategory(){
		return generalCategoryService.getAllGeneralCategory();
	}
	@ModelAttribute("ROLE")
	public String getUserRole() {
		 Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		  if (authentication != null && authentication.isAuthenticated() && authentication.getName()!="anonymousUser") {
			  return userService.getAthenticatedUser().getRole().toString();
			  
		  }
		return null;
	}
	
}
