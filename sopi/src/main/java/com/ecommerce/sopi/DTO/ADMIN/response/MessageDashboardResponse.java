package com.ecommerce.sopi.DTO.ADMIN.response;

import java.util.Date;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
public class MessageDashboardResponse {
	String id;
	String title;
	String content;
	Date createdAt;
}
