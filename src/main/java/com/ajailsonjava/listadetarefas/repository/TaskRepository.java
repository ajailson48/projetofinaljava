package com.ajailsonjava.listadetarefas.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.ajailsonjava.listadetarefas.entity.Task;

public interface TaskRepository extends JpaRepositoryImplementation<Task, Long> {

}
