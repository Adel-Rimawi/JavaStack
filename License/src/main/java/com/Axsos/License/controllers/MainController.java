package com.Axsos.License.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Axsos.License.models.License;
import com.Axsos.License.models.Person;
import com.Axsos.License.services.PersonService;

@Controller
public class MainController {
	private final PersonService Service;
    public MainController(PersonService service){
        this.Service = service;
    }
    @RequestMapping("/persons/add")
    public String home(@ModelAttribute("newperson")Person newperson) {
    	Service.savePerson(newperson);
    	return "Index.jsp";
    }
    @RequestMapping(value =  "/persons/add",  method = RequestMethod.POST )
    public String add(@Valid @ModelAttribute("newperson")Person newperson, BindingResult  result) {
    	Service.savePerson(newperson);
    	return "redirect:/persons/new";
    }
    
    @RequestMapping("/licenses/add")
    public String newlicenses(Model model, @ModelAttribute("newlicense")License newlicense, BindingResult  result) {
    	model.addAttribute("persons" , Service.nullLicense());
    	return "Addlicense.jsp";
    }
    
    @RequestMapping(value =  "/licenses/add" ,  method = RequestMethod.POST )
    public String addlicenses(Model model, @ModelAttribute("newlicense")License newlicense) {
    	System.out.println("Test");
    	Service.saveLicense(newlicense);
    	return "redirect:/persons/{id}";
    }
    @RequestMapping("/persons/{id}")
    public String showpersons(Model model , @PathVariable("id") Long id) {
    	model.addAttribute("person" , Service.findPersonbyid(id));

    	return "cperson.jsp";
    }
    
    
	
}
