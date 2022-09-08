package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

	@Autowired	
	private TodoRepository todoRepository; 
	
	public List<ToDo> getAllToDos(){
		List<ToDo> todos = new ArrayList<>();
		todoRepository.findAll().forEach(todos::add);
		return todos;
	}
}
