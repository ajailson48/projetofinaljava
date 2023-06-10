package com.ajailsonjava.listadetarefas.service;

import java.util.List;

import com.ajailsonjava.listadetarefas.entity.Task;

public interface TaskService {
	List<Task> getAllTasks();	

	Task saveTask(Task task);

	Task getTaskById(Long id);

	Task atualizarTask(Task task);	
}
