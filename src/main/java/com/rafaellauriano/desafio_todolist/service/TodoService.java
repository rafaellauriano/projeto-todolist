package com.rafaellauriano.desafio_todolist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.rafaellauriano.desafio_todolist.entity.Todo;
import com.rafaellauriano.desafio_todolist.repository.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository todoRepository;
	
	public List<Todo> list(){
		Sort sort = Sort.by("prioridde").descending().and(Sort.by("nome").ascending());
		return todoRepository.findAll(sort);
	}
	
	public List<Todo> creat(Todo todo){
		todoRepository.save(todo);
		return list();
	}
	
	public List<Todo> update(Todo todo){
		todoRepository.save(todo);
		return list();
	}
	
	public List<Todo> delete(Long id){
		todoRepository.deleteById(id);
		return list();
	}

}
