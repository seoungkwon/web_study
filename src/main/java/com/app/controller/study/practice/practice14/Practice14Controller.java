package com.app.controller.study.practice.practice14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Practice14Controller {

	@Autowired
	CupBean cupBean;
	
	@Autowired
	PlateBean plateBean;
	
	@GetMapping("/practice14/fullOrder")
	public String fullOreder() {
		
		System.out.println("컵에 담긴 음료의 이름 - " + cupBean.getCoffeeBean().getName());
		System.out.println("접시에 담긴 디저트의 이름 - " + plateBean.getDessertBean().getName());
		
		return "practice14/prac14";
	}
	
	@GetMapping("/practice14/OrderCoffee")
	public String OrderCoffee() {
		System.out.println("컵에 담긴 음료의 이름 - " + cupBean.getCoffeeBean().getName());
		return "practice14/prac14";
	}
	
	@GetMapping("/practice14/OrderDessert")
	public String OrderDessert() {
		System.out.println("접시에 담긴 디저트의 이름 - " + plateBean.getDessertBean().getName());
		return "practice14/prac14";
	}
}
