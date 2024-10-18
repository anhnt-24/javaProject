package com.ecommerce.sopi.service;


public interface AuthenticateTokenServiceInterface {
	String validateToken(String code);
	String addNewToken();
	String removeToken(String code);
}
