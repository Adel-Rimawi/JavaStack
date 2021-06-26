package com.Axsos.Lookify.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Axsos.Lookify.models.Lookify;
import com.Axsos.Lookify.services.LookifyService;


@Controller
public class MainController {
	private final LookifyService service;
    public MainController(LookifyService Service){
        this.service = Service;
    }
    @RequestMapping("/")
    public String home() {
    	System.out.println("Test");
    	return "Index.jsp";
    }
    
    @RequestMapping("/songs")
    public String main(Model model) {
    	model.addAttribute("Songs", service.allSongs());
    	
    	return "Main.jsp";
    }
    @RequestMapping(value = "/songs/new" , method = RequestMethod.POST)
    public String add(@ModelAttribute("song") Lookify Song , BindingResult result) {
    	if (result.hasErrors()) {
            return "Add.jsp";
        } else {
        	service.saveSong(Song);
            return "redirect:/songs";
    	
        }
    }
    @RequestMapping("/songs/new")
    public String New(@ModelAttribute("song") Lookify Song ) {
            return "Add.jsp";
    }
    @RequestMapping("/songs/{id}")
    public String show(Model model,  @PathVariable("id") Long id) {
    	model.addAttribute("Song", service.songById(id));
    	
    	return "Show.jsp";
    }
    @RequestMapping("/songs/topTen")
    public String top10(Model model) {
    	model.addAttribute("Songs", service.Top10());
    	return "Top.jsp";
    }
    @RequestMapping("/songs/search")
	public String Search(@RequestParam("artist") String artist, Model model) {
    	System.out.println(artist);
		model.addAttribute("songs",	service.byArtist(artist));
		model.addAttribute("artist",	artist);
		
		return "Search.jsp";
	}
    
    
}
