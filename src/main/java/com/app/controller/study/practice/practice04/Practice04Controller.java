package com.app.controller.study.practice.practice04;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.dto.study.practice04.Prac04RequestForm;
import com.app.dto.study.practice04.TransferItem;

@Controller
@RequestMapping("/practice04")
public class Practice04Controller {

	/*
	1. /practice04/request1-x?category=100&product=4000 요청 시, 값들 출력 케이스
	Console창에 println 으로 출력 (사용자 요청을 서버가 읽어서 확인 가능한지)
	*/
	
//	1) request 활용 (/request1-1)
	@GetMapping("request1-1")
	public String request1(HttpServletRequest request) {
		String category = request.getParameter("category");
		String product = request.getParameter("product");
		
		System.out.println("/practice04/request1-1");
		System.out.println("category: " + category);
		System.out.println("product: " + product);
		
		return "practice04/req";
	}
	
//	2) RequestParam 활용 (/request1-2)
	 @GetMapping("/request1-2")
	    public String request2(@RequestParam String category, @RequestParam String product) {
	       	
		 	System.out.println("/practice04/request1-2");
		 	System.out.println("category: " + category);
	        System.out.println("product: " + product);
	        return "practice04/req";
	    }

//	 3) Dto 객체 활용 (/request1-3)
	 @GetMapping("/request1-3")
	    public String request3(Prac04RequestForm prac04RequestForm) {
		 
		 	System.out.println("/practice04/request1-3");
	        System.out.println("category: " + prac04RequestForm.getCategory());
	        System.out.println("product: " + prac04RequestForm.getProduct());
	        return "practice04/req";
	    }

//	4) Map 활용 (/request1-4)	 
	 @GetMapping("/request1-4")
	 public String request4(@RequestParam Map<String, String> paramMap) {
		 
		 System.out.println("/practice04/request1-4");
		 System.out.println("category:" + paramMap.get("category"));
		 System.out.println("product:" + paramMap.get("product"));
		 return "practice04/req";
	 }
	 
	 /*
	 2. /practice04/viewData1-x요청시 화면(view .jsp)에 값 출력
	 * 화면 전달된 값은 아래와 같이 작성시 출력되어야 함
	 *전달되는 값은 임의로 작성 "넘어간 값"
	 */
	 
//	 1) request 활용  ( /viewData1-1)
	 @GetMapping("/viewData1-1")
	    public String viewData1(HttpServletRequest request) {
	        request.setAttribute("response001", "값1");
	        request.setAttribute("response099", "값1");
	        return "practice04/viewData";
	    }

//	 2) Model 활용    /viewData1-2
	 @GetMapping("/viewData1-2")
	    public String viewData2(Model model) {
	        model.addAttribute("response001", "값2");
	        model.addAttribute("response099", "값2");
	        return "practice04/viewData";
	    }

//	 3) ModelAndView 활용   /viewData1-3
	 @GetMapping("/viewData1-3")
	    public ModelAndView viewData3() {
	        ModelAndView mv = new ModelAndView("practice04/viewData");
	        mv.addObject("response001", "값3");
	        mv.addObject("response099", "값3");
	        return mv;
	    }

//	 4) ModelAttribute 객체 활용    /viewData1-4
	 @GetMapping("/viewData1-4")
	    public String viewData1_4(Model model) {
		 
	        model.addAttribute("값4");
	        model.addAttribute("값4");
	        
	        TransferItem transferItem = new TransferItem();
	        transferItem.setValue001("v011");
	        transferItem.setValue099("vvv999");
	        model.addAttribute("transferItem", transferItem);
	        
	        return "practice04/viewData";
	    }
}
