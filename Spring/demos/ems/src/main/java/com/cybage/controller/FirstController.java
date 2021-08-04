package com.cybage.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	
	 Logger logger=LogManager.getLogger("FirstController.class");

	@RequestMapping("/first")
	public String first(){
		logger.info("Inside first controller");
		return "first";
	}
	
	@RequestMapping("/welcome")
	public ModelAndView welcome(){
//		ModelMap m=new ModelMap();
//		m.put("user", "John");
//		m.put("email", "john@cybage.com");
		return new ModelAndView("welcome","user","John");
	}
	
}
