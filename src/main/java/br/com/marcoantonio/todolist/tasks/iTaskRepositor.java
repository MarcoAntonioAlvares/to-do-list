package br.com.marcoantonio.todolist.tasks;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface iTaskRepositor extends JpaRepository<TaskModel, UUID> {
}
