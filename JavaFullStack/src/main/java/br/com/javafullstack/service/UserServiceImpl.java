package br.com.javafullstack.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import br.com.javafullstack.model.User;
import br.com.javafullstack.repository.UserRepository;

public class UserServiceImpl implements UserService {

	@Resource
	private UserRepository userRepository;
	
	@Override
    @Transactional
	public User create(User user) {
		User newDepartment = user;
		return userRepository.save(newDepartment);
	}

	@Override
    @Transactional
	public User delete(int id) {
		User deletedUser = userRepository.findOne(id);
        
        if (deletedUser == null) {
        	//throw exception;
        }
        
        userRepository.delete(deletedUser);
        return deletedUser;
		
	}

	@Override
    @Transactional
	public List<User> findAll() {
		userRepository.findAll();
		return null;
	}

	@Override
    @Transactional
	public User update(User user) {
		User updatedUser = userRepository.findOne(user.getUserId());
        
        if (updatedUser == null) {
        	//throw exception;
        }
         
        updatedUser.setUserName(user.getUserName());
        updatedUser.setUserDescription(user.getUserDescription());
        return updatedUser;		
	}

	@Override
    @Transactional
	public User findById(int id) {
		return userRepository.findOne(id);
	}
}
