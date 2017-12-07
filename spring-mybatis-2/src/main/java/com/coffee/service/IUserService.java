package com.coffee.service;

import java.util.List;

import com.coffee.entity.User;

public interface IUserService {
	void saveUser(User user);
	void deleteUser(Integer id);
	void updateUser(User user);
	User getUserById(Integer id);
	List<User> findAllUsers();
}
