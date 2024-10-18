package com.ecommerce.sopi.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ecommerce.sopi.DTO.request.RegisterRequest;
import com.ecommerce.sopi.entity.Roles;
import com.ecommerce.sopi.service.impl.AuthenticateTokenService;
import com.ecommerce.sopi.service.impl.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class ADMINRegisterController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private AuthenticateTokenService authenticateTokenService;
	
	@GetMapping("/admin/register")
	public String registerView(Model model,RedirectAttributes redirectAttributes,HttpSession session,@PathVariable("token") String token) {
		model.addAttribute("user",new RegisterRequest());
		return "admin/register";
	}
	
	@PostMapping("/admin/register")
	public String register(@RequestParam("token") String token,RegisterRequest request,RedirectAttributes redirectAttributes) {
		
		String error=authenticateTokenService.validateToken(token);
		if(error!=null) {
			redirectAttributes.addFlashAttribute("error",error);
			return "redirect:/admin/register";
		}
	
		error=userService.checkRegister(request,Roles.ADMIN);
		if(error!=null) {
			redirectAttributes.addFlashAttribute("error",error);
			return "redirect:/admin/register";
		}
		redirectAttributes.addFlashAttribute("message","Đăng kí thành công");
		return "redirect:/admin/login";
	}
	
}
