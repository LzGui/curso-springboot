package com.udemy.curso_sb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.curso_sb.domain.Category;
import com.udemy.curso_sb.repositories.CategoryRepository;
import com.udemy.curso_sb.services.exceptions.ObjectNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repo; 
	
	public Category search(Integer id) {
		Optional<Category> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				   "Objeto não encontrado! Id: " + id + ", Tipo: " + Category.class.getName()));
	}
}
