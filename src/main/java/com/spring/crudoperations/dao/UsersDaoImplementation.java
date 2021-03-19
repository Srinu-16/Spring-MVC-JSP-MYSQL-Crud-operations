/**
 * 
 */
package com.spring.crudoperations.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.crudoperations.model.UsersModel;

/**
 * @author Srinivas Renduchinthala
 *
 */

@Component
public class UsersDaoImplementation implements UsersDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveOrUpdateUsers(UsersModel users) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(users);
		
	}

	@Override
	public UsersModel getUserById(int userId) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();
		
		return session.get(UsersModel.class, userId);
		
	}

	@Override
	public List<UsersModel> getAllUsers() {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();
		
		List<UsersModel> listOfUsers = session.createQuery("from UsersModel",UsersModel.class).list();
		
		return listOfUsers;
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();
		
		UsersModel user = session.byId(UsersModel.class).load(userId);
		
		session.delete(user);
		
	}

}
