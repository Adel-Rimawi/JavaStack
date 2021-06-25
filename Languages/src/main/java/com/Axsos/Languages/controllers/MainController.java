package com.Axsos.Languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Axsos.Languages.models.Language;
import com.Axsos.Languages.services.LanguageService;

@Controller
public class MainController {
	private final LanguageService Service;
	
	public MainController(LanguageService Service) {
        this.Service = Service;
    }
	@RequestMapping("/Languages")
    public String index(@ModelAttribute("language") Language language, Model model) {
		List<Language> Lang = Service.allLanguages();
        model.addAttribute("Languages", Lang);
        return "Index.jsp";
    }
	@RequestMapping(value = "/Languages", method = RequestMethod.POST)
    public String add(@ModelAttribute("language") Language language, Model model) {
		Service.SaveLang(language);
        return "redirect:/Languages";
    }
	@RequestMapping("/Languages/{id}")
    public String edit(Model model, @PathVariable("id") Long id) {
		System.out.println("Show");
		model.addAttribute("language", Service.findLanguageById(id));
        return "Show.jsp";
    }
	
	@RequestMapping("/Languages/edit/{id}")
    public String show(@Valid Model model, @PathVariable("id") Long id, @ModelAttribute("language") Language language,BindingResult result) {
		model.addAttribute("language", Service.findLanguageById(id));
		System.out.println("in");
        return "Edit.jsp";
    }
	
	@RequestMapping(value = "/Languages/{id}", method = RequestMethod.PUT)
	public String edit(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		System.out.println("In");
        if (result.hasErrors()) {
            return "Index.jsp";
        } else {
        	System.out.println("2");
        	Service.SaveLang(language);
            return "redirect:/Languages/{id}";
        }
    }
	@RequestMapping(value = "/Languages/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable("id") Long id) {
		System.out.println("Del");
		Service.deletelang(id);
		return "redirect:/Languages";
	}
	
	

}
