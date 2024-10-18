package com.ecommerce.sopi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.sopi.entity.AuthenticateTokenEntity;
import com.ecommerce.sopi.repository.AuthenticateTokenRepository;
import com.ecommerce.sopi.service.AuthenticateTokenServiceInterface;

@Service
public class AuthenticateTokenService implements AuthenticateTokenServiceInterface {
	
	@Autowired
	private AuthenticateTokenRepository authenticateTokenRepository;

	@Override
	public String validateToken(String code) {
		if(authenticateTokenRepository.existsTokenByCode(code)) {
			return null;
		}
		return "Token không hợp lệ.";
	}

	@Override
	public String addNewToken() {
		AuthenticateTokenEntity token=new AuthenticateTokenEntity();
		authenticateTokenRepository.save(token);
		return token.getCode();
	}

	@Override
	public String removeToken(String code) {
		authenticateTokenRepository.deleteTokenByCode(code);
		return null;
	}
	
}
