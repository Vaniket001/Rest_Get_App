package com.ashokit.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.model.Book;

@RestController
@CrossOrigin
public class BookRestController {
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBook(){
		List<Book> list=new ArrayList<Book>();
		Book book1=new Book(101,"Java","ISBN1",251.00);
		Book book2=new Book(102,"Python","ISBN2",321.00);
		Book book3=new Book(103,"Kotlin","ISBN3",231.00);
		Book book4=new Book(104,"C/C++","ISBN4",451.00);
		list.add(book1);
		list.add(book2);
		list.add(book3);
		list.add(book4);
		return new ResponseEntity<List<Book>>(list, HttpStatus.OK);
	}

}
