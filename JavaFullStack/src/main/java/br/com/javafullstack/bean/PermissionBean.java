package br.com.javafullstack.bean;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.javafullstack.model.Permission;
import br.com.javafullstack.service.PermissionServiceImpl;

@ManagedBean
@ViewScoped
public class PermissionBean {
	
	@Resource
	PermissionServiceImpl permissionService;
	
	public void getDepartments() {
		this.permissionService.findAll();
	}
	
	public void create(Permission dep) {
		this.permissionService.create(dep);
	}
	
	public void delete(int id) {
		this.permissionService.delete(id);
	}
	
	public void update(Permission dep) {
		this.permissionService.update(dep);
	}
}
