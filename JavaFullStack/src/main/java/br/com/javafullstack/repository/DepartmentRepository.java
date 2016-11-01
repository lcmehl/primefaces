package br.com.javafullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.javafullstack.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
