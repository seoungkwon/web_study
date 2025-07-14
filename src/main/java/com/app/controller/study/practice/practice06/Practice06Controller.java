package com.app.controller.study.practice.practice06;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.dto.study.practice06.BmiDTO;

@Controller
@RequestMapping("/practice06")
public class Practice06Controller {
	/*
	1. /practice06/ask-bmi 경로로 요청시, 화면에는
	이름 / 키 / 몸무게를 입력하는 항목과 확인하기 버튼이 있습니다.
	버튼 submit 발생
	*/
	
	@GetMapping("/ask-bmi")
	public String askbmi(){
		return "practice06/ask-bmi";
	}
	/*
	2. /practice06/result-bmi 경로로 이동하여
	요청에 따라서 컨트롤러가 비만도를 계산해서 결과를 보여줍니다.

	화면에는 사용자가 입력한 이름 / 키 / 몸무게가 표시되고,
	추가로 BMI 가 표시됩니다.

	결과가 나타나도록 화면과 서버 코드를 구현하세요.
	화면에는 사용자가 입력한 이름 / 키 / 몸무게가 표시되고,
	추가로 BMI 가 표시됩니다.

	결과가 나타나도록 화면과 서버 코드를 구현하세요.
	*/
	
	@PostMapping("/result-bmi")
	public String resultBmi(@ModelAttribute BmiDTO bmiDTO, Model model) {
		double heightMeter = bmiDTO.getHeight() / 100.0;
		double bmi = bmiDTO.getWeight() / (heightMeter * heightMeter);
		bmiDTO.setBmi(bmi);
		
		model.addAttribute("bmiDTO",bmiDTO);
		
		return"practice06/result-bmi";
	}
}
