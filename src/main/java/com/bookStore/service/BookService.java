package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.Book;
import com.bookStore.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bRep;
	public void save(Book b)
	{
		bRep.save(b);
	}
	
	public List<Book> getAllBooks()
	{
		return bRep.findAll();
	}
	
	public Book getBookById(int id)
	{
		return bRep.findById(id).get();
		
	}
	
	public void deleteById(int id)
	{
	   bRep.deleteById(id);	
	}

	
}
