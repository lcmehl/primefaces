package br.com.javafullstack.service;

import java.util.List;

import br.com.javafullstack.model.User;

public interface UserService {
	
	public User create(User user);
	
	public User delete(int id);
    
	public List<User> findAll();
    
	public User update(User user);
    
	public User findById(int id);
}
