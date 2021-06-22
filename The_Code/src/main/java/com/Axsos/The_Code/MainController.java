package com.Axsos.The_Code;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
public class MainController {
	@RequestMapping("/")
	public String home() {
		return "Index.jsp";
	}
	@RequestMapping(value="/check", method=RequestMethod.POST)
    public String check(@RequestParam(value="code") String code) {
		System.out.println(code);
		if (code.equals("bushido") ) { //not working will should check tomorrow
			return "redirect:/code";
		}
		else {
	        return "redirect:/createError";
	    }
	}
	@RequestMapping("/code")
	public String code() {
		return "code.jsp";
	}
	
		@RequestMapping("/createError")
	    public String flashMessages(RedirectAttributes redirectAttributes) {
	        redirectAttributes.addFlashAttribute("error", "You must train harder!");
	        return "redirect:/";
	    }
			
		
		
		
}


