package com.udemy.curso_sb.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.curso_sb.domain.Category;
import com.udemy.curso_sb.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Category obj = service.search(id);
		
//		Category cat1 = new Category(1, "Informática");
//		Category cat2 = new Category(2, "Escritório");
//
//		List<Category> list = new ArrayList<>();
//		list.add(cat1);
//		list.add(cat2);

		return ResponseEntity.ok().body(obj);
	}
}
