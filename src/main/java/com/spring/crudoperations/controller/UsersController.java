/**
 * Controller
 */
package com.spring.crudoperations.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.crudoperations.model.UsersModel;
import com.spring.crudoperations.service.UsersService;

/**
 * @author Srinivas Renduchinthala
 *
 */
@Controller
public class UsersController {

	@Autowired
	private UsersService userServiceLayer;
	
	static final String userList = "usersList";
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("Users-Form")
	public String userForm(Model model) {
		
		UsersModel users = new UsersModel();
		
		model.addAttribute(userList, users);
		
		return "usersForm";
		
	}
	
	@RequestMapping("Users-List")
	public String usersList(Model model) {
		
		List<UsersModel> usersList = userServiceLayer.getAllUsers();
		
		model.addAttribute(userList, usersList);
		
		return "usersList";
		
	}
	
	@RequestMapping("Add-User")
	public String addUser(@ModelAttribute("usersList") @Valid UsersModel users, Errors errors,HttpSession session) {
		
		if(errors.hasErrors()) {
			
			session.setAttribute("error","please Enter valid Input");
			
			return "redirect:Users-Form";
		}
		
		userServiceLayer.saveOrUpdateUsers(users);
		
		return "redirect:Users-List";
		
	}
	
	@RequestMapping("Update-User")
	public String updateUser(@RequestParam("userId") int userId,Model model) {
		
		System.out.println("Users id : "+userId);
		
		UsersModel user = userServiceLayer.getUserById(userId);
		
		model.addAttribute(userList, user);
		
		return "redirect:Users-Form";
	
	}
	
	@RequestMapping("Delete-User")
	public String deleteUser(@RequestParam("userId") int userId,Model model) {
		
		userServiceLayer.deleteUser(userId);
		
		return "redirect:Users-List";
		
	}
}
