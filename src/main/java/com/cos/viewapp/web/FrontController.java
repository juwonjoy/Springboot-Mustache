package com.cos.viewapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//RestController (데이터를 리턴한다)
	//Controller (파일을 리턴한다)
	
	@Controller
	public class FrontController {

		
		
		
	//http://localhost:8080/home
	//디스패쳐 서블릿 /home 파싱
	//IoC 컨테이너에 @RestController, @controller 로 생성된 객체만 찾는다 
	//메서드를 호출한다. 
	
	
	@GetMapping("/home")
	public String home(Model model) {  //request == model
		//viewResolver 클래스 
		//src/main/resources/templates (prefix)
		//.mustache(suffix)
		
		String name = "주원";
		model.addAttribute("name",name);
		
		
		return "home";  //RequestDispatcher가 자동 작동 
	}

	}