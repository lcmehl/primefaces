package br.com.javafullstack.bean;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.javafullstack.model.User;
import br.com.javafullstack.service.UserServiceImpl;

@ManagedBean
@ViewScoped
public class UserBean {
	
	@Resource
	UserServiceImpl userService;
	
	public void getUsers() {
		this.userService.findAll();
	}
	
	public void create(User dep) {
		this.userService.create(dep);
	}
	
	public void delete(int id) {
		this.userService.delete(id);
	}
	
	public void update(User dep) {
		this.userService.update(dep);
	}
}
