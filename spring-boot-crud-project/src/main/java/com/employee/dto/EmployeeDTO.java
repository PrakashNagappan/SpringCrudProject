package com.employee.dto;

public class EmployeeDTO {
	
	 private int Id;
	 private String FirstName;
	 private String LastName;
	 private String Email;
	 private String Address;
	 private String Phone;
	 private String CreatedDate;
	 private String UpdatedDate;
	 private boolean IsDeleted;
	
	 public EmployeeDTO()
	 {
	 	
	 }
	 //constructor using fields
	 public EmployeeDTO(int Id, String FirstName, String LastName, String Email, String Address, String Phone) 
	 {
	 super();
	 this.Id = Id;
	 this.FirstName = FirstName;
	 this.LastName = LastName;
	 this.Email = Email;
	 this.Address = Address;
	 this.Phone = Phone;
	 }
	 
	/**
	 * @return the id
	 */
	public final int getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public final void setId(int id) {
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
	 * @return the isDeleted
	 */
	public final boolean isIsDeleted() {
		return IsDeleted;
	}
	/**
	 * @param isDeleted the isDeleted to set
	 */
	public final void setIsDeleted(boolean isDeleted) {
		IsDeleted = isDeleted;
	}

	 
}
