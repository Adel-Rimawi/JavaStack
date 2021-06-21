package com.Axsos.The_Code;

import java.util.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Controller
public class MainController {
	public Integer goldtotal = 0;
	public ArrayList<String> Activities = new ArrayList<String>();
	
	@RequestMapping("/")
	public String hello(Model model) {
		model.addAttribute("goldtotal", goldtotal);
		model.addAttribute("Activities", Activities);
	        return "Index.jsp";

}

		
	
	@RequestMapping(value="/addgold", method=RequestMethod.POST)
	public String addgold(@RequestParam(value="hidden") String hidden) { 
		int gold = 0;
		if (hidden.equals("farm")) {
			System.out.println(hidden);
			Random rand = new Random();
	        gold = rand.nextInt(10)+10;
	        goldtotal+= gold;
	        
		}
		else if (hidden.equals("cave")){
			Random rand = new Random();
	        gold = rand.nextInt(5)+5;
	        goldtotal+= gold;
	        
		}
		else if (hidden.equals("house")) {
			Random rand = new Random();
	        gold = rand.nextInt(3)+2;
	        goldtotal+= gold;
	        
		}
		else if (hidden.equals("casino")) {
			Random rand = new Random();
	        gold = rand.nextInt(100)-50;
	        goldtotal+= gold;
	        
		}
		if (gold >0) {
			Activities.add(String.format("You entered a %s and earned %d", hidden ,gold));
		}
		else 
			Activities.add(String.format("You entered a %s and lost %d", hidden ,gold));
		
    return "redirect:/";

	}
	
	}
