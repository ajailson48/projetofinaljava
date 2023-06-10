package com.ajailsonjava.listadetarefas.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ajailsonjava.listadetarefas.entity.Task;
import com.ajailsonjava.listadetarefas.repository.TaskRepository;
import com.ajailsonjava.listadetarefas.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService{

	private TaskRepository taskRepository;
	
	public TaskServiceImpl(TaskRepository taskRepository) {
		super();
		this.taskRepository = taskRepository;
	}

	@Override
	public List<Task> getAllTasks(){
		return taskRepository.findAll();
	}

	public Task saveTask(Task task) {
		return taskRepository.save(task);
	}
	@Override	
	public Task getTaskById(Long id) {
		return taskRepository.findById(id).get();
	}
	
	public Task atualizarTask(Task task) {
		return taskRepository.save(task);
	}
}
	
