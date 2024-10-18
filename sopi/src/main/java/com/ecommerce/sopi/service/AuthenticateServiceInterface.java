package com.ecommerce.sopi.service;


import com.ecommerce.sopi.DTO.response.MessageResponse;

import jakarta.servlet.http.HttpSession;

public interface AuthenticateServiceInterface {
	MessageResponse forgetPassword(HttpSession session, String username,String link);
	MessageResponse forgetUsername(HttpSession session, String email,String link);
	MessageResponse comfirmOTP(HttpSession session,String OTP);
	MessageResponse sendChangePassword(HttpSession session,String link) ;
	MessageResponse sendChangeEmail(HttpSession session,String link);
	MessageResponse sendChangePhone(HttpSession session,String link);
	MessageResponse changePassword(HttpSession session,String password,String token);
	MessageResponse changeEmail(HttpSession session,String email,String token);
	MessageResponse changePhone(HttpSession session,String phone,String token);
}
