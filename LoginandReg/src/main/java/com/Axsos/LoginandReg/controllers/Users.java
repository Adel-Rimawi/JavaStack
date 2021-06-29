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

import com.Axsos.LoginandReg.models.User;
import com.Axsos.LoginandReg.services.userService;

@Controller
public class Users {
private final userService userService;
    
    public Users(userService userService) {
        this.userService = userService;
    }
    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }
    @RequestMapping("/login")
    public String login() {
        return "loginPage.jsp";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        if (result.hasErrors()) {
        	return "registrationPage.jsp";
        }
        else {
        	userService.registerUser(user);
        	session.setAttribute("userId", user.getId());
        	return "redirect:/home";
        }
        

    }
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session,BindingResult result) {
    	if (userService.authenticateUser(email, password)) {
    	User u = userService.findByEmail(email);
    	session.setAttribute("userId", u.getId());
    	return "redirect:/home";
    	}
    	model.addAttribute("error", "Please check your credentials");
    	return "loginPage.jsp";
    	
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
