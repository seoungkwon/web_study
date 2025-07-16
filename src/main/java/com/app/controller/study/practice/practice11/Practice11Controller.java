package com.app.controller.study.practice.practice11;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Practice11Controller {
	
	@GetMapping("/practice11/first")
	public String first(Model model) {
		
		model.addAttribute("accessUrl", "/first");
		
		return "practice11/targetPage";
	}
	
	@GetMapping("/practice11/firsthide1")
	public String firstHide1(Model model) {
		
		model.addAttribute("accessUrl", "/firsthide1");
		
		return "practice11/targetPage";
	}
	
	@GetMapping("/practice11/firsthide2")
	public String firstHide2 () {
		
		return "redirect:/practice11/first";
	}
}
