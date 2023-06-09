package com.ust.consumer.controllerc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.consumer.modelc.Book;
import com.ust.consumer.repositoryc.RepositoryBook;

@RestController
@RequestMapping("/bookc")
public class Controllercp {

	
	@Autowired
	RepositoryBook repo;
	
	
	@GetMapping("/fetchall")
	public List<Book> getallc(){
		return repo.getallbook();
	}
	

	@GetMapping("/fetchbyid/{id}")
	public Book getallbyidc(@PathVariable int id){
		return repo.getallbyid(id);
	}
	
}
