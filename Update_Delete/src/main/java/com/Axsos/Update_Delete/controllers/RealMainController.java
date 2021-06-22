package com.Axsos.Update_Delete.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Axsos.Update_Delete.models.Book;
import com.Axsos.Update_Delete.services.BookService;

@Controller
public class RealMainController {
	private final BookService bookService;
	public RealMainController(BookService bookService) {
        this.bookService = bookService;
    }
	 @RequestMapping("/books/{id}")
	    public String index(Model model, @PathVariable("id") Long id) {
	        Book book = bookService.findBook(id);
	        model.addAttribute("book", book);
	        return "Index.jsp";
	    }

}
