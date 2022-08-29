/**
 * Dao Layer
 */
package com.spring.crudoperations.dao;

import java.util.List;

import com.spring.crudoperations.model.UsersModel;

/**
 * @author Srinivas Renduchinthala
 *
 */

public interface UsersDao {
	
	public void saveOrUpdateUsers(UsersModel users);
	
	public UsersModel getUserById(int userId);
	
	public List<UsersModel> getAllUsers();
	
	public void deleteUser(int userId);
	
}
