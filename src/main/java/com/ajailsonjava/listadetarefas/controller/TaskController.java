package com.ajailsonjava.listadetarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ajailsonjava.listadetarefas.entity.Task;
import com.ajailsonjava.listadetarefas.service.TaskService;

@Controller
public class TaskController {
	
	private TaskService taskService;

	public TaskController(TaskService taskService) {
		super();
		this.taskService = taskService;
	}
	
	// handler method to handle list tasks and return mode and view
	@GetMapping("tasks")
	public String listTasks(Model model) {
		model.addAttribute("tasks", taskService.getAllTasks());
		return "tasks";	
	}
	
	@GetMapping("/tasks/new")
	public String createTaskForm(Model model) {
		
		// create task object to hold task form data
		Task task = new Task();
		model.addAttribute("task", task);
		return "create_task";
		
	}

	@PostMapping("/tasks")
	public String saveTask(@ModelAttribute("task") Task task) {
		taskService.saveTask(task);
		return "redirect:/tasks";
		
	}

	@GetMapping("/tasks/edit/{id}")
	public String editTaskForm(PathVariable Long id, Model model) {
		model.addAttribute("task", taskService.getTaskById(id));
		return "edit_task";

	}


