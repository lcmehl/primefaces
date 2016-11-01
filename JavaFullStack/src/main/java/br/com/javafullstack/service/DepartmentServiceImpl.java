package br.com.javafullstack.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.javafullstack.model.Department;
import br.com.javafullstack.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Resource
	private DepartmentRepository departmentRepository;
	
	@Override
    @Transactional
	public Department create(Department department) {
		Department newDepartment = department;
		return departmentRepository.save(newDepartment);
	}

	@Override
    @Transactional
	public Department delete(int id) {
		Department deletedDepartment = departmentRepository.findOne(id);
        
        if (deletedDepartment == null) {
        	//throw exception;
        }
        
        departmentRepository.delete(deletedDepartment);
        return deletedDepartment;
		
	}

	@Override
    @Transactional
	public List<Department> findAll() {
		departmentRepository.findAll();
		return null;
	}

	@Override
    @Transactional
	public Department update(Department department) {
		Department updatedDepartment = departmentRepository.findOne(department.getDepartmentId());
        
        if (updatedDepartment == null) {
        	//throw exception;
        }
         
        updatedDepartment.setDepartmentName(department.getDepartmentName());
        updatedDepartment.setDepartmentDescription(department.getDepartmentDescription());
        return updatedDepartment;		
	}

	@Override
    @Transactional
	public Department findById(int id) {
		return departmentRepository.findOne(id);
	}

}
