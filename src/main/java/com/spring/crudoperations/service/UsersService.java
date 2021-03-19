/**
 * 
 */
package com.spring.crudoperations.service;

import java.util.List;

import com.spring.crudoperations.model.UsersModel;

/**
 * @author Srinivas Renduchinthala
 *
 */
public interface UsersService {

	public void saveOrUpdateUsers(UsersModel users);
	
	public UsersModel getUserById(int userId);
	
	public List<UsersModel> getAllUsers();
	
	public void deleteUser(int userId);
	
}
