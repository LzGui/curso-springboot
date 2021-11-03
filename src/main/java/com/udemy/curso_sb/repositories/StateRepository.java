package com.udemy.curso_sb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.curso_sb.domain.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
