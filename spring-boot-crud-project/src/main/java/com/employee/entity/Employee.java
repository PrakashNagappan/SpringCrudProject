package com.employee.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table( name = "employee", schema = "")
public class Employee implements Serializable{
	
	 /**
	 *  Private field that holds serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
     
	 @Id
	 @Column(name = "emp_id", nullable = false)
	 private Long Id;
	 
	 @Column(name = "first_name", nullable = false)
	 private String FirstName;
	 
	 @Column(name = "last_name", nullable = false)
	 private String LastName;
	 
	 @Column(name = "email_id")
	 private String Email;
	 
	 @Column(name = "address")
	 private String Address;
	 
	 @Column(name = "phone")
	 private String Phone;
	 
	 @Column(name = "create_date")
	 private String CreatedDate;
	 
	 @Column(name = "updated_date")
	 private String UpdatedDate;
	 
	 @Column(name = "create_user")
	 private String CreateUser;
	 
	 @Column(name = "updated_user")
	 private String UpdatedUser;

	/**
	 * @return the id
	 */
	public final Long getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public final void setId(Long id) {
		Id = id;
	}

	/**
	 * @return the firstName
	 */
	public final String getFirstName() {
		return FirstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public final void setFirstName(String firstName) {
		FirstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public final String getLastName() {
		return LastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public final void setLastName(String lastName) {
		LastName = lastName;
	}

	/**
	 * @return the email
	 */
	public final String getEmail() {
		return Email;
	}

	/**
	 * @param email the email to set
	 */
	public final void setEmail(String email) {
		Email = email;
	}

	/**
	 * @return the address
	 */
	public final String getAddress() {
		return Address;
	}

	/**
	 * @param address the address to set
	 */
	public final void setAddress(String address) {
		Address = address;
	}

	/**
	 * @return the phone
	 */
	public final String getPhone() {
		return Phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public final void setPhone(String phone) {
		Phone = phone;
	}

	/**
	 * @return the createdDate
	 */
	public final String getCreatedDate() {
		return CreatedDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public final void setCreatedDate(String createdDate) {
		CreatedDate = createdDate;
	}

	/**
	 * @return the updatedDate
	 */
	public final String getUpdatedDate() {
		return UpdatedDate;
	}

	/**
	 * @param updatedDate the updatedDate to set
	 */
	public final void setUpdatedDate(String updatedDate) {
		UpdatedDate = updatedDate;
	}

	/**
	 * @return the createUser
	 */
	public final String getCreateUser() {
		return CreateUser;
	}

	/**
	 * @param createUser the createUser to set
	 */
	public final void setCreateUser(String createUser) {
		CreateUser = createUser;
	}

	/**
	 * @return the updatedUser
	 */
	public final String getUpdatedUser() {
		return UpdatedUser;
	}

	/**
	 * @param updatedUser the updatedUser to set
	 */
	public final void setUpdatedUser(String updatedUser) {
		UpdatedUser = updatedUser;
	}
	 
		 
}
