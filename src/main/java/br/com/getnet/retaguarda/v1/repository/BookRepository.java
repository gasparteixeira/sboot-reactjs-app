package br.com.getnet.retaguarda.v1.repository;

import br.com.getnet.retaguarda.v1.model.Book;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Integer> {
	List<Book> findAll();
	List<Book> findByTitle(String title);
}
