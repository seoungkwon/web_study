package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	// @ 붙어있으면 어노테이션
public class HomeController {

	@RequestMapping("/")
	public String home() {

		//return "/WEB-INF/views/home.jsp";
		//return "/WEB-INF/views/mainpage.jsp";
		
		//--ViewResolver 설정 이후
		
		// return "mainpage";
		return "home";
	}
}
