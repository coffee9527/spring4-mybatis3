package com.coffee.dao;

import java.util.List;

import com.coffee.entity.User;

public interface IUserDao {
	/**
	 * 如果使用注解就无需mapper的xml配置文件了，但是注解方法适用于简单的sql
	 * @param user
	 */
	void saveUser(User user);
	void deleteUser(Integer id);
	void updateUser(User user);
	User getUserById(Integer id);
	List<User> findAllUsers();
}
