package com.ust.producer.Repositoryp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.producer.model.Book;

@Repository
public interface RepositoryProducer extends JpaRepository<Book,Integer>{

	
	
}
