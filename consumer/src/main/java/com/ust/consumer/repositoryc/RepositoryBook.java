package com.ust.consumer.repositoryc;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ust.consumer.modelc.Book;

@FeignClient(name="product")
public interface RepositoryBook {

	

	@RequestMapping(method=RequestMethod.GET ,value="bookp/getall")
	public List<Book> getallbook();

	
//	@RequestMapping(method=RequestMethod.GET ,value="bookp/getbyid/{id}")
//	public Book getallbyid(@PathVariable ("id") int id);
	//or this too we can do 
	
	@GetMapping("bookp/getbyid/{id}")
	public Book getallbyid(@PathVariable ("id") int id);
	
	
	
	
}