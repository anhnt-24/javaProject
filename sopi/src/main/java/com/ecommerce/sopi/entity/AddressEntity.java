package com.ecommerce.sopi.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "shippingAddress")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String receiver;
	String phone;
	String province;
	String district;
	String commune;
	String id_province;
	String id_district;
	String id_commune;
	String detail;
	
	Boolean isdefault;
	
	@CreationTimestamp
	Date createdAt;
	@UpdateTimestamp
	Date updatedAt;
	
	@ManyToOne
	@JoinColumn(name = "user_id") 
	UserEntity user;
}
