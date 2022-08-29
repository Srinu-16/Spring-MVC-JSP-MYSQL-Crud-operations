/**
 * 
 */
package com.spring.crudoperations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Srinivas Renduchinthala
 *
 */

@Entity
public class UsersModel {
	
	//Validating Form Using Hibernate Validator JSR 380
	
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int userId;
	@Size(min=3,max=15,message = "FirstName size in range between 3 to 15 characters")
	@NotNull
	private String firstName;
	@Size(min=3,max=15,message = "LastName size in range between 3 to 15 characters")
	@NotNull
	private String lastName;
	@NotNull(message = "Please fill the Gender")
	private String gender;
	@Size(min=3,max=15,message = "city size in range between 3 to 15 characters")
	@NotNull
	private String city;
	//Indian Phone Number
	@NotNull
	private Long phoneNumber;
	
	/**
	 * @param userId
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param city
	 * @param phoneNumber
	 */
	
	public UsersModel() {
		/** Empty Constructor */
	}
	
	public UsersModel(int userId, String firstName, String lastName, String gender, String city, Long phoneNumber) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.city = city;
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the phoneNumber
	 */
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "UsersModel [userId=" + userId + ", firstName=" + firstName + ", LastName=" + lastName + ", gender="
				+ gender + ", city=" + city + ", phoneNumber=" + phoneNumber + "]";
	}
}
