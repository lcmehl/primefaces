package br.com.javafullstack.service;

import java.util.List;

import br.com.javafullstack.model.Department;

public interface DepartmentService {
	
	public Department create(Department department);
	
	public Department delete(int id);
    
	public List<Department> findAll();
    
	public Department update(Department department);
    
	public Department findById(int id);
}
