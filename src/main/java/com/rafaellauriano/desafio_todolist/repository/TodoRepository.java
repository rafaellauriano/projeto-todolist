package com.rafaellauriano.desafio_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaellauriano.desafio_todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
