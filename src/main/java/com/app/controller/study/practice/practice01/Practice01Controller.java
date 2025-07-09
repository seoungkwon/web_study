package com.app.controller.study.practice.practice01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/practice01")
public class Practice01Controller {
	
	@RequestMapping("/mainmain")
	public String mainmain() {
		return "/practice01/mainmain";
	}
	
	@RequestMapping("/product/mouse")
	public String mouse() {
		return "/practice01/product/mouse";
	}
	
	@RequestMapping("/product/keyboard")
	public String keyboard() {
		return "/practice01/product/keyboard";
	}
	
}
