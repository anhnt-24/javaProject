package com.ecommerce.sopi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.sopi.entity.AuthenticateTokenEntity;

@Repository
public interface AuthenticateTokenRepository extends JpaRepository<AuthenticateTokenEntity, Long>{
	boolean existsTokenByCode(String code);
	void deleteTokenByCode(String code);
}
