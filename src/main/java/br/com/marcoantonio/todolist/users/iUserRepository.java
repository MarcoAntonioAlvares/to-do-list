package br.com.marcoantonio.todolist.users;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface iUserRepository extends JpaRepository<UserModel, UUID> {
    UserModel findByUsername(String username);
}
