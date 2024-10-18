package com.ecommerce.sopi.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AuthToken")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthenticateTokenEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	String code;
	
	@CreationTimestamp
	Date createdAt;
	@UpdateTimestamp
	Date updatedAt;
}
