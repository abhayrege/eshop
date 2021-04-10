package com.eshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class HomeController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String home(ModelMap modelMap) {
		System.out.println("HomeController...method home..........................................");
		System.out.println("new output");
		//ModelAndView mav = new ModelAndView("home");
		return "index";
	}

}
