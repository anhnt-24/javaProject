package com.ecommerce.sopi.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.sopi.entity.SliderEntity;
import com.ecommerce.sopi.repository.SliderRepository;

@Service
public class SliderService {
	@Autowired
	private SliderRepository sliderRepository;
	
	public List<String> getAllSlider() {
		List<String> list=sliderRepository.findAll().stream().map(x->x.getImg()).collect(Collectors.toList());
		return list;
	}
}
