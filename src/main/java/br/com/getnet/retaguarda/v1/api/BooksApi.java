package br.com.getnet.retaguarda.v1.api;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.getnet.retaguarda.v1.model.Book;
import br.com.getnet.retaguarda.v1.repository.BookRepository;

@RestController
@RequestMapping(path = "/api/v1/books")
public class BooksApi {
	
	@Autowired
    private BookRepository repository;
	
	@GetMapping
    public Collection<Book> listBooks() {
        return repository.findAll();
    }

}
