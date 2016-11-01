package br.com.javafullstack.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import br.com.javafullstack.model.Permission;
import br.com.javafullstack.repository.PermissionRepository;

public class PermissionServiceImpl implements PermissionService {

	@Resource
	private PermissionRepository permissionRepository;
	
	@Override
    @Transactional
	public Permission create(Permission permission) {
		Permission newPermission = permission;
		return permissionRepository.save(newPermission);
	}

	@Override
    @Transactional
	public Permission delete(int id) {
		Permission deletedPermission = permissionRepository.findOne(id);
        
        if (deletedPermission == null) {
        	//throw exception;
        }
        
        permissionRepository.delete(deletedPermission);
        return deletedPermission;
		
	}

	@Override
    @Transactional
	public List<Permission> findAll() {
		permissionRepository.findAll();
		return null;
	}

	@Override
    @Transactional
	public Permission update(Permission permission) {
		Permission updatedPermission = permissionRepository.findOne(permission.getPermissionId());
        
        if (updatedPermission == null) {
        	//throw exception;
        }
         
        updatedPermission.setPermissionName(permission.getPermissionName());
        updatedPermission.setPermissionDescription(permission.getPermissionDescription());
        return updatedPermission;		
	}

	@Override
    @Transactional
	public Permission findById(int id) {
		return permissionRepository.findOne(id);
	}

}
