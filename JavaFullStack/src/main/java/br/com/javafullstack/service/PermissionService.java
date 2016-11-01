package br.com.javafullstack.service;

import java.util.List;

import br.com.javafullstack.model.Permission;

public interface PermissionService {
	
	public Permission create(Permission permission);
	
	public Permission delete(int id);
    
	public List<Permission> findAll();
    
	public Permission update(Permission permission);
    
	public Permission findById(int id);
}
