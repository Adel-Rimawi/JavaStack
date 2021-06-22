package com.Axsos.Update_Delete.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Axsos.Update_Delete.models.Book;
import com.Axsos.Update_Delete.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	// returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    public Book updateBook(Long id, String title, String desc , String lang, Integer numOfPages) {
    	Optional<Book> b = bookRepository.findById(id);
    	if(b.isPresent()) {
    		Book book = b.get();
    		book.setNumberOfPages(numOfPages);
    		book.setDescription(desc);
    		book.setLanguage(lang);
    		book.setTitle(title);
    		bookRepository.save(book);
    		return book;
    	} else {
            return null;
        }
    	
    		
    	}
    public void deleteBook(long id) {
		Optional<Book> b = bookRepository.findById(id);
    	if(b.isPresent()) {
    		bookRepository.deleteById(id);
    	}
    	
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
	

    }
}
