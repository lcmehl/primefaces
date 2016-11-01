package br.com.javafullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.javafullstack.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
