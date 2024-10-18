package com.ecommerce.sopi.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ADMINHomeController {
	
	@GetMapping("/admin")
	public String home() {
		return "admin/home";
	}
}
