package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;


@Controller
public class TodoControllerJpa {

	private TodoRepository repository;

	public TodoControllerJpa(TodoRepository repository) {
		this.repository = repository;
	}
	
	@RequestMapping(value="list-todos")
	public String listAllTodos(ModelMap model) {
		
		List<Todo> todos  = repository.findByUsername(getLoggedinUsername());
		model.addAttribute("todos",todos);
		return "listTodos";
	}
	
	@RequestMapping(value="delete-todo")
	public String deleteTodo(@RequestParam int id) {
		repository.deleteById(id);
		return "redirect:list-todos";
	}
	
	@RequestMapping(value="add-todo",method=RequestMethod.GET)
	public String showNewTodoPage(ModelMap model) {
		String username = (String)model.get("name");
		Todo todo = new Todo(0,username,"",LocalDate.now().plusYears(1),false);
		model.put("todo", todo);
		return "todo";
	}
	
	@RequestMapping(value="add-todo",method=RequestMethod.POST)
	public String addNewTodo(ModelMap model,@Valid Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			return "todo";
		}
		String username = getLoggedinUsername();
		todo.setUsername(username);
		repository.save(todo);
		return "redirect:list-todos";
	}
	
	@RequestMapping(value="update-todo",method=RequestMethod.GET)
	public String showUpdateTodoPage(@RequestParam int id,ModelMap model) {
		Todo todo = repository.findById(id).get();
		model.addAttribute("todo",todo);
		return "todo";
	}
	
	@RequestMapping(value="update-todo",method=RequestMethod.POST)
	public String updateTodo(ModelMap model,@Valid Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			return "todo";
		}
		String username = getLoggedinUsername();
		todo.setUsername(username);
		repository.save(todo);
		return "redirect:list-todos";
	}
	
	private String getLoggedinUsername() {
		Authentication authentication = 
				SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
}
