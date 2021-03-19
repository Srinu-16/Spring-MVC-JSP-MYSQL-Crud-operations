package com.spring.crudoperations.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crudoperations.dao.UsersDao;
import com.spring.crudoperations.model.UsersModel;

@Service
public class UsersServiceImplementation implements UsersService{
	
	@Autowired
	private UsersDao userDaoLayer;

	@Override
	@Transactional
	public void saveOrUpdateUsers(UsersModel users) {
		// TODO Auto-generated method stub
		userDaoLayer.saveOrUpdateUsers(users);
	}

	@Override
	@Transactional
	public UsersModel getUserById(int userId) {
		// TODO Auto-generated method stub
		return userDaoLayer.getUserById(userId);
	}

	@Override
	@Transactional
	public List<UsersModel> getAllUsers() {
		// TODO Auto-generated method stub
		return userDaoLayer.getAllUsers();
	}

	@Override
	@Transactional
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		userDaoLayer.deleteUser(userId);
	}

}
