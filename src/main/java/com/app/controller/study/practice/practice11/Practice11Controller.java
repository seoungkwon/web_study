package com.app.controller.study.practice.practice11;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Practice11Controller {
	
	@GetMapping("/practice11/first")
	public String first(Model model, HttpSession session) {
		
		if(session.getAttribute("accessUrl") == null) {	//없다. hide3를 들리지 않았다
			model.addAttribute("accessUrl", "/first");
		} else {	//세션에 "accessUrl" 들어있다. -> hide3를 들렸다가 건너왔다
			model.addAttribute("accessUrl", session.getAttribute("accessUrl"));
			//										/firsthide3
			//										/firsthide4 /firsthide5
			
			//session.removeAttribute("accessUrl"); // 특정 키값으로 삭제
			session.invalidate(); //세션 클리어
		}
		
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
	
	@GetMapping("/practice11/firsthide3")
	public String firstHide3(Model model, HttpSession session) {
		
		//model.addAttribute("accessUrl", "/firsthide3");
		
		//firsthide3 에 접근했었다 라는  의미를 -> 전달 -> session 영역에 저장
		session.setAttribute("accessUrl", "/firsthide3");
		
		return "redirect:/practice11/first";
	}
}
