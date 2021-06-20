package com.Axsos.The_Code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class MainController {
	@RequestMapping("/")
	public String home() {
		return "Index.jsp";

	}
	@RequestMapping(value="/info", method=RequestMethod.POST)
	public String info(Model model, @RequestParam(value="name") String name,
			@RequestParam(value="location") String location,
			@RequestParam(value="language") String language,
			@RequestParam(value="comment") String comment) {
			model.addAttribute("name", name);
			model.addAttribute("location", location);
			model.addAttribute("language", language);
			model.addAttribute("comment", comment);
			
		return "Info.jsp";

	}
	
}
