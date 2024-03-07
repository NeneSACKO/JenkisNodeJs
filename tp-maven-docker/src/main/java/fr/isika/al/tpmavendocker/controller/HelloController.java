package fr.isika.al.tpmavendocker.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String getIndex() {
		return "index";
	}
	
	@PostMapping("/send")
	public ModelAndView sendName(Model model) {
		String name =(String) model.getAttribute("name");
		return "/";
	}
}
