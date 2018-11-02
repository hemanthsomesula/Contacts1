package com.contacts.DTO;

public class Contact {
	private int customerId;
	private String firstName;
	private String lastName;
	private long number;
	public Contact(int customerId, String firstName, String lastName, long number) {
		
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
	}
	public Contact() {
		
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Contact [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", number="
				+ number + "]";
	}
	
	
		
	

}
