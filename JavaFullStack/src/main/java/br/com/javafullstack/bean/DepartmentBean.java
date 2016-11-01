package br.com.javafullstack.bean;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.javafullstack.model.Department;
import br.com.javafullstack.service.DepartmentServiceImpl;

@ManagedBean
@ViewScoped
public class DepartmentBean {
	
	@Resource
	DepartmentServiceImpl departmentService;
	
	public void getDepartments() {
		this.departmentService.findAll();
	}
	
	public void create(Department dep) {
		this.departmentService.create(dep);
	}
	
	public void delete(int id) {
		this.departmentService.delete(id);
	}
	
	public void update(Department dep) {
		this.departmentService.update(dep);
	}

}
