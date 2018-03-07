package com.sachinsharma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	//request mapping is to tell spring that which method will handle which request
	@RequestMapping(value="/greeting") //just a URL mapping
	public String sayHello(Model model) {
		
		model.addAttribute("greeting", "Hello World"); //ties greeting attribute to greeting in hello.jsp
		return "hello";	//tied to hello.jsp page
	}
}
