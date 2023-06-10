package com.ajailsonjava.listadetarefas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ajailsonjava.listadetarefas.entity.Task;
import com.ajailsonjava.listadetarefas.repository.TaskRepository;

@SpringBootApplication
public class ListaDeTarefasApplication implements CommandLineRunner {
	

	public static void main(String[] args) {
		SpringApplication.run(ListaDeTarefasApplication.class, args);
	}

	/**
	 *
	 */
	@Autowired
	private TaskRepository taskRepository;
	
	public TaskRepository getTaskRepository() {
		return taskRepository;
	}

	public void setTaskRepository(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Task task1 = new Task("Matematica", "Prova", "Realizado");
		taskRepository.save(task1);

		Task task2 = new Task("Curso", "Fazendo", "Realizar");
		taskRepository.save(task2);

		Task task3 = new Task("Lazer", "A Fazer", "Realizar");
		taskRepository.save(task3);
		
		
		

	}

}
