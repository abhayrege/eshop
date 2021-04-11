package com.eshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.pages.IndexPage;

@Controller
@RequestMapping(value = "/")
public class HomeController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView home() {
		
		ModelAndView mav = new ModelAndView("index");
		
		IndexPage indexPage = new IndexPage();
		indexPage.setEmail("support@shophub.com");
		indexPage.setPhoneNumber("60 (800) 801-582");

		mav.addObject("indexpagedata", indexPage);
		
		return mav;
	}

}
