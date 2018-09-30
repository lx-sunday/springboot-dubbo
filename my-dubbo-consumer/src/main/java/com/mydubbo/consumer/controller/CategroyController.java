package com.mydubbo.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mydubbo.api.model.CategoryVo;
import com.mydubbo.api.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategroyController {
	
	@Autowired
	private CategoryService service;

	@RequestMapping(method=RequestMethod.GET)
	public List<CategoryVo> findAll(){
		
		return this.service.findList();
	}
}
