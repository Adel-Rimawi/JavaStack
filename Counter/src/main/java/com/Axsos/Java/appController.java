package com.Axsos.Java;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class appController {
	
	private int getCount(HttpSession session) {
		Object num = session.getAttribute("count");
		if(num == null) {
			setCount(session, 0);
			num = session.getAttribute("count");
		}
		return (Integer)num;
	}
	private void setCount(HttpSession session, int num) {
		session.setAttribute("count", num);
	
	}
	@RequestMapping("/")
	public String home( HttpSession session) {
		int currCount = getCount(session);
		setCount(session, currCount+1);
		return "Index.jsp";
	}
		
	@RequestMapping("/count")
	public String count(Model model, HttpSession session) {
		model.addAttribute("counter", getCount(session));
		return "count.jsp";
	}
}
