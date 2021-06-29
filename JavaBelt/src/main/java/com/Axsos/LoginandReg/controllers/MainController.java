package com.Axsos.LoginandReg.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Axsos.LoginandReg.models.User;
import com.Axsos.LoginandReg.services.userService;

@Controller
public class MainController {
private final userService userService;
    
    public MainController(userService userService) {
        this.userService = userService;
    }
//    @RequestMapping("/registration")
//    public String registerForm(@ModelAttribute("user") User user) {
//        return "registrationPage.jsp";
//    }
    @RequestMapping("/login")
    public String login(@ModelAttribute("registration") User user) {
    	System.out.println("hi");
        return "loginPage.jsp";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("registration") User user1, BindingResult result, HttpSession session) {
    	System.out.println("Testr");

        if (result.hasErrors()) {
        	return "registrationPage.jsp";
        }
        else {
        	userService.registerUser(user1);
        	session.setAttribute("userId", user1.getId());
        	return "redirect:/home";
        }
        

    }
    @RequestMapping(value="/logint", method=RequestMethod.POST)
    public String loginUser(@RequestParam("lemail") String email, @RequestParam("password") String password, RedirectAttributes redirs, HttpSession session ) {
    	System.out.println("Test1");
    	if (userService.authenticateUser(email, password)) {
        	System.out.println("Test2");
    	User u = userService.findByEmail(email);
    	session.setAttribute("userId", u.getId());
    	System.out.println("Test3");
    	return "redirect:/home";
    	}
    	System.out.println("Test4");
    	redirs.addFlashAttribute("error", "Please check your credentials");
    	return "redirect:/login";
    	
    }
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
        // get user from session, save them in the model and return the home page
    	Long id = (Long) session.getAttribute("userId");
    	User u = userService.findUserById(id);
    	model.addAttribute("user", u);
    	return "homePage.jsp";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
    
}
