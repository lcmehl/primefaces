package br.com.javafullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.javafullstack.model.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Integer> {

}
