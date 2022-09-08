package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/getMessage")
	public String getMessage() {
		return "Hello World";
	}

	@Autowired
	private ToDoService toDoService; 
	@RequestMapping("/getList")
	public List<ToDo> getList() {
		return toDoService.getAllToDos();
	}

}
