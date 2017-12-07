package com.coffee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffee.dao.IUserDao;
import com.coffee.entity.User;
import com.coffee.service.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao userDao;
	
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	public void deleteUser(Integer id) {
		userDao.deleteUser(id);
	}

	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	public User getUserById(Integer id) {
		return userDao.getUserById(id);
	}

	public List<User> findAllUsers() {
		return userDao.findAllUsers();
	}

}
