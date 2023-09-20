package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	
	@RequestMapping("/test")
	@ResponseBody
	String fun()
	{
		
		String name="RAM";
	
		return "Welcome "+name;
	}
	
	@RequestMapping("/test2")
	String fun2()
	{
		return "page.html";
	}
	
	@RequestMapping("/")
	String fun3()
	{
		return "myhome.html";
	}

}
