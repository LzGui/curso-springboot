package com.udemy.curso_sb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.curso_sb.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
